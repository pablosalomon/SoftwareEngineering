package co.edu.poli.observer.model;

public class BinaryObs extends Observer {


	@Override
	public void update(Integer m) {
		System.out.println(Integer.toBinaryString(m));
	}
}