public class Homework02 {
    public static void main(String[] args) {
    	int n = 153;
    	int n1 = n / 100;
    	int n2 = n % 100 /10;
    	int n3 = n % 10;
    	if (n1 * n1 * n1 + n2 * n2 *n2 + n3 * n3 * n3 == n) {
    		System.out.print(n + "是水仙花数");
    	} else {
    		System.out.print(n + "不是水仙花数");
    	}
    }
    }