package com.xamcheck.accelerate.school.app.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.xamcheck.accelerate.school.app.api.dto.ResponceDto;



@RestController
@RequestMapping("/schools")
public class SchoolAppController {
	@GetMapping("/test")
	public ResponceDto test() {
		ResponceDto responceDto=new ResponceDto();
		responceDto.setMessage("Just test the School App Ends Points");
		return responceDto;
		
	}
}
