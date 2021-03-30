package com.email.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.email.model.emailrequest;
import com.email.model.emailresponse;
import com.email.services.emailservice;

@RestController
@CrossOrigin
public class EmailCOntroller {
	
	@Autowired
	private emailservice emailservice;
	
	
	@PostMapping("/sendemail")
	public ResponseEntity<?> sendemail(@RequestBody emailrequest request) {
		
	boolean result=	this.emailservice.sendemail(request.getSubject(),request.getMessege(), request.getTo());
	
	if(result) {
		
		return ResponseEntity.ok(new emailresponse("Email Sent Successfully..."));
		
		
	}else {
		
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new emailresponse("Something went wrong......."));
		
	}
		
		
	}


	
	
	

}
