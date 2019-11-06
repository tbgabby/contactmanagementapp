package com.travelbetacontact.contactmanagementapp.converters;

import com.travelbetacontact.contactmanagementapp.contactForm.ContactForm;
import com.travelbetacontact.contactmanagementapp.domain.Interactions;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;


@Component
public class ContactFormToInteractions implements Converter<ContactForm, Interactions> {

    @Override
    public Interactions convert(ContactForm contactForm) {
        Interactions interactions = new Interactions();

        if (!StringUtils.isEmpty(contactForm.getId()) && (contactForm.getId() != null)) {
            interactions.setId(contactForm.getId());
        }
            interactions.setFirstName(contactForm.getFirstName());
            interactions.setLastName(contactForm.getLastName());
            interactions.setPhoneNumber(contactForm.getPhoneNumber());
            interactions.setEmail(contactForm.getEmail());
            interactions.setPassWord(contactForm.getPassWord());
        return interactions;
    }

}