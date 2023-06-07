public class MethodClone {
    public static void main(String[] args) {
    	Person p = new Person();
    	p.name = "丁真";
    	p.age = 26;
    	MyTools tools = new MyTools();
    	Person p2 = tools.copyPerson(p);
    	 System.out.println("p的属性" + "age=" + p.age + "name=" + p.name);
    	 System.out.println("p2的属性" + "age=" + p2.age + "name=" + p2.name);
    }
 }
class Person {
	String name;
	int age;
}
class MyTools {
	public Person copyPerson(Person p) {
		Person p2 = new Person();
		p2.name = p.name;
		p2.age = p.age;
		return p2;
		
	}
}