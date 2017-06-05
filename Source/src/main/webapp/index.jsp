<!DOCTYPE>
<html ng-app="bookApp">
<title>
    Book store
</title>
<head>
    <!--Bootstrap and jQuery CDN -->
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

    <!-- AngularJS CDN -->
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.3/angular.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.4.3/angular-route.js"></script>

    <!-- UI-Router module -->
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/angular-ui-router/0.2.15/angular-ui-router.js"></script>
</head>

<div>
    <div ui-view></div>
</div>

<!-- Route -->
<script type="text/javascript" src="${pageContext.request.contextPath}/js/app.js"></script>

<!-- Controllers -->
<script type="text/javascript" src="${pageContext.request.contextPath}/js/controllers/loginController.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/controllers/registerController.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/controllers/dashboardController.js"></script>

<!-- Services -->
<script type="text/javascript" src="${pageContext.request.contextPath}/js/services/sessionService.js"></script>

<!-- ${pageContext.request.contextPath} -->
</html>
