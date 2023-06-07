import java.util.Scanner;
public class DoWhile02 {
    public static void main(String[] args) {
    	char answer = ' ';
    	Scanner myScanner = new Scanner(System.in);
    	do {
    		System.out.println("老马使出五连鞭");
    		System.out.println("涵涵问：还钱吗？y/n");
    		answer = myScanner.next().charAt(0);
    		System.out.println("他的回答是" + answer);
    	} while (answer != 'y');
    }
    }