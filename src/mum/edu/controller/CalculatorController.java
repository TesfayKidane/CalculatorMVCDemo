package mum.edu.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mum.edu.cs.service.CalculatorService;
import mum.edu.validator.CalculatorValidator;
import mum.edu.domain.Calculator;
import mum.edu.framework.annotation.AutoWired;
import mum.edu.framework.annotation.Controller;
import mum.edu.framework.annotation.RequestMapping;

@Controller
public class CalculatorController {

	@AutoWired
	private CalculatorService calculatorServiceImpl;
	
	@AutoWired
	private CalculatorValidator calculatorValidator;
	
	@RequestMapping(value = { "/", "/calculator" })
	public String getCalculator(HttpServletRequest request, HttpServletResponse response) {
		return "/WEB-INF/jsp/calculator.jsp";
	}
	
	@RequestMapping(value="/calculate")
	public String postCalculate(Calculator calculator, HttpServletRequest request, HttpServletResponse response) {
		List<String> errors = calculatorValidator.validate(calculator);
		if(errors.isEmpty()) {
			calculator.setSum(calculatorServiceImpl.add(calculator));
			calculator.setProduct(calculatorServiceImpl.multiply(calculator));
			request.setAttribute("calculator", calculator);
			return "/WEB-INF/jsp/result.jsp";
		}
		else {
			request.setAttribute("errors", errors);
			request.setAttribute("form", calculator);
			return  "/WEB-INF/jsp/calculator.jsp";
		}
	}
}
