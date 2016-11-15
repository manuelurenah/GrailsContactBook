<!DOCTYPE html>
<html>
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title><g:layoutTitle default="Grails Contact Book"/></title>

    <asset:stylesheet src="application.css"/>
    <asset:javascript src="application.js" />

    <g:layoutHead/>

    %{--Para incluir otras recursos.--}%
    <g:pageProperty name="page.header"/>

</head>

<body>

    <div id="wrapper">
        <header id="site-header">
            <!-- Navigation -->
            <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <g:link uri="/" class="navbar-brand">Contact Book</g:link>
                </div>

                <!-- Top Menu Items -->
                <div id="navbar" class="collapse navbar-collapse">
                    <ul class="nav navbar-nav">
                        <li><g:link controller="department" action="index">Departments</g:link></li>
                        <li><g:link controller="category" action="index">Categories</g:link></li>
                        <li><g:link controller="user" action="index">Users</g:link></li>
                        <li><g:link controller="contact" action="index">Contacts</g:link></li>
                    </ul>
                </div>
            </nav>
        </header>

        <main id="site-main">
            <!-- Page Body -->
            <div class="container-fluid">
                <g:pageProperty name="page.body"/>
            </div>
            <!-- /.container-fluid -->
        </main>
        <!-- /#site-main -->

        <!-- Page Footer -->
        <footer id="site-footer">
            <div class="container-fluid">
                <p class="text-muted">
                    Luis E. Rojas &
                    Manuel E. Ureña |
                    2016 &copy All Rights Reserved
                </p>
            </div>
            <!-- /.container-fluid -->
        </footer>
        <!-- /.footer -->

    </div>
    <!-- /#wrapper -->

</body>
</html>
