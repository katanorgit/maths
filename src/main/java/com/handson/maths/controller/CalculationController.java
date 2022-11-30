package com.handson.maths.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.handson.maths.model.Request;
import com.handson.maths.model.Response;
import com.handson.maths.service.Calculations;

@RestController
@RequestMapping("/calculate")
public class CalculationController {

	@Autowired
	Calculations calculations;
	
	

	@PostMapping("/add")
	public ResponseEntity<Response> getAddition(@RequestBody Request req) {
		int res = calculations.add(req.getA(), req.getB());
		Response resp = new Response();
		resp.setResult(res);
		resp.setName("Add");
		return new ResponseEntity<Response>(resp, HttpStatus.OK);
	}

	@PostMapping("/sub")
	public ResponseEntity<Response> getSubsraction(@RequestBody Request req) {
		int res = calculations.sub(req.getA(), req.getB());
		Response resp = new Response();
		resp.setResult(res);
		resp.setName("Sub");
		return new ResponseEntity<Response>(resp, HttpStatus.OK);
	}

	@PostMapping("/mul")
	public ResponseEntity<Response> getMultiplication(@RequestBody Request req) {
		int res = calculations.mul(req.getA(), req.getB());
		Response resp = new Response();
		resp.setResult(res);
		resp.setName("Mul");
		return new ResponseEntity<Response>(resp, HttpStatus.OK);
	}

	@PostMapping("/div")
	public ResponseEntity<Response> getDivision(@RequestBody Request req) {
		int res = calculations.div(req.getA(), req.getB());
		Response resp = new Response();
		resp.setResult(res);
		resp.setName("Div");
		return new ResponseEntity<Response>(resp, HttpStatus.OK);
	}
}
