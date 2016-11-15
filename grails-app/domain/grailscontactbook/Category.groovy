package grailscontactbook

class Category {

    String title

    Date dateCreated
    Date lastUpdated

    static constraints = {
        title blank: false, minSize: 3, maxSize: 20
    }
}
