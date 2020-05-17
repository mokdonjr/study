package core;

import calculatable.CalculatorFactory;
import calculatable.CalculatorFactory.CalculatorType;

public class MainApp {

	public static void main(String[] args) {
		System.out.println("START CALCULATOR");
		
		CalculatorFactory factory = new CalculatorFactory();
		// µ¡¼À
		int resultAdd = factory.getCalculor(CalculatorType.ADD).operate(10, 2);
		System.out.println("resultAdd:" + resultAdd);
		
		// »¬¼À
		int resultSubtact = factory.getCalculor(CalculatorType.SUBTRACT).operate(10, 2);
		System.out.println("resultSubtact:" + resultSubtact);
		
		// °ö¼À
		int resultMultiply = factory.getCalculor(CalculatorType.MULTIPLY).operate(10, 2);
		System.out.println("resultMultiply:" + resultMultiply);
		
		// ³ª´°¼À
		int resultDivision = factory.getCalculor(CalculatorType.DIVISION).operate(10, 2);
		System.out.println("resultDivision:" + resultDivision);
		
		
		System.out.println("FINISH CALCULATOR");
	}
}
