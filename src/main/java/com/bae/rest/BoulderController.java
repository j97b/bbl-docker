package com.bae.rest;

import com.bae.persistence.domain.Boulder;
import com.bae.service.BoulderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/boulderApp")
public class BoulderController {

	private BoulderService service;

	public BoulderController(BoulderService service) {
		this.service = service;
	}

	@GetMapping("/boulder")
	public List<Boulder> getAllBoulders() {
		return service.getAllBoulders();
	}

	@PostMapping("/boulder")
	public Boulder addBoulder(@RequestBody Boulder newBoulder) {
		return service.addBoulder(newBoulder);
	}

	@DeleteMapping("/boulder/{boulderId}")
	public String deleteBoulder(@PathVariable(value = "boulderId") Long boulderId) {
		return service.deleteBoulder(boulderId);
	}

	@PutMapping("/boulder/{boulderId}")
	public Boulder updateBoulder(@RequestBody Boulder boulder, @PathVariable(value = "boulderId") Long boulderId) {
		return service.updateBoulder(boulder, boulderId);
	}

}
