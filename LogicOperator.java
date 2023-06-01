public class LogicOperator {
	public static void main (String[] args) {
		//&&短路与 , &逻辑与
		int age = 50;
		if(age > 20 && age < 90);
		System.out.println("ok100");
		int a = 50;
		if(a > 20 & a < 90);
		System.out.println("ok200");//& &&两个都为真才会输出
		//｜｜ 短路或 , ｜ 逻辑或
		int s = 50;
		if(s > 20 || s < 30);
		System.out.println("ok100");// |,||有一个成立就会输出
		int w = 50;
		if(w > 20 & w < 90);
		System.out.println("ok200");
    }
}