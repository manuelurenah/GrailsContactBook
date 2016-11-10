package grailscontactbook

class User {

    String username
    String password
    boolean isAdmin

    static belongsTo = [department: Department]

    static constraints = {
        username blank: false
        password blank: false
        department nullable: true
    }
}
