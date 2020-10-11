package core;

import calculatable.operatable.OperatorFactory;
import calculatable.operatable.OperatorFactory.OperatorType;

public class MainApp {

	public static void main(String[] args) {
		System.out.println("START CALCULATOR");
		
		OperatorFactory factory = new OperatorFactory();
		// µ¡¼À
		int resultAdd = factory.getCalculor(OperatorType.ADD).operate(10, 2);
		System.out.println("resultAdd:" + resultAdd);
		
		// »¬¼À
		int resultSubtact = factory.getCalculor(OperatorType.SUBTRACT).operate(10, 2);
		System.out.println("resultSubtact:" + resultSubtact);
		
		// °ö¼À
		int resultMultiply = factory.getCalculor(OperatorType.MULTIPLY).operate(10, 2);
		System.out.println("resultMultiply:" + resultMultiply);
		
		// ³ª´°¼À
		int resultDivision = factory.getCalculor(OperatorType.DIVISION).operate(10, 2);
		System.out.println("resultDivision:" + resultDivision);
		
		
		System.out.println("FINISH CALCULATOR");
	}
}
