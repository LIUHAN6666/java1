public class StringTobasic {
	public static void main (String[] args) {
		int n1 = 100;
		float f1 = 1.1f;
		double d1 = 4.5;
		boolean b1 = true;
		String s1 = n1 +"";
		String s2 = f1 +"";
		String s3 = d1 +"";
		String s4 = b1 +"";
		System.out.println(n1 +" " + s2 + " " + s3 + " " + s4);
		//基本数据转换成字符串
		String s5 = "123";
		int num1 = Integer.parseInt(s5);
		double num2 = Double.parseDouble(s5);
		float num3 = Float.parseFloat(s5);
		long num4 = Long.parseLong(s5);
		byte num5 = Byte.parseByte(s5);
		short num6 = Short.parseShort(s5);
		boolean num7 = Boolean.parseBoolean("true");
		//字符串换成基本数据
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
		System.out.println(num7);
		//字符串转换成字符char,把第一个字符串的字符得到
		System.out.println(s5.charAt(0));
		//得到s5字符串的第一个字符
	}
}