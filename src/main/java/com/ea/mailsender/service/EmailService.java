package com.ea.mailsender.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import com.ea.mailsender.entity.RegistrationForm;

@Component
public class EmailService
{
    @Value("${spring.mail.username}")
    private String userMail = "";

    @Autowired
    protected JavaMailSender emailSender;

    public void sendRegistrationMail(RegistrationForm form) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(userMail);
        message.setSubject("-- COOL SUBJECT --");
        message.setText("- COOL TEXT -");
        emailSender.send(message);
    }

}
