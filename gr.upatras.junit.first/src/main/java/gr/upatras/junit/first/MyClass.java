package gr.upatras.junit.first;

public class MyClass {

	public  String subtract(int a, int b) {
	    int result = a - b;
	    
	    if (result > 0) {
	    	throw new IllegalArgumentException("POSITIVE");
	    }
	        return "NEGATIVE";
	    }
	}

