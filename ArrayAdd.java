import java.util.Scanner;
public class ArrayAdd{
    public static void main(String[] args) {
    	Scanner  myScanner =  new Scanner(System.in);
    	int[] arr = {1, 2, 3};
    	do {
    	int[] arrnew = new int[arr.length + 1];
    	
    	 for(int i = 0; i < arr.length; i++) {
    		 arrnew[i] = arr[i];
    		
    	 }
    	 System.out.println("请输入你要添加的元素");
    	 int addnum = myScanner.nextInt();
    	 arrnew[arrnew.length - 1] = addnum;
    	 arr = arrnew;
    	 for(int i = 0; i < arr.length ; i++) {
    	 System.out.print( arr[i] + "\t");
    	 }
    	 System.out.println("是否继续添加Y/N");
    	 char key = myScanner.next().charAt(0);
    	 if(key =='n') {
    		 break;
    	 }
    	} while(true);
    	System.out.println("以退出程序");
    }
}