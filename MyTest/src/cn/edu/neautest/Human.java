package cn.edu.neautest;

public class Human{
	public static void main(String[] args)
	{
		Person4En p4 = new Person4En();
		p4.setAge(14);//私有属性，必须通过set方法传值；
		p4.setAge(-1);//方便具体方法校验输入。
		
		System.out.println(p4.getAge());
		
		
	}

}
