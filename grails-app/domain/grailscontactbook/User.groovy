package grailscontactbook

class User {

    String username
    String password
    boolean isAdmin

    Date dateCreated
    Date lastUpdated

    static belongsTo = [department: Department]

    static constraints = {
        username blank: false, unique: true
        password blank: false
        department nullable: true
    }
}
