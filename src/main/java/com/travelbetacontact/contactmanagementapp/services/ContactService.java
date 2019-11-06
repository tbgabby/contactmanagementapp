package com.travelbetacontact.contactmanagementapp.services;

import com.travelbetacontact.contactmanagementapp.contactForm.ContactForm;
import com.travelbetacontact.contactmanagementapp.domain.Contact;

import java.util.List;

public interface ContactService {

    List<Contact> listAll();

    Contact getById(Long id);

    Contact saveOrUpdate(Contact contact);

    void delete(Long id);

    Contact saveOrUpdateContactForm(ContactForm contactForm);

}


