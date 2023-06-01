public class ArithmeticOpearExercise02 {
	public static void main (String[] args) {
		int days = 23423;
		int weeks = days / 7;
		int leftdays = days % 7;
		System.out.println(days + "天 合" + weeks + 
				"星期零" + leftdays + "天");
		double h = 23.46;
		double c = 5.0 / 9 * (h - 100);
		System.out.println("华氏温度" + h + "对应的摄氏温度=" + c);
	}
}