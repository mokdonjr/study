package operatable;

public class DivisionCalculator extends AbsCalculatable {

	@Override
	public int operate(int value, int arg) {
		return value / arg;
	}

}