<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html> 
<html> 
<head> 
    <meta charset="UTF-8"> 
    <meta http-equiv="X-UA-Compatible" content="IE=edge"> 
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no"> 
    <title>간단한 지도 표시하기</title> 
    <script type="text/javascript" src="https://openapi.map.naver.com/openapi/v3/maps.js?clientId=gbED0TW57lgUhXJToYXs"></script> 
</head> 
<body> 
<div id="map" style="width:100%;height:400px;"></div> 

<script> 
var mapOptions = { 
    center: new naver.maps.LatLng(37.5565851, 126.9195218), 
    zoom: 10 
}; 

var map = new naver.maps.Map('map', mapOptions); 

var position = new naver.maps.LatLng(37.5565851, 126.9195218);

var map = new naver.maps.Map('map', {
    center: position,
    zoom: 10
});

var marker = new naver.maps.Marker({
    position: position,
    map: map
});

naver.maps.Event.addListener(map, 'click', function(e) {
    marker.setPosition(e.coord);
});

var map = new naver.maps.Map("map", {
    center: new naver.maps.LatLng(37.5565851, 126.9195218),
    zoom: 11
}),
infoWindow = null;


</script> 
</body> 
</html>
