public class TwoDimesionalArray{
    public static void main(String[] args) {
    	int[][]arr = {{0, 2, 3, 3, 4},
    			      {4, 3, 7, 6, 9},
    			      {6, 7, 7, 4, 4},
    			      {1, 4, 6, 8, 3}};
    	for( int i = 0; i < arr.length; i++ ) {
    		for (int j = 0; j < arr[i].length; j++) {
    			System.out.print(arr[i][j]);
    		}
    		System.out.println( );
    	}
    	
    }
    }