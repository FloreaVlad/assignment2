<nav class="navbar navbar-default" role="navigation">
    <div class="col-md-8">
        <form class="navbar-form" role="search">
            <div class="input-group">
                <input type="text" class="form-control" placeholder="Search for books" name="q" ng-model="bookCriteria">
                <div class="input-group-btn">
                    <button class="btn btn-default" type="submit" ng-click="searchBooks(bookCriteria)"><i
                            class="glyphicon glyphicon-search"></i></button>
                </div>
            </div>
        </form>
    </div>
</nav>

<div class="container">
    <div class="jumbotron">

        <div>MockBook</div>
        <div>
            <label> Name : </label>
            <label>MockBook</label>
        </div>
        <div>
            <label> Author : </label>
            <label>MockAuthor</label>
        </div>
        <div>
            <label> Price : </label>
            <label>MockPrice</label>
        </div>
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
</div>