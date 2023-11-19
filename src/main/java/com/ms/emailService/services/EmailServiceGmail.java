package com.ms.emailService.services;

import com.ms.emailService.utils.EmailSender;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Qualifier("EmailServiceGmail")
public class EmailServiceGmail extends EmailSender implements EmailServiceInterface {

    @Value("${mail.gmail.user}")
    private String USER;

    @Value("${mail.gmail.key}")
    private String KEY;

    @Value("${mail.gmail.host}")
    private String HOST;

    @Value("${mail.gmail.port}")
    private Integer PORT;

    @Value("${mail.gmail.protocol}")
    private String PROTOCOL;

    @Value("${mail.gmail.auth}")
    private String AUTH;

    @Value("${mail.gmail.start_tls}")
    private String START_TLS;

    @Value("${mail.gmail.debug}")
    private String DEBUG;

    public void send(String to, String subject, String body) {
        super.connect(
                HOST,
                PORT,
                USER,
                KEY,
                PROTOCOL,
                AUTH,
                START_TLS,
                DEBUG
        );

        super.send(
                USER,
                to,
                subject,
                body
        );
    }
}
