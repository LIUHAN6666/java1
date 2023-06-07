public class Array05{
    public static void main(String[] args) {
    	
    	int[] arr = {33, 44, 55, 66, 77, 88};
    	int temp = 0;
    	int len = arr.length;
    	for(int i = 0; i < len / 2; i++) {
    		 temp = arr[len - 1 - i];
    		arr[len - 1 - i] = arr[i];
    		arr[i] = temp;
    	}
    	for(int i = 0; i < arr.length; i++) {
    		System.out.print(arr[i] + "\t" );
    	}
    }
    }