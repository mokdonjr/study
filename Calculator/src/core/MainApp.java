package core;

import calculatable.operatable.OperatorFactory;
import calculatable.operatable.OperatorFactory.OperatorType;

public class MainApp {

	public static void main(String[] args) {
		System.out.println("START CALCULATOR");
		
		OperatorFactory factory = new OperatorFactory();
		// ����
		int resultAdd = factory.getCalculor(OperatorType.ADD).operate(10, 2);
		System.out.println("resultAdd:" + resultAdd);
		
		// ����
		int resultSubtact = factory.getCalculor(OperatorType.SUBTRACT).operate(10, 2);
		System.out.println("resultSubtact:" + resultSubtact);
		
		// ����
		int resultMultiply = factory.getCalculor(OperatorType.MULTIPLY).operate(10, 2);
		System.out.println("resultMultiply:" + resultMultiply);
		
		// ������
		int resultDivision = factory.getCalculor(OperatorType.DIVISION).operate(10, 2);
		System.out.println("resultDivision:" + resultDivision);
		
		
		System.out.println("FINISH CALCULATOR");
	}
}
