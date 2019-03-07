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

    final String username = "email@email.com.br";
    final String password = "SenhaDoEmail";


    @Override
    public RetornoEnvio postSendEmail(Email request) {

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

            //MessageFormat  msg = new MessageFormat("<h1>This is actual message embedded in HTML tags</h1>");
            //msg.format("");



			Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("Cassi - "+ request.getSistema() + " <" + username + ">"));
			message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse(request.getPara()));
			message.setSubject(request.getAssunto());
            message.setContent(request.getConteudo(), "text/html; charset=UTF-8");

			Transport.send(message);

            System.out.println("Done");
            
            RetornoEnvio retorno = new RetornoEnvio();
            retorno.setCodigo(0);
            retorno.setMensagem("Email enviado com sucesso");

            return retorno;


		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}

        
    }


}