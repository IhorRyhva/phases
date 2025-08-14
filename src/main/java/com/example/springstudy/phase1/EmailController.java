package com.example.springstudy.phase1;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/phase1/")
@RequiredArgsConstructor
public class EmailController {
    private final EmailService service;

    @GetMapping("email")
    public String email(){
        service.sendEmail("Subject", "Text", "ihor.ryhva@gmail.com");
        return "hello";
    }

}
