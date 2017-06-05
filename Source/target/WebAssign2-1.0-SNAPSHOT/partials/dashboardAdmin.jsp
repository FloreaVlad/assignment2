<nav class="navbar navbar-default" role="navigation">
    <div class="col-md-8">
        <ul class="nav navbar-nav">
            <li class="active"><a href="#">Home</a></li>
            <li><a ui-sref="dashboardAdmin.users">Users</a></li>
            <li><a ui-sref="dashboardAdmin.books">Books</a></li>
        </ul>
        <%--<form class="navbar-form pull-right" role="search">
            <div class="input-group">
                <input type="text" class="form-control" placeholder="Search" name="q" ng-model="bookCriteria">
                <div class="input-group-btn">
                    <button class="btn btn-default" type="submit" ng-click="searchBooks(bookCriteria)"><i
                            class="glyphicon glyphicon-search"></i></button>
                </div>
            </div>
        </form>--%>
    </div>
</nav>

<div ui-view></div>

<%--
<div class="container">
    <div class="jumbotron">
        <div ng-repeat="book in books">
            {{book}}
            {{book.price}}
            <div>
                <label> Name : </label>
                <label>{{book.name}}</label>
            </div>
            <div>
                <label> Author : </label>
                <label>{{book.author}}</label>
            </div>
            <div>
                <label> Price : </label>
                <label>{{book.price}}</label>
            </div>
        </div>
    </div>
</div>--%>
