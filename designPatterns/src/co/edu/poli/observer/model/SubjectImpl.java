package co.edu.poli.observer.model;

import java.util.ArrayList;
import java.util.List;
 
public class SubjectImpl implements Subject {
     
    private List<Observer> observers;
 
    public SubjectImpl() {
    	 observers = new ArrayList<>();
	}
    
    @Override
    public void attach(Observer o) {
        observers.add(o);
    }
 
    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }
 
    @Override
    public void notifyUpdate(Integer m) {
        for(Observer o: observers) {
            o.update(m);
        }
    }
}