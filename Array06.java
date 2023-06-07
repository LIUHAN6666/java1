public class Array06{
    public static void main(String[] args) {
    	int [] arr = {33, 44, 55, 66, 77, 88};
    	int[] arr2 = new int[arr.length];
    	for(int i = arr.length -1, j = 0; i >= 0; 
    			i--, j++) {
    		arr2[j] = arr[i];
    		
    	}
    	arr = arr2;
        for(int i = 0; i < arr.length; i++) {
    		
    		System.out.println( arr[i]);
        }
    	
    }
    }