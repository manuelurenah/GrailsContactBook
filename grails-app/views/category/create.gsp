<g:applyLayout name="bootstrapTemplate">
    <content tag="body">
        <div class="jumbotron text-center">
            <h1>New Category</h1>
        </div>

        <div id="create-category" class="content scaffold-create" role="main">
            <h1>Category Fields</h1>
            <g:if test="${flash.message}">
                <div class="message" role="status">${flash.message}</div>
            </g:if>
            <g:hasErrors bean="${this.category}">
                <ul class="errors" role="alert">
                    <g:eachError bean="${this.category}" var="error">
                        <li <g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message error="${error}"/></li>
                    </g:eachError>
                </ul>
            </g:hasErrors>
            <g:form action="save">
                <fieldset class="form">
                    <f:all bean="category"/>
                </fieldset>
                <g:submitButton name="create" class="btn btn-lg btn-success" value="Save" />
                <g:link class="btn btn-lg btn-danger" action="index">Cancel</g:link>
            </g:form>
            <br />
        </div>
    </content>
</g:applyLayout>