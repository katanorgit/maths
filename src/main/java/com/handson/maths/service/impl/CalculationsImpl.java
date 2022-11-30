package com.handson.maths.service.impl;

import org.springframework.stereotype.Service;

import com.handson.maths.service.Calculations;

@Service
public class CalculationsImpl implements Calculations {

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return a - b;
	}

	@Override
	public int mul(int a, int b) {
		// TODO Auto-generated method stub
		return a * b;
	}

	@Override
	public int div(int a, int b) {
		// TODO Auto-generated method stub
		return a / b;
	}

}
