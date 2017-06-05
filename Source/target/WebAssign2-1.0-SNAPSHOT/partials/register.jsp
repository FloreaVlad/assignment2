<div class="container col-md-6">
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

            <div class="form-group">
                <label for="pwd">Name:</label>
                <input type="text" class="form-control" id="name" ng-model="user.name"/>
            </div>

            <button type="submit" class="btn btn-default" ng-click="registerUser(user)">Register</button>
        </form>

        <a ui-sref="login" class="btn btn-default">Cancel</a>
    </div>
</div>