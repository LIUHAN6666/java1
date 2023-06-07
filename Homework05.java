public class Homework05 {
    public static void main(String[] args) {
    	double sum = 0;
    	for (double i = 1; i <= 100;i++) {
    		if( i % 2 != 0) {
    			sum = sum + (1/i);
    	} else  {
    		sum = sum - (1/i);
    	}
    	} 
    		
    	System.out.print("sum=" + sum);
    		
    	
    }
    }