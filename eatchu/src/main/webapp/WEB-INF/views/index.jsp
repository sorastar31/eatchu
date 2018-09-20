<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<style>
main {
	position: relative;
	top: 80px;
}
</style>
<main>
<div id="map" style="width: 100%; height: 200px;"></div>
</main>

<script type="text/javascript"
	src="https://openapi.map.naver.com/openapi/v3/maps.js?clientId=gbED0TW57lgUhXJToYXs"></script>
<script type="text/javascript">
	//학원 위치 : 37.5565051 , 126.9195858 
	var lat = 37.5565051;
	var lng = 126.9195858;

	/* 	if ("geolocation" in navigator) {
	 navigator.geolocation.getCurrentPosition(function(position) {
	 lat = position.coords.latitude;
	 lng = position.coords.longitude;
	 });
	 } */

	var map = new naver.maps.Map(document.getElementById('map'), {
		center : new naver.maps.LatLng(lat, lng),
		zoom : 10,
		logoControl : false,
		scaleControl : false,
		mapDataControl : false
	});
	var marker = new naver.maps.Marker({
		position : new naver.maps.LatLng(lat, lng),
		map : map,
		icon : {
			url : '/resources/images/pink-dot.gif',
			origin : new naver.maps.Point(0, 0)
		}
	});

	var latlngs = [ new naver.maps.LatLng(37.5553210, 126.9178290),
			new naver.maps.LatLng(37.5549876, 126.9199015),
			new naver.maps.LatLng(37.5593469, 126.9212250),
			new naver.maps.LatLng(37.5543770, 126.9209250),
			new naver.maps.LatLng(37.5554624, 126.9162571), ];

	var markerList = [];

	for (var i = 0, ii = latlngs.length; i < ii; i++) {
		var icon = {
			url : '/resources/images/markers.png',
			size : new naver.maps.Size(28, 46),
			anchor : new naver.maps.Point(14, 46),
			origin : new naver.maps.Point(i * 28, 0)
		}, marker = new naver.maps.Marker({
			position : latlngs[i],
			map : map,
			icon : icon,
			animation: naver.maps.Animation.DROP
		});

		marker.set('seq', i);

		markerList.push(marker);

		marker.addListener('click', onMouseClick);

		icon = null;
		marker = null;
	}

	function onMouseClick(e) {
		var marker = e.overlay, seq = marker.get('seq');

		marker.setIcon({
			url : '/resources/images/markers-select.png',
			size : new naver.maps.Size(28, 46),
			anchor : new naver.maps.Point(14, 46),
			origin : new naver.maps.Point(seq * 28, 0)
		});
	}
</script>