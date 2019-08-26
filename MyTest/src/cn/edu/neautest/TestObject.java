package cn.edu.neautest;

public class TestObject{
	public static void main(String[] args) {
		TestObject to = new TestObject();
		System.out.println(to.toString());
		
		Person2 p2 = new Person2("嘻嘻",6);
		System.out.println(p2.toString());
		
	}
	
	public String toString() {
		return "测试Object对象";
	}
	
	
	

}

class Person2 {
	
	String name;
	int age;
	
	public String toString() {
		return name+"，年龄："+age;
	}
	public Person2(String name,int age) {
		this.name = name;
		this.age = age;
	}
}
