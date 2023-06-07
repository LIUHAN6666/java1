public class Homework08 {
    public static void main(String[] args) {
    	int[] arr = new int [10];
    	for(int i =0; i < arr.length; i++) {
    		arr [i] = (int)(Math.random() *100) + 1;
    	}
    	for(int i =0; i < arr.length; i++) {
    		System.out.print(arr[i] + " ");
    	}
    	  System.out.print("\n");
    	for(int i =arr.length - 1; i >= 0; i--) {
    	
    		System.out.print( arr[i] + " ");
    	}
    	double sum = arr[0];
    	int max = arr[0];
    	int maxindex = 0;
    	for(int i =1; i < arr.length; i++) {
    		sum = sum + arr[i];
    		if(max < arr[i]) {
    			max = arr[i];
    			maxindex = i;
    		}
    	}
    	System.out.print("\n最大值=" + max );
    	System.out.print("\n最大下标=" + maxindex);
    	System.out.print("\n平均值=" +(sum / arr.length));
    	int findnum = 15;
    	int x = -1;
    	for(int i = 0; i < arr.length; i++) {
    		if(findnum == arr[i]) {
    		System.out.print("\n找到数" + findnum + "\t下标=" + i);
    		x = i;
    		break;
    		}
    	}
    	if(x == -1) {
    		System.out.print("\n没有找到数" + findnum );	
    	}
    }
    }