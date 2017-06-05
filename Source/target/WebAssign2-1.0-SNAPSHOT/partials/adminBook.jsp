<form class="navbar-form row" role="search">
    <div class="input-group">
        <input type="text" class="form-control" placeholder="Search" name="q" ng-model="bookCriteria">
        <div class="input-group-btn">
            <button class="btn btn-default" type="submit" ng-click="searchBooks(bookCriteria)"><i
                    class="glyphicon glyphicon-search"></i></button>
        </div>
    </div>
</form>

<div class="container">

    <form class="row col-md-6" role="form" name="userForm">
        <label>Add book : </label>

        <div class="form-group">
            <label> Name : </label>
            <input type="text" class="form-control" ng-model="book.name"/>
        </div>
        <div class="form-group">
            <label> Author : </label>
            <input type="text" class="form-control" ng-model="book.author"/>
        </div>
        <div class="form-group">
            <label> Price : </label>
            <input type="number" min="1" class="form-control" ng-model="book.price"/>
        </div>
        <div class="form-group">
            <label> Quantity : </label>
            <input type="number" min="0" class="form-control" ng-model="book.quantity"/>
        </div>

        <button type="submit" class="btn btn-default" ng-click="addBook(book)">Add book</button>
    </form>
</div>

<div class="container row">
    <div class="jumbotron">
        <div ng-repeat="book in books">
            <div>
                <label> Name : </label>
                <input type="text" ng-model="book.name"/>
            </div>
            <div>
                <label> Author : </label>
                <input type="text" ng-model="book.author"/>
            </div>
            <div>
                <label> Price : </label>
                <input type="number" min="1" ng-model="book.price"/>
            </div>
            <div>
                <label> Quantity : </label>
                <input type="number" min="0" ng-model="book.quantity"/>
            </div>

            <button type="button" class="btn btn-default" ng-click="updateBooks(book)">Update</button>
            <button type="button" class="btn btn-default" ng-click="deleteBook(book)">Delete</button>
        </div>

        <button type="button" class="btn btn-default" ng-click="createReport()">Create report</button>

    </div>
</div>