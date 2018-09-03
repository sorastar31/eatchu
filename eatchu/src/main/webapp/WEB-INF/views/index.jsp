<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<main>
	<h1>main페이지</h1>
	<div id="map" style="width:100%;height:200px;"></div>
</main>
<script type="text/javascript" src="https://openapi.map.naver.com/openapi/v3/maps.js?clientId=gbED0TW57lgUhXJToYXs&callback=initMap"></script>
 <script type="text/javascript">
        var map = null;

        function initMap() {
            map = new naver.maps.Map('map', {
                center: new naver.maps.LatLng(37.3595704, 127.105399),
                zoom: 10
            });
        }
    </script>