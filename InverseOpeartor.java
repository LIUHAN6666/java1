public class InverseOpeartor {
	public static void main (String[] args) {
		//!是取反操作
		System.out.println(60 > 30);//T
		System.out.println(!(60>20));//F
		//a^b是逻辑异或，当a和b不同时，结果为true,相同则为false
		boolean b = (10 > 1) ^ (10 > 3);
		System.out.println("b=" + b);
	}
}