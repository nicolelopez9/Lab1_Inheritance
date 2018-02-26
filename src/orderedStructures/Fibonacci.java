package orderedStructures;

public class Fibonacci extends Progression {

	private double prev; 
	
	public Fibonacci() { 
		this(1); 
		prev = 0; 
	}
	private Fibonacci(double first) {
		super(first);
	}

//Exercise 4 & Exercise 6
	public double nextValue() throws IllegalStateException{
		if(this.flag = false){
			throw new IllegalStateException("Invalid state detected. First value method not run.");
		}
		double foo = this.prev + this.current;
		this.prev = this.current;
		this.current = foo;
		
		return this.current;
	}
	
	@Override	
	public double firstValue() { 
		double value = super.firstValue(); 
		prev = 0; 
		return value; 
	}

}
