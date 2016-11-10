package grailscontactbook

class UserController {

    def index() {
        render User.findByUsername("admin").username;
    }
}
