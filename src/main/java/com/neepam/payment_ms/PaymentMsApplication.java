package com.neepam.payment_ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class PaymentMsApplication {

	@RequestMapping("/")
	String home() {
		return "Hello needpam, welcome to the payment micro-service";
	}

	public static void main(String[] args) {
		SpringApplication.run(PaymentMsApplication.class, args);
	}

}
