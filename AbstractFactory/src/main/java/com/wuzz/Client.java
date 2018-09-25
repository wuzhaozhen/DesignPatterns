package com.wuzz;

import com.wuzz.base.EFactory;
import com.wuzz.base.XMLUtil;
import com.wuzz.service.AirConditioner;
import com.wuzz.service.Television;

public class Client {
	public static void main(String args[]) {
		try {
			EFactory factory;
			Television tv;
			AirConditioner ac;
			factory = (EFactory) XMLUtil.getBean();
			tv = factory.produceTelevision();
			tv.play();
			ac = factory.produceAirConditioner();
			ac.changeTemperature();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
