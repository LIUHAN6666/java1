public class AutoConvert {
	public static void main (String[] args) {
		int num ='a';//char---->int
		double d1 = 80;//int----->double
		System.out.println(num);//97
		System.out.println(d1);//80.0
		byte a1 = 1;
		short a2 = 100;
		int num1 = 1;
		double num2 = 1.1;
		double num4 = a1 + a2 + num1 +num2;
		//表达式结果自动提升为操作中最大的类型
		System.out.println(num4);
		
	}
}