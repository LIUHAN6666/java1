public class Homework07 {
    public static void main(String[] args) {
    	int[] arr = { 10, 12, 45, 90};
    	int insertnum = 98;
    	int index = -1;
    	for(int i =0; i < arr.length; i++) {
    		if (insertnum <= arr[i]) {
    			index = i;
    			break;
    		}
    	}
    	if (index == -1) {
    		index = arr.length;
    	}
    	System.out.println("index=" + index);
    	int[]arrnew = new int [arr.length + 1];
    	
    for(int i = 0, j = 0; i < arrnew.length; i++) {
    	if (i != index) {
    		arrnew[i] = arr[j];
    		j++;
    	} else {
    		arrnew[i] = insertnum;
    	}
    	
    }
    arr = arrnew;
    for(int i = 0; i < arrnew.length; i++) {
    System.out.print(arr[i] + " ");
    }
    }
    }