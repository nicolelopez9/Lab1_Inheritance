package orderedStructures;

public class Arithmetic extends Progression {
	private double commonDifference; 
	
	public Arithmetic(double firstValue, double commonDifference) { 
		super(firstValue); 
		this.commonDifference = commonDifference; 
	}
	
//Exercise 6
	public double nextValue() throws IllegalStateException {
		if(this.flag = false){
			throw new IllegalStateException("Invalid state detected. First value method not run.");
		}
		current = current + commonDifference; 
		return current;
	}

//Exercise 3
	public String toString(){	
		String parameters = "";
		
		return parameters = "Arith (" + (int) this.firstValue() + ", " + (int) this.commonDifference + ")";	
	}
	
	
//Exercise 5
	public double getTerm(int n) throws IndexOutOfBoundsException { 
		double term = this.firstValue() + this.commonDifference*(n-1);
		return term;
	}
	
}
