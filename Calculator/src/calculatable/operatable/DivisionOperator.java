package calculatable.operatable;

public class DivisionOperator extends AbsOperatable {

	@Override
	public int operate(int value, int arg) {
		return value / arg;
	}

}