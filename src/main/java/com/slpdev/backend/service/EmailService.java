package com.slpdev.backend.service;

import com.slpdev.backend.dto.ContactRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    @Autowired
    private JavaMailSender mailSender;

    public void sendMail(ContactRequest request) {

        SimpleMailMessage mail = new SimpleMailMessage();

        mail.setTo("somaypawa@gmail.com");
        mail.setSubject("New Contact Form Submission");

        mail.setText(
                "Name: " + request.getName() + "\nEmail: " + request.getEmail() + "\nMessage: " + request.getMessage());

        mailSender.send(mail);
    }
}
