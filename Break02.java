import java.util.Scanner;
public class Break02 {
    public static void main(String[] args) {
    	Scanner myScanner = new Scanner(System.in);
    	String name = " ";
    	String passwd = " ";
    	int chance = 3;
    	for ( int i = 1; i <= 3; i++) {
    		System.out.println("请输入名字");
    		name = myScanner.next();
    		System.out.println("请输入密码");
    		passwd = myScanner.next();
    		if ("丁真".equals(name) && "666".equals(passwd)) {
    			System.out.println("登陆成功");
    			break;
    		}
    		chance--;
    		System.out.println("你还有" + chance + "次机会");
    	}
    }
    }