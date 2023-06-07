public class Method {
    public static void main(String[] args) {
        P p1 = new P();
        p1.speak();
        p1.cal01();
        p1.cal02(99);
       int returnRes = p1.getSum(155, 32);
       System.out.println("返回的值=" + returnRes );
    }
}
     class P {
        String name;
        int age;

        public void speak() {
            System.out.println("你是好人");
        }
        public void cal01() {
        	int res = 0; 
        	for(int i = 1; i <= 1000; i++) {
        		res += i;
        	}
        	 System.out.println("结果=" + res);
        }
       public void cal02(int n) {
    	   int res = 0; 
       	for(int i = 1; i <= n; i++) {
       		res += i;
       	}
       	 System.out.println("====  结果=" + res);
       }
       public int getSum(int num1, int num2) {
    	   int res = num1 + num2;
    	   return res;
       }
    }

    
    
   