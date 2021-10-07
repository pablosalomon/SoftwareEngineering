package co.edu.poli.observer.model;

public class Client {

	    public static void main(String[] args) 
	    {
	    	
	        Observer s1 = new BinaryObs();
	        Observer s2 = new OctalObs();
	        Observer s3 = new HexaObs();
	         
	        Subject p = new SubjectImpl();
	         
	        p.attach(s1);
	        p.attach(s2);
	         
	        p.notifyUpdate(7);
	         
	        p.detach(s1);
	        p.attach(s3);
	         
	        p.notifyUpdate(7);
	}
}