public class IfExercirse {
	public static void main (String[] args) {
		double d1 = 34.5;
		double d2 = 2.6;
		if(d1 > 10.0 && d2 < 20.0) {
		System.out.println("两数和=" + (d1 + d2));
		}
		int a = 465;
		int b = 975;
		int sum = a + b;
		if(sum % 3 == 0 && sum % 5 == 0) {
		System.out.println("可以给3和5整除");
		} else {
			System.out.println("不能被整除");
		}
		int year = 2032;
		if((year % 4 == 0 && year % 100 != 0) | 
				year % 400 == 0) {
			System.out.println(year + "是闰年");
		} else {
			System.out.println(year + "不是闰年");	
		}
	}
	}