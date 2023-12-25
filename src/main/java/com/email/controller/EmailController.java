package com.email.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.email.dto.EmailDTO;
import com.email.service.EmailService;

@CrossOrigin
@RestController
public class EmailController {

	@Autowired
	private EmailService emailService;

	@PostMapping
	@RequestMapping(value = "/sendemail")
	public ResponseEntity<?> senEmail(@RequestBody EmailDTO emailDto) {

		System.out.println(emailDto);
		return emailService.sendEmail(emailDto.getSubject(), emailDto.getText(), emailDto.getTo());
	}

}
