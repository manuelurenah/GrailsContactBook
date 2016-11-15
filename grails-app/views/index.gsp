<g:applyLayout name="bootstrapTemplate">
    <content tag="body">
        <div class="jumbotron text-center">
            <h1>Welcome</h1>
            <g:if test="${session.currentUser}">
                <p>${session.currentUser.username}</p>
            </g:if>
        </div>
    </content>
</g:applyLayout>