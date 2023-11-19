package com.ms.emailService.DTO;

import lombok.Getter;

@Getter
public class EmailRequest {
    private String to;
    private String subject;
    private String body;
}
