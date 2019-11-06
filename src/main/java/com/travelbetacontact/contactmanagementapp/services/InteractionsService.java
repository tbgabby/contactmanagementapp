package com.travelbetacontact.contactmanagementapp.services;

import com.travelbetacontact.contactmanagementapp.contactForm.ContactForm;
import com.travelbetacontact.contactmanagementapp.domain.Interactions;


public interface InteractionsService {

    Interactions saveOrUpdate(Interactions interactions);

    Interactions saveOrUpdateContactForm(ContactForm contactForm);

}
