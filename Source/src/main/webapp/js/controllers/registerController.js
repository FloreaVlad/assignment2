(function () {
    app.controller('registerController', registerController);

    registerController.$inject = ['$scope', '$state', '$http'];

    function registerController($scope, $state, $http) {

        $scope.registerUser = function (user) {
            console.log(user);
            user.id = 0;
            user.userType = "";
            if (user.username.length > 0 && user.password.length > 7 && user.name.length > 4) {

                $http.post("/registerUser", user).then(function (response) { // Success
                    console.log(response);

                }, function () { //Error
                    console.log("Error in registerUser");
                });

                $state.go('login');
            } else {
                alert("Not enough characters.");
            }
        }
    }
})();