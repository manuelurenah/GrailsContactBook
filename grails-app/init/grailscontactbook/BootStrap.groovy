package grailscontactbook

class BootStrap {

    def init = { servletContext ->
        def admin = new User(username: 'admin', password: 'admin', isAdmin: true)
        admin.save(failOnError: true)

        for (int i = 1; i <= 5; i++) {
            def dept = new Department(title: 'Department ' + i)
            def cat = new Category(title: 'Category ' + i)
            dept.save(failOnError: true)
            cat.save(failOnError: true)
        }
    }
    def destroy = {
    }
}
