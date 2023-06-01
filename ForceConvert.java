public class ForceConvert {
	public static void main (String[] args) {
	int n1 = (int)1.9;
	System.out.println("n1=" +n1);
	//1,造成精度损失
	int n2 = 2000;
	byte b1 = (byte)n2;
	System.out.println("b1=" +b1);
	//int x = (int)10*3.5+6*1.5; 编译错误 double----》int 
	//强转符号只针对最近的操作有效，使用小括号提升优先级
	int x =  (int)(10*3.5+6*1.5);
	System.out.println(x);//44
	char x1 = 100;//ok
	int m = 100;//ok
	char c3 = (char)m;//ok
	System.out.println(c3);//100对应的字符
	}
}