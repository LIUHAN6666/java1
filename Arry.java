public class Arry{
    public static void main(String[] args) {
    	double totalweight = 0;
    	double[] hens = {3, 5, 1, 3.4, 2, 50};
    	for(int i =0; i < 6; i++) {
    		totalweight += hens[i];
    		//System.out.println("第" +(i+1) + "个元素的值" + hens[i]);
    	}
    	System.out.println("总体重" + totalweight + "平均体重" 
    	+ (totalweight / 6));
    }
    }