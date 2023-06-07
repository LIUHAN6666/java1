public class RecurisonExercise{
    public static void main(String[] args) {
    	R z = new R();
    	int n = 1;
    	int res = z.fibonacci(n);
    	if (res != -1) {
    	System.out.println("当n =" + n + "时对应的数=" + res);
    }   	
 }
}
class R {
	public int fibonacci  (int n) {
		if (n >= 1) {
		if (n == 1 || n == 2) {
			return 1;
		} else {
			return fibonacci (n - 1) + fibonacci(n - 2);
		}
	} else {
		System.out.println("错误，必须大于等于1的整数");
		return  -1;
	}
	}
}