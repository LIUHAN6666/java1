public class Recursion{
    public static void main(String[] args) {
 	T t = new T();
 	t.test(4);
 	T t1 = new T();
 	int s = t1.factorial(5);
 	System.out.println("s=" + s);
    }
    }
class T {
	public void test (int n) {
		if (n > 2) {
			test (n - 1);
		}
		System.out.println("n=" + n);
	}
	public int factorial (int n) {
		if (n == 1) {
			return 1;
		} else {
			return factorial (n - 1) * n;
		}
	}
}