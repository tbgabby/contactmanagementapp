package com.travelbetacontact.contactmanagementapp.services;

import com.travelbetacontact.contactmanagementapp.contactForm.ContactForm;
import com.travelbetacontact.contactmanagementapp.converters.ContactFormToInteractions;
import com.travelbetacontact.contactmanagementapp.domain.Interactions;
import com.travelbetacontact.contactmanagementapp.repositories.InteractionsRepository;
import org.springframework.stereotype.Service;


@Service
public class InteractionsServiceImpl implements InteractionsService {
    private InteractionsRepository interactionsRepository;
    private ContactFormToInteractions contactFormToInteractions;

    public InteractionsServiceImpl(InteractionsRepository interactionsRepository, ContactFormToInteractions contactFormToInteractions) {
        this.interactionsRepository = interactionsRepository;
        this.contactFormToInteractions = contactFormToInteractions;
    }

    @Override
    public Interactions saveOrUpdate(Interactions interactions) {
        return interactionsRepository.save(interactions);
    }

    @Override
    public Interactions saveOrUpdateContactForm(ContactForm contactForm) {

        Interactions savedContact = saveOrUpdate(contactFormToInteractions.convert(contactForm));

        System.out.println("***Saved Interactions as S/N: " + savedContact.getId() + " ***");
        return savedContact;
    }

}
