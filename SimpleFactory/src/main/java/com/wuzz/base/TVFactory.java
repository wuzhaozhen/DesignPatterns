package com.wuzz.base;

import com.wuzz.service.TV;
import com.wuzz.service.impl.HaierTV;
import com.wuzz.service.impl.HisenseTV;

public class TVFactory {
	public static TV produceTV(String brand) throws Exception {
		if (brand.equalsIgnoreCase("Haier")) {
			System.out.println("电视机工厂生产海尔电视机！");
			return new HaierTV();
		} else if (brand.equalsIgnoreCase("Hisense")) {
			System.out.println("电视机工厂生产海信电视机！");
			return new HisenseTV();
		} else {
			throw new Exception("对不起，暂不能生产该品牌电视机！");
		}
	}
}