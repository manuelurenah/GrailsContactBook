package grailscontactbook

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class UserController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index = {}
    def create = {}
    def save = {}
    def edit = {}
    def update = {}
    def show = {}
    def list = {}
    def delete = {}

}
