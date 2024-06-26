<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<!DOCTYPE html>

<html lang="kr">
<head>
  <meta charset="utf-8">

<!-- jQuery -->
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<!-- Bootstrap CSS -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

<!-- common CSS -->
<link rel="stylesheet" href="<c:url value='/resources/common/css/common.css'/>" >

<!-- Custom styles for this template -->
<link rel="stylesheet" href="<c:url value='/resources/common/css/loginin.css'/>" >

  
  <style>
  body{padding : 0px}
  	
  	#tile_body {
  		width:100%; 
  		float:left;
  	}
  </style>
</head>

<body class="text-center">

<div id="tile_body"><tiles:insertAttribute name="tile_body" /></div>


</body>
</html>