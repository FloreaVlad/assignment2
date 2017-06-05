(function () {
    app.controller('loginController', loginController);

    loginController.$inject = ['$scope', '$state', '$http', 'sessionService'];

    function loginController($scope, $state, $http, sessionService) {

        $scope.loginUser = function(user){
            console.log(user);
            
            $http.post("/loginUser", user, {"Content-Type": "application/json"}).
                then(function(response){ // Success
                console.log(response);
                sessionService.setUserCredentials(response.data);

                if(response.data.userType === "USER"){
                    $state.go('dashboardUser');
                }else if(response.data.userType === "ADMIN"){
                    $state.go('dashboardAdmin');
                }
            }, function(){ //Error
                console.log("Error in loginUser");
            });

        }
    }
})();