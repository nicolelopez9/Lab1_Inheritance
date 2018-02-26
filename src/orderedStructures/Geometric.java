package orderedStructures;

public class Geometric extends Progression {

	private double commonFactor; 
	
	public Geometric(double firstValue, double commonFactor) { 
		super(firstValue); 
		this.commonFactor = commonFactor; 
	}
	
//Exercise 6
	public double nextValue() throws IllegalStateException {
		if(this.flag = false){
			throw new IllegalStateException("Invalid state detected. First value method not run.");
		}
		current = current * commonFactor; 
		return current;
	}

//Exercise 3
	public String toString(){	
		String parameters = "";
		
		return parameters = "Geom (" + (int) this.firstValue() + ", " + (int) this.commonFactor + ")";
		
	}
	
	
//Exercise 5
	public double getTerm(int n) throws IndexOutOfBoundsException { 
			double term = this.firstValue()*Math.pow(this.commonFactor, n-1);
			return term;
		}
	}
	