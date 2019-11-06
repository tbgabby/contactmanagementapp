package com.travelbetacontact.contactmanagementapp.converters;

import com.travelbetacontact.contactmanagementapp.contactForm.ContactForm;
import com.travelbetacontact.contactmanagementapp.domain.Contact;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ContactToContactForm implements Converter<Contact, ContactForm> {

    @Override
    public ContactForm convert(Contact contact) {
        ContactForm contactForm = new ContactForm();
        contactForm.setId(contact.getId());
        contactForm.setFirstName(contact.getFirstName());
        contactForm.setLastName(contact.getLastName());
        contactForm.setPhoneNumber(contact.getPhoneNumber());
        contactForm.setEmail(contact.getEmail());

        return contactForm;
    }
}
