package grailscontactbook

class Contact {

    String firstname
    String lastname
    String email
    String telephone
    String address
    String job
    String cellphone

    static hasMany = [departments: Department]
    static belongsTo = [category: Category]

    static constraints = {
        firstname blank: false
        lastname blank: false
        email email: true, unique: true
        telephone minSize: 10, maxSize: 14
        cellphone minSize: 10, maxSize: 14
    }
}
