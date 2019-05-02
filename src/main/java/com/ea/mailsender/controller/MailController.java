package com.ea.mailsender.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ea.mailsender.entity.RegistrationForm;
import com.ea.mailsender.service.EmailService;

@RestController
public class MailController
{
    @Autowired
    private EmailService emailService;

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/mail", method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public void sendEmail(RegistrationForm form)
    {
        emailService.sendRegistrationMail(form);
    }
}
