package com.wuzz.controller;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.wuzz.base.BaseJunit;
import com.wuzz.service.Shape;

public class ShapeTest extends BaseJunit {
	@Autowired
	Shape circle;
	@Autowired
	Shape rectangle;

	@Test
	public void run() {
		circle.draw();
		rectangle.draw();
	}
}
