public class MethodParameter {
    public static void main(String[] args) {
    	int a = 10;
    	int b = 20;
    Z obj = new Z();
    	obj.swap (a,b);
    	System.out.println("a=" + a + "b=" + b);
    }
}
class Z {
	public void swap (int a,int b) {
		System.out.println("====" + "a=" + a + "\tb=" + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("a=" + a + "\tb=" + b);
	}
}