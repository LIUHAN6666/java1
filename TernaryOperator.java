public class TernaryOperator{
	public static void main (String[] args) {
		int a = 10;
		int b = 99;
		int result = a > b ? a++ : --b;
		//flase 则为后面，true,则为前面
		System.out.println("result=" + result);
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		int q = 345;
		int w = 834;
		int e = 14;
		//先得到两个的最大数，保存在m1,然后再求出m1和另外的最大值
		int m1 = q > w ? q : w;
		int m2 = e > m1 ? e : m1;
		System.out.println("最大数=" + m2);
	
	}
}
		