package mum.edu.validator;

import java.util.ArrayList;
import java.util.List;

import mum.edu.domain.Calculator;


public class CalculatorValidatorImpl implements CalculatorValidator{

	@Override
	public List<String> validate(Object object) {
		List<String> errors = new ArrayList<String>();
		Calculator calculator = (Calculator)object;
		Integer add1 = calculator.getAdd1();
		Integer add2 = calculator.getAdd2();
		Integer multi1 = calculator.getMulti1();
		Integer multi2 = calculator.getMulti2();
		
		if(add1 == null ) {
			errors.add("invalied entry add1");
		}
		if(add2 == null ) {
			errors.add("invalied entry add2");
		}
		if(multi1 == null ) {
			errors.add("invalied entry multi1");
		}
		if(multi2 == null ) {
			errors.add("invalied entry multi2");
		}
		
		return errors;
	}

}
