package com.cjc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.MailModel;
import com.cjc.service.MailService;
import com.sun.mail.imap.protocol.MailboxInfo;

@Controller
public class MailController {

	@Autowired
	private MailService service;
	
	
	@RequestMapping("/")
	public String landingpage() {
		
		return "index";
	}
	
	@RequestMapping("/sendpage")
	public String name() {
		
		return "sendpage";
	}
	
	
	
	@RequestMapping("/sendmail")
	@ResponseBody
	public String sendemail(@ModelAttribute MailModel model) {
		
	
		return service.sendMail(model.getFrom(),model.getTo(),model.getSub(),model.getMsg());
	
	}
}
