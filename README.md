# EmailServiceSpringBoot
Service developed in Spring Boot for sending emails through an endpoint.

## Email Service
<p>Email sending service with HTML support in UTF-8.</p>

## POST Send Email
[localhost:8080/api/email/send](localhost:8080/api/email/send)
<p>End-point responsible for sending the email.</p>

### Body raw (json)
```JSON
{
  "to":"mail@mail.com",
  "subject":"Assunto de teste",
  "body":"<p>parágrafo 1</p><p>parágrafo 2</p>"
}
```

## Roadmap

- [ ] Add authentication
- [ ] Add database
