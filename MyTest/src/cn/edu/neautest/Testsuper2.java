package cn.edu.neautest;

public class Testsuper2
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		System.out.println("开始创建一个ChildClass对象.....");
		new ChildClass2();

	}

}

class FatherClass2{
	public FatherClass2() {
		System.out.println("创建FatherClass");
	}
	
}

class ChildClass2 extends FatherClass2 {
	public ChildClass2() {
		super();//在调用子类构造器创建方法时，会先调用父类构造器。系统默认的，写不写都一样
		System.out.println("创建ChildClass");
	}
}

/*
 * 所有构造器会先调用父类构造器创建对象，然后在创建子类构造器的对象，它俩是包含关系，子类对象包含父类对象
 * 
 */
	


