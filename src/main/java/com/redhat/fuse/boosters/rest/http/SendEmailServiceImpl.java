package com.redhat.fuse.boosters.rest.http;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.stereotype.Service;

@Service("sendEmailService")
public class SendEmailServiceImpl implements SendEmailService{

    final String username = "robaertlucas@gmail.com";
    final String password = "C@ssi0121senha";


    @Override
    public Email postSendEmail(Email request) {

        Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        
        Session session = Session.getInstance(props,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
          });
          
          try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("robaertlucas@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse(request.getPara()));
			message.setSubject(request.getAssunto());
			message.setText(request.getConteudo());

			Transport.send(message);

			System.out.println("Done");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}


        return null;
    }


}