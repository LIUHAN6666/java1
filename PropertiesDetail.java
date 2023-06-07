public class PropertiesDetail {
    public static void main(String[] args) {	
    	W p1 = new W();
    	System.out.print ("\n当前这个人的信息");
    	System.out.println ("age=" + p1.age + " " + "name"
    			+ p1.name + " " + "sal=" + p1.sal + " " + "isPass="
    			    + p1.isPass);
    }
    }
class W {
	int age;
	String name;
	double sal;
	boolean isPass;
	
}