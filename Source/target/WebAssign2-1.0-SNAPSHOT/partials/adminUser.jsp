<form class="navbar-form row" role="search">
    <div class="input-group">
        <input type="text" class="form-control" placeholder="Search" name="q" ng-model="userCriteria">
        <div class="input-group-btn">
            <button class="btn btn-default" type="submit" ng-click="searchUsers(userCriteria)"><i
                    class="glyphicon glyphicon-search"></i></button>
        </div>
    </div>
</form>

<div class="container">

    <form class="row col-md-6" role="form" name="userForm">
        <label class="row">Create User</label>

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

        <div class="form-group">
            <label for="pwd">User type:</label>
            <input type="text" class="form-control" id="userType" placeholder="Either ADMIN or USER" ng-model="user.userType"/>
        </div>

        <button type="submit" class="btn btn-default" ng-click="registerUser(user)">Register</button>
    </form>
</div>

<div class="container row">
    <div class="jumbotron">
        <div ng-repeat="user in users">
            <div>
                <label> Username : </label>
                <input type="text" ng-model="user.username"/>
            </div>
            <div>
                <label> Password : </label>
                <input type="text" ng-model="user.password"/>
            </div>
            <div>
                <label> User type : </label>
                <input type="text" ng-model="user.userType"/>
            </div>
            <div>
                <label> Name : </label>
                <input type="text" ng-model="user.name"/>
            </div>

            <button type="button" class="btn btn-default" ng-click="updateUser(user)">Update</button>
            <button type="button" class="btn btn-default" ng-click="deleteUser(user)">Delete</button>
        </div>
    </div>
</div>