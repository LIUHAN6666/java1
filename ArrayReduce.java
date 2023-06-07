import java.util.Scanner;
public class ArrayReduce{
    public static void main(String[] args) {
    	Scanner  myScanner =  new Scanner(System.in);
    	int[] arr = {1, 2, 3, 4, 5};
    	do {
    	int[] arrnew = new int[arr.length - 1];
    	
    	 for(int i = 0; i < arrnew.length; i++) {
    		 arrnew[i] = arr[i];	
    	 }
    	 arr = arrnew;
    	 System.out.println("是否缩减Y/N");
    	 char key = myScanner.next().charAt(0);
    	 for(int i = 0; i < arr.length ; i++) {
	    	 System.out.print( arr[i] + "\t");
          }
    	 if(key =='N') {
    		 break;
    	 } else if (arr.length == 1) {
             break;
    	 }
         
     } while (true);
    	System.out.println("退出程序");
    
    	
    }
}

