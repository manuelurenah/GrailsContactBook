package grailscontactbook

class Category {

    String title

    static constraints = {
        title blank: false, minSize: 3, maxSize: 20
    }
}
