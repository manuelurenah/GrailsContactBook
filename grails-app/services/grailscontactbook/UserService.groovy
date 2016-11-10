package grailscontactbook

import grails.transaction.Transactional

@Transactional
class UserService {

    def createUser(User user) {
        user.save()
    }

    def deleteUser(User user) {
        user.delete()
    }

    def findByUsername(String username) {
        User.findByUsername(username);
    }

    def login(String username, String password) {
        User.findByUsernameAndPassword(username, password)
    }
}
