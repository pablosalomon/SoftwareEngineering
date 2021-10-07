package co.edu.poli.observer.model;

public abstract class Observer {
	
	protected Subject subject;
	public abstract void update(Integer m);

}