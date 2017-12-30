function myMap() {
    var myCenter = new google.maps.LatLng(53.291237, -6.363015);
    var mapProp= {
        center: myCenter,
        zoom: 5
    };
    var map=new google.maps.Map(document.getElementById("googleMap"),mapProp);

    var marker = new google.maps.Marker({
      position: myCenter,
      animation:google.maps.Animation.BOUNCE
      });

marker.setMap(map);

google.maps.event.addListener(marker,'click',function() {
  map.setZoom(9);
  map.setCenter(marker.getPosition());
  });

var mapOptions = {
  disableDefaultUI: true,
    panControl: true,
    zoomControl: true,
    mapTypeControl: true,
    scaleControl: true,
    streetViewControl: true,
    overviewMapControl: true,
    rotateControl: true
}

zoomControlOptions; {
    style: google.maps.ZoomControlStyle.SMALL
}

var map = new google.maps.Map(mapCanvas, mapOptions);
  }

  function showPassword() {
    var x = document.getElementById("passwordInput");
    if (x.type === "password") {
        x.type = "text";
    } else {
        x.type = "password";
    }
} 
