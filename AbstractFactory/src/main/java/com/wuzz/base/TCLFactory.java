package com.wuzz.base;

import com.wuzz.service.AirConditioner;
import com.wuzz.service.Television;
import com.wuzz.service.impl.TCLAirConditioner;
import com.wuzz.service.impl.TCLTelevision;

public class TCLFactory implements EFactory {
	public Television produceTelevision() {
		return new TCLTelevision();
	}

	public AirConditioner produceAirConditioner() {
		return new TCLAirConditioner();
	}
}