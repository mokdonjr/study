package operatable;

public class SubtractCalculator extends AbsCalculatable {

	@Override
	public int operate(int value, int arg) {
		return value - arg;
	}

}