public class For {
    public static void main(String[] args) {
    	int cont = 0;
    	int sumt = 0;
    	int start = 1;
    	int end = 100;
    	int t = 9;
    	for( int i = start; i <= end; i++) {
    		if (i % t == 0) {
    		System.out.println("i=" + i);
    		cont++;
    		sumt = sumt + i;
    	}
    	}
    	System.out.println("cont=" + cont);
    	System.out.println("sumt=" + sumt);
    	
    	
    	int e = 7;
    	for( int q = 2; q <= e; q++) {	
    		System.out.println(q + "+" + (e-q)+ "=7");
    	}
    			
    }  
    }