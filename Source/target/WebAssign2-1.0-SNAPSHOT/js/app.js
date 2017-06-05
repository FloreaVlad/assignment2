var app = angular.module('bookApp', ['ngRoute', 'ui.router']);

app.config(['$routeProvider', '$stateProvider', '$urlRouterProvider', function ($routeProvider, $stateProvider, $urlRouterProvider) {

    $stateProvider.state('login', {
        url: '/login',
        templateUrl: '/partials/login.jsp',
        controller: 'loginController',
        controllerAs: 'login'
    });

    $stateProvider.state('register', {
        url: '/register',
        templateUrl: '/partials/register.jsp',
        controller: 'registerController',
        controllerAs: 'register'
    });

    $stateProvider.state('dashboardAdmin', {
        url: '/dashboardAdmin',
        templateUrl: '/partials/dashboardAdmin.jsp',
        controller: 'dashboardController',
        controllerAs: 'dashboard'
    });

    $stateProvider.state('dashboardAdmin.books', {
        url: '/books',
        templateUrl: '/partials/adminBook.jsp',
        controller: 'dashboardController',
        controllerAs: 'dashboard'
    });

    $stateProvider.state('dashboardAdmin.users', {
        url: '/users',
        templateUrl: '/partials/adminUser.jsp',
        controller: 'dashboardController',
        controllerAs: 'dashboard'
    });

    $stateProvider.state('dashboardUser', {
        url: '/dashboardUser',
        templateUrl: '/partials/dashboardUser.jsp',
        controller: 'dashboardController',
        controllerAs: 'dashboard'
    });

    $urlRouterProvider.otherwise('/login');

}]);