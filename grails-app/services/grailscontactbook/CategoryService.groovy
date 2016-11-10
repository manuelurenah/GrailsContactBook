package grailscontactbook

import grails.transaction.Transactional

@Transactional
class CategoryService {

    def createCategory(Category category) {
        category.save()
    }

    def deleteCategory(Category category) {
        category.delete()
    }
}
