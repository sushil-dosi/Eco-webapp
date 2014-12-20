<!doctype html>
<html ng-app>
<head>
	<title> Web app</title>
	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.8/angular.min.js"></script>
	<script src="./resources/js/hello.js"></script>
</head>
<body>
	<h2>Hello User!</h2>
	<div ng-controller="Hello">
		<p>The ID is {{greeting.id}}</p>
		<p>The FirstName is {{greeting.firstName}}</p>
		<p>The LastName is {{greeting.lastName}}</p>
	</div>

</body>
</html>
