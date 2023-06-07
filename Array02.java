public class Array02{
    public static void main(String[] args) {
    	char chars[];
    	chars = new char[26];
    	for (int i = 0; i < chars.length; i++) {
    		chars[i] = (char)(i + 'A');
    		System.out.print(chars[i] + " ");
    	}
    	
    }
    }