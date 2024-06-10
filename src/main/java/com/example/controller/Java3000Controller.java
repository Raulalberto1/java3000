package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Java3000Controller {

	@GetMapping("/mensaje")
	public String mensaje() {
		return "Bienvenido de Java a Azure";
	}
}
