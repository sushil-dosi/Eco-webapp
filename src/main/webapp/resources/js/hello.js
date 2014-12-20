	function Hello($scope, $http) {
	    $http.get('http://localhost:8081/Eco-webapp/employeesList').
	        success(function(data) {
	            $scope.greeting = data;
	        });
	}