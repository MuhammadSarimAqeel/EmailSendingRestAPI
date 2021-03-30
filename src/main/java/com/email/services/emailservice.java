package com.email.services;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.stereotype.Service;

@Service
public class emailservice {
	
	public boolean sendemail(String subject, String messege, String to) {
		boolean f = false;
		

		String fromEmail = "sarimaqeel037@gmail.com";
		String password = "sarimsarim";
		
		
		try {
			
			Properties pr = new Properties();
			
			  pr.put("mail.smtp.host", "smtp.gmail.com");    
	          pr.put("mail.smtp.socketFactory.port", "465");    
	          pr.put("mail.smtp.socketFactory.class",    
	                    "javax.net.ssl.SSLSocketFactory");    
	          pr.put("mail.smtp.auth", "true");    
	          pr.put("mail.smtp.port", "465"); 
			
			
			
			Session session = Session.getDefaultInstance(pr, new Authenticator() {
				
				@Override
				protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
					
					return new javax.mail.PasswordAuthentication(fromEmail, password) ;
				}
				
			});
			Message msg = new MimeMessage(session);
			msg.setRecipient(Message.RecipientType.TO, new InternetAddress(to) );
			msg.setFrom(new InternetAddress(fromEmail));
			
			
			msg.setSubject(subject);
			msg.setText(messege);
			
			Transport.send(msg);
			
			f = true;
			
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		
		
		return f;
		
	}

}
