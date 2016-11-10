package grailscontactbook

class Department {

    String title

    static constraints = {
        title blank: false, minSize: 2, maxSize: 20
    }
}
