package com.handson.maths.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.handson.maths.model.Request;
import com.handson.maths.model.Response;
import com.handson.maths.service.Calculations;

@RestController
@RequestMapping("/calculate")
public class CalculationController {

	@Autowired
	Calculations calculations;
	
	

	@GetMapping("/add")
	public ResponseEntity<Response> getAddition(@RequestParam int a, @RequestParam int b) {
		int res = calculations.add(a,b);
		Response resp = new Response();
		resp.setResult(res);
		resp.setName("Add");
		return new ResponseEntity<Response>(resp, HttpStatus.OK);
	}

	@GetMapping("/sub")
	public ResponseEntity<Response> getSubsraction(@RequestParam int a, @RequestParam int b) {
		int res = calculations.sub(a,b);
		Response resp = new Response();
		resp.setResult(res);
		resp.setName("Sub");
		return new ResponseEntity<Response>(resp, HttpStatus.OK);
	}

	@GetMapping("/mul")
	public ResponseEntity<Response> getMultiplication(@RequestParam int a, @RequestParam int b) {
		int res = calculations.mul(a,b);
		Response resp = new Response();
		resp.setResult(res);
		resp.setName("Mul");
		return new ResponseEntity<Response>(resp, HttpStatus.OK);
	}

	@GetMapping("/div")
	public ResponseEntity<Response> getDivision(@RequestParam int a, @RequestParam int b) {
		int res = calculations.div(a,b);
		Response resp = new Response();
		resp.setResult(res);
		resp.setName("Div");
		return new ResponseEntity<Response>(resp, HttpStatus.OK);
	}
}
