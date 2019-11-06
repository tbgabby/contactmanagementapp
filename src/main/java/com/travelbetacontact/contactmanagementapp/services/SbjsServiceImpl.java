package com.travelbetacontact.contactmanagementapp.services;

import com.travelbetacontact.contactmanagementapp.domain.Sbjs;
import com.travelbetacontact.contactmanagementapp.repositories.SbjsRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class SbjsServiceImpl implements SbjsService {
    private SbjsRepository sbjsRepository;

    public SbjsServiceImpl(SbjsRepository sbjsRepository) {
        this.sbjsRepository = sbjsRepository;
    }

    // Save Sbjs Object...
    @Override
    public Sbjs saveOrUpdate(Sbjs sbjs) {
        return sbjsRepository.save(sbjs);
    }

}
