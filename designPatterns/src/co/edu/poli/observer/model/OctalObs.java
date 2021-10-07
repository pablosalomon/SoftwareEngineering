package co.edu.poli.observer.model;

public class OctalObs extends Observer {
    
	
	@Override
	public void update(Integer m) {
		System.out.println(Integer.toOctalString(m));
	}
}