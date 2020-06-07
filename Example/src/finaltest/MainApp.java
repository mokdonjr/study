package finaltest;

import finaltest.units.Firebat;
import finaltest.units.Marine;

public class MainApp {

	public static void main(String[] args) {
		// ������
		Marine marineAttacker = new Marine();
		Firebat firebatAttacker = new Firebat();
		
		// �����
		Marine defender = new Marine();
		
		// ���� ����!!
		marineAttacker.damage(defender);
		firebatAttacker.damage(defender);
		
		// ���� ���
		System.out.println(defender.getHp());
	}
}
