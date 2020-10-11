package generictest;

import java.util.ArrayList;
import java.util.List;

import generictest.unit.Marine;
import generictest.unit.Medic;
import generictest.unit.Unit;

public class MainApp {

	public static void main(String[] args) {
		List<Integer> integerList = new ArrayList<>();
		integerList.add(1);
		integerList.add(2);
		integerList.add(3);
//		integerList.add(3.0);
		
		List<Double> doubleList = new ArrayList<>();
		doubleList.add(0.1d);
		doubleList.add(0.2d);
		doubleList.add(0.3d);
		
		
		List<Unit> unitList = new ArrayList<Unit>();
		unitList.add(new Marine());
		unitList.add(new Marine());
		unitList.add(new Medic());
//		unitList.add(new CommandCenter());
		
	}
}
