public class CharDetail {
	public static void main (String[] args) {
		char c1 = 97;//默认输出时是对应字符
		//要输出对应数字，可以（int)字符
		char c2 = ('a');
		System.out.println(c1);
		System.out.println((int)c2);
		char c3 = 'b' + 1;//98+1
		System.out.println((int)c3);//99
		System.out.println(c3);//99对应的字母
	}
}