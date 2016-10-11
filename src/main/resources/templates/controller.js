angular.module('demo', [])


  .controller('Login', function($scope, $http){


    $scope.checkLogin = function(userName){
      $http.get('http://localhost:8080/user/' + userName).then(function(response) {
        console.log(response);
        $scope.user = response.data;
        if($scope.user == ""){
          alert('user not found');
        }
        else {

        }
        console.log($scope.user);

    });
  }
  });
