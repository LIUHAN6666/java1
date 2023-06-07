import java.util.Scanner;
public class SeqSearch{
    public static void main(String[] args) {
    	Scanner  myScanner =  new Scanner(System.in);
    	String[] names = {"丁真", "坤坤" ,"凡凡" ,"宝国"};
    	System.out.println("请输入名字");
    	String findNames = myScanner.next();
    	int index = -1;
    	for(int i = 0; i < names.length; i++) {
    		if(findNames.equals(names[i])) {
    			System.out.println("恭喜找到" + findNames);
    			System.out.println("下标为" + i );
    			index = i;
    			break;
    		}
    	}
    		if( index == -1) {
        		System.out.println("sorry" );
    	        } 
    	
    }
}