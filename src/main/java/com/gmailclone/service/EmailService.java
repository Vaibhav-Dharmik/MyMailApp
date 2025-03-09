package com.gmailclone.service;

import com.gmailclone.model.Email;
import com.gmailclone.repository.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmailService {

    @Autowired
    private EmailRepository repository;

    public List<Email> getAllEmails() {
        return repository.findAll();
    }

    public Email sendEmail(Email email) {
        return repository.save(email);
    }
}
