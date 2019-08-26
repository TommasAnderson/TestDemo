package cn.edu.neaufarm;

public class TestExtends{
	public static void main(String[] args) {
		Student stu = new Student();
		stu.name = "高琪";
		stu.height= 6;
		stu.rest();
		
		Student stu2 = new Student("嘻嘻",6,"挖掘机专业");
		stu2.study();
		System.out.println(stu2.name+"，年龄："+stu2.height+stu2.major);
		
		
	}
	
}

class Person {
	String name;
	int height;
	
	public void rest() {
		System.out.println("休息一下！");
	}
	
}

class Student extends Person{
	String major;
	
	public void study() {
		System.out.println("学习两小时！");
							
	}
	public Student(String name,int height,String major) {
		this.name=name;
		this.height=height;
		this.major=major;
	}
	public Student() {
		
	}
}

