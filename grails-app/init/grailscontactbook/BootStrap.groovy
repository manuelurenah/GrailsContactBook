package grailscontactbook

class BootStrap {

    def init = { servletContext ->
        def admin = new User(username: 'admin', password: 'admin', isAdmin: true)
        admin.save(failOnError: true)
    }
    def destroy = {
    }
}
