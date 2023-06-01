public class IntDetail {
	public static void main (String[] args) {
		int n1 = 1;
		long n2 =1L;//long类型加l
		float num1 = 1.1f;//java的浮点型默认double型，float须加大小写f
		double num2 = .123;//0.123可以省略0
		double num3 = 5.12e2;//5.12乘10的2次方 512
		double num4 = 5.12e-2;//5.12除以10的2次方 0.0512
		double num5 = 2.23456789;
		double num6 = 2.23456789f;//double更精确
		double num7 = 2.7;
		double num8 = 8.1 / 3;//接近2.7的一个小数，进行相等判断要小心
		//应该是以两个数差的绝对值，在某个精度范围
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
		System.out.println(num7);	
		System.out.println(num8);	
		
	}
}