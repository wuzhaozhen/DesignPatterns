package com.wuzz.base;

import com.wuzz.service.AirConditioner;
import com.wuzz.service.Television;
import com.wuzz.service.impl.HaierTelevision;
import com.wuzz.service.impl.HairAirConditioner;

public class HaierFactory implements EFactory {
	public Television produceTelevision() {
		return new HaierTelevision();
	}

	public AirConditioner produceAirConditioner() {
		return new HairAirConditioner();
	}
}