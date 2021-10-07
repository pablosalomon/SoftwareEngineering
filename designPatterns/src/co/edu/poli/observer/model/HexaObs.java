package co.edu.poli.observer.model;

public class HexaObs extends Observer {
	
	
	@Override
	public void update(Integer m) {
		System.out.println(Integer.toHexString(m));
	}
}
