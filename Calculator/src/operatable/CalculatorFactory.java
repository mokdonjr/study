package operatable;

public class CalculatorFactory {
	
	public enum CalculatorType {
		ADD,
		SUBTRACT,
		MULTIPLY,
		DIVISION,
		;
	}

	public Calculatable getCalculor(CalculatorType calculatorType) {
		Calculatable calculatable = null;
		switch (calculatorType) {
			case ADD:
				calculatable = new AddCalculator();
				break;
			case SUBTRACT:
				calculatable = new SubtractCalculator();
				break;
			case MULTIPLY:
				calculatable = new MultiplyCalculator();
				break;
			case DIVISION:
				calculatable = new DivisionCalculator();
				break;
			default:
				System.out.println("��� ������ �ν��Ͻ��� �����ϴ�.");
				break;
		}
		
		return calculatable;
	}
}
