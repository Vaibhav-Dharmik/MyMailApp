package com.gmailclone.controller;

import com.gmailclone.model.Email;
import com.gmailclone.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/emails")
public class EmailController {

    @Autowired
    private EmailService service;

    @GetMapping
    public List<Email> getEmails() {
        return service.getAllEmails();
    }

    @PostMapping
    public Email sendEmail(@RequestBody Email email) {
        return service.sendEmail(email);
    }
}
