package grailscontactbook

import grails.transaction.Transactional

@Transactional
class DepartmentService {

    def createDepartment(Department department) {
        department.save()
    }

    def deleteDepartment(Department department) {
        department.delete()
    }
}
