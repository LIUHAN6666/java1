public class DoWhile01 {
    public static void main(String[] args) {
    	int count = 0;
    	int i = 1;
    	do {
    		if( i % 5 == 0 && i % 3 != 0) {
    		System.out.println("i=" + i);
    		count++;
    		}
    		i++;
    	} while ( i <= 100);
    	System.out.println("count=" + count);
    }
}