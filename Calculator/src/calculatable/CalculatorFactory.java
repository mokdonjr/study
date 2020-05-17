package calculatable;

import calculatable.operatable.AddOperator;
import calculatable.operatable.DivisionOperator;
import calculatable.operatable.MultiplyOperator;
import calculatable.operatable.Operatable;
import calculatable.operatable.SubtractOperator;

public class CalculatorFactory {
	
	public enum CalculatorType {
		ADD,
		SUBTRACT,
		MULTIPLY,
		DIVISION,
		;
	}

	public Operatable getCalculor(CalculatorType calculatorType) {
		Operatable calculatable = null;
		switch (calculatorType) {
			case ADD:
				calculatable = new AddOperator();
				break;
			case SUBTRACT:
				calculatable = new SubtractOperator();
				break;
			case MULTIPLY:
				calculatable = new MultiplyOperator();
				break;
			case DIVISION:
				calculatable = new DivisionOperator();
				break;
			default:
				System.out.println("계산 가능한 인스턴스가 없습니다.");
				break;
		}
		
		return calculatable;
	}
}
