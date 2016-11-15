package grailscontactbook

class User {

    String username
    String password
    boolean isAdmin
    Department department

    Date dateCreated
    Date lastUpdated

    static constraints = {
        username blank: false, unique: true
        password blank: false
        department nullable: true
    }
}
