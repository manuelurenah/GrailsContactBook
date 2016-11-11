package grailscontactbook

class Department {

    String title

    static hasMany = [contacts: Contact]
    static mappedBy = [contacts: 'dept'];

    static constraints = {
        title blank: false, minSize: 2, maxSize: 20
    }
}
