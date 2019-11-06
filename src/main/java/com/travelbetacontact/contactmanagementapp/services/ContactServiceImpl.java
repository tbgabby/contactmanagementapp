package com.travelbetacontact.contactmanagementapp.services;


import com.travelbetacontact.contactmanagementapp.contactForm.ContactForm;
import com.travelbetacontact.contactmanagementapp.converters.ContactFormToContact;
import com.travelbetacontact.contactmanagementapp.domain.Contact;
import com.travelbetacontact.contactmanagementapp.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {
    private ContactRepository contactRepository;
    private ContactFormToContact contactFormToContact;

    @Autowired
    public ContactServiceImpl(ContactRepository contactRepository, ContactFormToContact contactFormToContact) {
        this.contactRepository = contactRepository;
        this.contactFormToContact = contactFormToContact;
    }


    @Override
    public List<Contact> listAll() {
        List<Contact> contacts = new ArrayList<>();
        contactRepository.findAll().forEach(contacts::add);
        return contacts;
    }

    @Override
    public Contact getById(Long id) {
        return contactRepository.findById(id).orElse(null);
    }

    @Override
    public Contact saveOrUpdate(Contact contact) {
        contactRepository.save(contact);
        return contact;
    }

    @Override
    public void delete(Long id) {
        contactRepository.deleteById(id);

    }

    @Override
    public Contact saveOrUpdateContactForm(ContactForm contactForm) {
        Contact savedContact = saveOrUpdate(contactFormToContact.convert(contactForm));

        System.out.println("***Contact Saved as S/N: " + savedContact.getId() + "\n" +
                            "FirstName: " + savedContact.getFirstName()  + "\n" +
                            "LastName: " + savedContact.getLastName()  + "\n" +
                            "PhoneNumber: " + savedContact.getPhoneNumber()  + "\n" +
                            "Email: " + savedContact.getEmail() + "\n" +
                            "Password: " + savedContact.getPassWord());

        return savedContact;
    }
}