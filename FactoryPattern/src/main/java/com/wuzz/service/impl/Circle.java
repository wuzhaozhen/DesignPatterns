package com.wuzz.service.impl;

import org.springframework.stereotype.Service;

import com.wuzz.service.Shape;

@Service
public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
	}

}
