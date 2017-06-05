<div class="container c">
    <div class="jumbotron">
        <form role="form" name="userForm">
            <div class="form-group">
                <label for="email">Email address:</label>
                <input type="email" class="form-control" id="email" ng-model="user.username"/>
            </div>
            <div class="form-group">
                <label for="pwd">Password:</label>
                <input type="password" class="form-control" id="pwd" ng-model="user.password"/>
            </div>
            <button type="submit" class="btn btn-default" ng-click="loginUser(user)">Submit</button>
        </form>

        <a ui-sref="register" class="btn btn-default">Register</a>
    </div>
</div>