public class Stars {
    public static void main(String[] args) {
    	int total = 5;
    	for(int i = 1; i <= total; i++) {
    		for(int k = 1; k <= total - i; k++){
    			System.out.print(" ");
    		}
    		for( int j =1; j <= 2 * i - 1; j++) {
    			if(j ==1  || j == 2*i - 1 || i == total) {
    				System.out.print("*");
    			} else {
    			System.out.print(" ");
    			}
    	}
    		System.out.print("\n");
    	}
    }
    }