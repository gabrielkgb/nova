package com.senacniteroi.delivery3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senacniteroi.delivery3.model.Delivery;
import com.senacniteroi.delivery3.repository.DeliveryRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/delivery")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DeliveryController {

	@Autowired
	private DeliveryRepository deliveryRepository;
	

@GetMapping()
public ResponseEntity<List<Delivery>> getAll(){
	//return "TESTE";
	return ResponseEntity.ok(deliveryRepository.findAll());

}

@PostMapping
public ResponseEntity<Delivery> post(@Valid @RequestBody Delivery delivery){
	return ResponseEntity.status(HttpStatus.CREATED)
			.body(deliveryRepository.save(delivery));
	
}

/*
	
	@GetMapping
	public String getAll() {
		return "Test";
	}
	*/
}
