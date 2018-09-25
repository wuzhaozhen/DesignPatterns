package com.wuzz.base;

import com.wuzz.service.TV;
import com.wuzz.service.impl.HisenseTV;

public class HisenseTVFactory implements TVFactory {
	public TV produceTV() {
		System.out.println("海信电视机工厂生产海信电视机。");
		return new HisenseTV();
	}
}