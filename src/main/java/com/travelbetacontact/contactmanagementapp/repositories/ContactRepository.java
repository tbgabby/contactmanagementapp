package com.travelbetacontact.contactmanagementapp.repositories;

import com.travelbetacontact.contactmanagementapp.domain.Contact;
import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<Contact, Long> {
}
