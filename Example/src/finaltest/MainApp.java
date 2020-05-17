package finaltest;

import finaltest.units.Firebat;
import finaltest.units.Marine;

public class MainApp {

	public static void main(String[] args) {
		// 공격자
		Marine marineAttacker = new Marine();
		Firebat firebatAttacker = new Firebat();
		
		// 방어자
		Marine defender = new Marine();
		
		// 전투 수행!!
		marineAttacker.damage(defender);
		firebatAttacker.damage(defender);
		
		// 전투 결과
		System.out.println(defender.getHp());
	}
}
