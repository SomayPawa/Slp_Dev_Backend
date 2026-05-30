package com.slpdev.backend.controller;

import com.slpdev.backend.dto.ContactRequest;
import com.slpdev.backend.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "https://slpdev.netlify.app")
public class ContactController {
    @Autowired
    private EmailService emailService;

    @PostMapping("/contact")
    public String contact(@RequestBody ContactRequest request) {

        emailService.sendMail(request);

        return "Message sent successfully";
    }
}
