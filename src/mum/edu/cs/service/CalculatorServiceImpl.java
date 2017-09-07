package mum.edu.cs.service;

import mum.edu.domain.Calculator;

public class CalculatorServiceImpl implements CalculatorService{

	@Override
	public Integer add(Calculator calculator) {
		return calculator.getAdd1() + calculator.getAdd2();
	}

	@Override
	public Integer multiply(Calculator calculator) {
		return calculator.multiply();
	}
}
