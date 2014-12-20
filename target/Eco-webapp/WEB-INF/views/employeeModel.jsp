<!doctype html>
<html ng-app>
<head>
	<title> Web app</title>
	<script src="//ajax.googleapis.com/ajax/libs/angularjs/1.3.5/angular.min.js"></script>
	<script src="./hello.js"></script>
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
