package multiinterfacetest;

public class Airplane implements Flyable, Parkable {

	@Override
	public void park() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		Parkable.super.sound();
	}

}
