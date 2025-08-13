package com.example.springstudy;

import lombok.AllArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmailService {
    private final JavaMailSender mailSender;

    public void sendEmail(String subject, String text, String... getterEmail){
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setFrom("rykhvaihor@gmail.com");
        mailMessage.setSubject(subject);
        mailMessage.setText(text);
        mailMessage.setTo(getterEmail);

        mailSender.send(mailMessage);
    }
}
