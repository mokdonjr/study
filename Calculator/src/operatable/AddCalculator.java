package operatable;

public class AddCalculator extends AbsCalculatable {

	@Override
	public int operate(int value, int arg) {
		return value + arg;
	}

}
