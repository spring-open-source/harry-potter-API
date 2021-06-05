package com.hardik.mcgonagall.controller;

import java.time.LocalDateTime;

import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.hardik.mcgonagall.utility.SortingHatUtility;

@RestController
@RequestMapping(value = "/health")
public class HealthCheckController {

	@GetMapping(value = "/sorting-hat", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public ResponseEntity<?> sortingHatHandler() {
		final var response = new JSONObject();
		response.put("House", SortingHatUtility.choose());
		response.put("timestamp", LocalDateTime.now());
		return ResponseEntity.ok(response.toString());
	}

}
