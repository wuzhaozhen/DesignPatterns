package example1.template.impl;

import example1.template.BankTemplateMethod;

/**
 * 具体的子类实现
 * 
 * @author wuzz
 * @date 2018年10月8日 上午11:21:43
 */
public class Transfer extends BankTemplateMethod {

	@Override
	protected void transact() {
		System.out.println("转账");
	}

}