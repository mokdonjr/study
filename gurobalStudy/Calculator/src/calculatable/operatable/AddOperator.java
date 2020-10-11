package calculatable.operatable;

public class AddOperator extends AbsOperatable {

	@Override
	public int operate(int value, int arg) {
		return value + arg;
	}

}
