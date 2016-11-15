package grailscontactbook

class Contact {

    String firstname
    String lastname
    String email
    String telephone
    String address
    String job
    String cellphone
    Category category

    Date dateCreated
    Date lastUpdated

    static hasMany = [departments: Department]
    static belongsTo = [dept: Department]

    static constraints = {
        firstname blank: false
        lastname blank: false
        email email: true, unique: true
        telephone minSize: 10, maxSize: 14
        cellphone minSize: 10, maxSize: 14
        address nullable: true
        job nullable: true
        dept nullable: true
    }
}
