package com.wuzz.service.impl;

import org.springframework.stereotype.Service;

import com.wuzz.service.Shape;

@Service
public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}

}
