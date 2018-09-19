package com.wuzz.service.impl;

import org.springframework.stereotype.Service;

import com.wuzz.service.Shape;

@Service
public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}

}
