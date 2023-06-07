public class Break {
    public static void main(String[] args) {
    int sum = 0;
    int n = 0;
    	for(int i = 1; i <= 100; i++) {
    		sum = sum + i;
    		if(sum > 20) {
    			System.out.print("和>20" + "\t");
    			n = i;
    			break;
    		}
    	}
    	System.out.print( "当前数" + n );
    	
    }
 }