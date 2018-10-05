package com.eatchu.web.controller.customer;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eatchu.web.service.AccountService;

@Controller
@RequestMapping("/customer/")
public class CustomerController {
	
	@Autowired
	private JavaMailSender mailSender;
	@Autowired
	private AccountService accountService;
	
	@GetMapping("signup")
	public String signup() {
		return "customer.signup";
	}
	
	@GetMapping("signup-email")
	public String signupEmail() {
		return "customer.signup-email";
	}
	
	@PostMapping("join-email")
	public String joinEmail(String email, HttpServletResponse response) {
		
		boolean duplicated = accountService.isEmailDuplicated(email);
		
		if(duplicated)
			return "redirect:email-duplicated-error";
		/*-----------------------------------------------------------------*/
		UUID uuid = UUID.randomUUID();
		MessageDigest salt = null;
		String digest = null;
		
		try {
			salt = MessageDigest.getInstance("SHA-256");
			salt.update(uuid.toString().getBytes());
			
			byte[] key = salt.digest();
			StringBuilder builder = new StringBuilder();
			for(byte b : key) {
				builder.append(String.format("%02x", b));
			}
			digest = builder.toString();
			
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(digest);
		
		
		MimeMessage message = mailSender.createMimeMessage();
		MimeMessageHelper helper;
		try {
			helper = new MimeMessageHelper(message, true, "UTF-8");
			helper.setFrom("noreply@eatchu.com");
			helper.setTo(email);
			helper.setSubject("내말맛집 회원가입을 위한 인증메일");
			helper.setText("<a href=\"http://211.238.142.37:8080/customer/signup?id="+digest+"&em="+email+"\">가입링크</a>", true);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Cookie cookie = new Cookie("joinId", digest);
		cookie.setPath("/customer/");
		cookie.setMaxAge(60*60*24);
		
		response.addCookie(cookie);
		
		mailSender.send(message);
		
		return "customer.signup-email-info";
	}
	
	@GetMapping("login")
	public String login() {
		return "customer.login";
	}
	
	@GetMapping("memberDetail")
	public String memberDetail() {
		return "customer.memberDetail";
	}
	
	@GetMapping("recommend")
	public String recommend() {
		return "customer.recommend";
	}
	
	@GetMapping("friend")
	public String friend() {
		return "customer.friend";
	}
}
