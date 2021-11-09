package co.edu.poli.testing.model;

public class Function {
	
	public int facto (int n) {
		
		assert n>=1 && n<=10: String.format("No cumple precondicion");
		
		int f=1;
		
		assert f==1 : String.format("1");
		
		int i=1;
		
		assert i==1 : String.format("2");
		
		while (i<=n) { 
			f*=i;
			i+=1;
		}
		
		assert i>n : String.format("3");
		
		assert f==1 || f==120 || f==720 || f==3628800  : String.format("No cumple poscondicion");
		
		return f;
	
	}
	
	

}
