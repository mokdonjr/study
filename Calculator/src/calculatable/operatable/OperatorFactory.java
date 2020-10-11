package calculatable.operatable;

public class OperatorFactory {
	
	public enum OperatorType {
		ADD,
		SUBTRACT,
		MULTIPLY,
		DIVISION,
		;
	}
	
	private AddOperator addOperator;
	private SubtractOperator subtractOperator;
	private MultiplyOperator multiplyOperator;
	private DivisionOperator divisionOperator;
	
	public OperatorFactory() {
		this.addOperator = new AddOperator();
		this.subtractOperator = new SubtractOperator();
		this.multiplyOperator = new MultiplyOperator();
		this.divisionOperator = new DivisionOperator();
	}

	public Operatable getCalculor(OperatorType calculatorType) {
		Operatable calculatable = null;
		switch (calculatorType) {
			case ADD:
				calculatable = this.addOperator;
				break;
			case SUBTRACT:
				calculatable = this.subtractOperator;
				break;
			case MULTIPLY:
				calculatable = this.multiplyOperator;
				break;
			case DIVISION:
				calculatable = this.divisionOperator;
				break;
			default:
				System.out.println("계산 가능한 인스턴스가 없습니다.");
				break;
		}
		
		return calculatable;
	}

	public AddOperator getAddOperator() {
		return addOperator;
	}

	public void setAddOperator(AddOperator addOperator) {
		this.addOperator = addOperator;
	}

	public SubtractOperator getSubtractOperator() {
		return subtractOperator;
	}

	public void setSubtractOperator(SubtractOperator subtractOperator) {
		this.subtractOperator = subtractOperator;
	}

	public MultiplyOperator getMultiplyOperator() {
		return multiplyOperator;
	}

	public void setMultiplyOperator(MultiplyOperator multiplyOperator) {
		this.multiplyOperator = multiplyOperator;
	}

	public DivisionOperator getDivisionOperator() {
		return divisionOperator;
	}

	public void setDivisionOperator(DivisionOperator divisionOperator) {
		this.divisionOperator = divisionOperator;
	}
	
	
}
