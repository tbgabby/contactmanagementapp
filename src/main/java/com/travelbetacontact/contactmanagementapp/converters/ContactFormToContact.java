package com.travelbetacontact.contactmanagementapp.converters;

import com.travelbetacontact.contactmanagementapp.contactForm.ContactForm;
import com.travelbetacontact.contactmanagementapp.domain.Contact;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class ContactFormToContact implements Converter<ContactForm, Contact> {

    @Override
    public Contact convert(ContactForm contactForm) {
        Contact contact = new Contact();

        if (contactForm.getId() != null  && !StringUtils.isEmpty(contactForm.getId())) {
            contact.setId(contactForm.getId());
        }

        contact.setFirstName(contactForm.getFirstName());
        contact.setLastName(contactForm.getLastName());
        contact.setPhoneNumber(contactForm.getPhoneNumber());
        contact.setEmail(contactForm.getEmail());
//        contact.setPassWord(contactForm.getPassWord());

        return contact;
    }

}

