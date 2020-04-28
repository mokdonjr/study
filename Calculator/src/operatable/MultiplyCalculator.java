package operatable;

public class MultiplyCalculator extends AbsCalculatable {

	@Override
	public int operate(int value, int arg) {
		return value * arg;
	}

}