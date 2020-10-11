package calculatable.operatable;

public class MultiplyOperator extends AbsOperatable {

	@Override
	public int operate(int value, int arg) {
		return value * arg;
	}

}