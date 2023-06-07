import java.util.Scanner;
public class MulFol {
    public static void main(String[] args) {
    	Scanner myScanner = new Scanner(System.in);
    	double totalscore = 0;
    	int passnum = 0;
    	for (int i = 1; i<= 3; i++) {
    	double sum = 0;
    	for (int j = 1; j <= 5; j++) {
    		System.out.println("请输入第" + i +"个班的第" +
    	j +	"个学生的成绩");
    		double score = myScanner.nextDouble();
    		if (score >= 60) {
    			passnum++;
    		}
    		sum = sum + score  ;
    		System.out.println("成绩是=" + score); 	
    	}
    	System.out.println("sum=" + sum +
    			"平均分="+ ( sum / 5));
    	totalscore = totalscore + sum ;
    	System.out.println("三个班总分=" + totalscore +
    			"平均分" + (totalscore / 15));
    	}
    	System.out.println("及格人数=" + passnum);
  }
}