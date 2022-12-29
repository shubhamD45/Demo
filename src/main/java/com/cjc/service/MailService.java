package com.cjc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {
	
	@Autowired
	private JavaMailSender sender;

	public String sendMail(String from,String to, String sub, String msg) {
		
		
		
		SimpleMailMessage mail = new SimpleMailMessage();
		
		mail.setFrom(from);
		mail.setSubject(sub);
		mail.setTo(to);
		mail.setText(msg);
		
		sender.send(mail);
		return "Mail sent successfully to :"+ to;
	}
}
