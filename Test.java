import java.util.Scanner;
public class Test {
	public static void main (String[] args) {
		Scanner myScanner = new Scanner(System.in);	
		System.out.println("请输入月份");
	int month = myScanner.nextInt();
if(month < 0 || month > 12) {
	System.out.println("输入错误");
}
    else if(month >= 4 && month <= 10) {
			System.out.println("请输入年龄");
			int age = myScanner.nextInt();
			if(age >=18 && age <=60) {
				System.out.println("60");
			  } if (age < 18) {
				System.out.println("半价");
			  }if (age > 60) {
			    System.out.println("1/3");  
			  }
	    } else {
		  System.out.println("请输入年龄");
	             }
	        int age = myScanner.nextInt();
	        if(age >18 || age <60) {
				System.out.println("40");
	          }    else {
	            System.out.println("20");  
	          }
	  }
	}		
	