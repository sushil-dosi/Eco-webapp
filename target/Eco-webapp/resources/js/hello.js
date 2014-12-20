	function Hello($scope, $http) {
	    $http.get('http://localhost:8081/Eco-webapp/employees').
	        success(function(data) {
	            $scope.greeting = data;
	        });
	}