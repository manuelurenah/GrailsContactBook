package grailscontactbook

import org.springframework.validation.BindingResult

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

class ContactController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index = {
        redirect action: "list"
    }
    def create = {}

    def save = {
        def contact = new Contact(firstname: params.firstname, lastname: params.lastname, email: params.email,
                telephone: params.telephone, cellphone: params.cellphone)
        contact.save flush: true, failOnError: true
        redirect action: "show", id: contact.id
    }

    def edit = {
        def contact = Contact.get(params.id)
        [contact: contact]
    }

    def update = {
        def contact = Contact.get(params.id)
        contact.properties = params as BindingResult
        contact.save flush: true, failOnError: true
        redirect action: "show", id: params.id
    }

    def show = {
        def contact = Contact.get(params.id)
        [contact: contact]
    }

    def list = {
        def contacts = Contact.list()
        [contacts: contacts]
    }

    def delete = {
        def contact = Contact.get(params.id)
        contact.delete flush: true, failOnError: true
        redirect action: "index"
    }

}
