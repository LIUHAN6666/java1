public class ArithmeticOperator {
	public static void main (String[] args) {
		System.out.println(10 / 4);//java中是2
		double d = 10 / 4;//值是2.0
		System.out.println(d);
		System.out.println(10 % 3);//1
		System.out.println(-10 % 3);//-1
		System.out.println(10 % -3);//1     a % b = a - a/ b * b
		System.out.println(-10 % -3);//-1
		int i = 10;
		i++;  //i = i + 1
		++i;  //i = i + 1
		System.out.println("i=" + i);//12
		int j = 8;
		int k = ++j;// j=j+1;k=j;
		System.out.println("k=" + k + "j=" + j);// 9  9
		int q = 1;
		q = q++;
		System.out.println(q);//1
		int w = 1;
		w = ++w;
		System.out.println(w);
	}
}