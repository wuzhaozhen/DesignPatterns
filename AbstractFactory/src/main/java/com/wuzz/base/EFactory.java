package com.wuzz.base;

import com.wuzz.service.AirConditioner;
import com.wuzz.service.Television;

public interface EFactory {
	public Television produceTelevision();

	public AirConditioner produceAirConditioner();
}