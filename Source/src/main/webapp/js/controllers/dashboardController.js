(function () {
    app.controller('dashboardController', dashboardController);

    dashboardController.$inject = ['$scope', '$http', '$state'];

    function dashboardController($scope, $http, $state) {

        //Search

        $scope.searchBooks = function (bookCriteria) {
            $http.post("/searchBooks", bookCriteria).then(function(response){ //Success
                console.log(response.data);
                $scope.books = response.data;
            }, function (){ //Error
                console.log("Error in searchBooks");
            });
        };

        $scope.searchUsers = function(userCriteria){
            $http.post("/searchUsers", userCriteria).
                then(function success(response){
                    $scope.users = response.data;
            })
        };

        //Update

        $scope.updateBooks = function(book){

            if(book.quantity < 0 || book.price < 0){
                alert("Number must be greater than zero");
            }

            $http.post("/updateBook", book).
                then(function success(response){

            }, function error(){
                console.log("Error in update books");
            });
        };

        $scope.updateUser = function(user){
            $http.post("/updateUser", user).
            then(function success(response){

            }, function error(){
                console.log("Error in update books");
            });
        };

        //Delete

        $scope.deleteBook = function(book){
            $http.post("/deleteBook", book).
                then(function (response) {
                $state.go($state.current, {}, {reload: true});
            }, function () {
                console.log("Error in delete book");
            });
        };

        $scope.deleteUser = function(user) {
            $http.post("/deleteUser", user).
            then(function (response) {
                $state.go($state.current, {}, {reload: true});
            }, function () {
                console.log("Error in delete user");
            });
        };

        //Create
        $scope.registerUser = function (user) {
            console.log(user);
            if (user.username.length > 0 && user.password.length > 7 && user.name.length > 4 && (user.userType === "ADMIN" || user.userType === "USER")) {

                $http.post("/registerUserOrAdmin", user, {"Content-Type": "application/json"}).then(function (response) { // Success
                    console.log(response);
                    user.username = "";
                    user.password = "";
                    user.name = "";
                    user.userType = "";
                }, function () { //Error
                    console.log("Error in registerUser");
                });
            } else {
                alert("Not enough characters.");
            }
        };

        $scope.addBook = function (book) {
            console.log(book);
            if (book.name.length > 7 && book.author.length > 7) {
                $http.post("/addBook", book).then(function (response){

                }, function(){

                });
            } else {
                alert("Not enough characters.");
            }
        };

        //Create report - CSV
        $scope.createReport = function (){
            $http.get("/createReport").then(function success(response){
                
            });
        };
    }
})();