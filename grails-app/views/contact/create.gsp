<html>
<head>
    <title>Create new contact</title>
</head>

<body>
<h1>Create new contact</h1>
    <g:form action="save">
        First Name: <g:textField name="firstname"/><br/>
        Last Name: <g:textField name="lastname"/><br/>
        E-mail: <g:textField name="email"/><br/>
        Telephone: <g:textField name="telephone"/><br/>
        Telephone: <g:textField name="cellphone"/><br/>
        <g:actionSubmit value="Save"/>
    </g:form>
</body>
</html>