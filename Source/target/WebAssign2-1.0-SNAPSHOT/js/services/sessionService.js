app.factory('sessionService', function($http) {

    var userCredentials;
    var Session = {};
    
    Session.setUserCredentials = function(user){
        userCredentials = user;
    };

    Session.getUserCredentials = function(user){
        return userCredentials;
    };
    return Session;
});