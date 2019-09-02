package cn.edu.neautest;

/*
 * 测试多态
 * @Derek
 */

public class TestPolym{ //多态要有继承，重写
	public static void main(String[] args){
		Animal a = new Animal();
		animalCry(a);
		
		Dog d = new Dog();
		animalCry(d);
		
		Cat c = new Cat();
		animalCry(c);
	}
	
	static void animalCry(Animal a) { //父类应用指向子类对象，Animal属于父类，但传入的对象属于子类
		a.shout();
	}

}

class Animal{  //父类加final，不能被子类继承了（class final Animal）
	public void shout() {   //父类方法钱加final，子类不能重写了（public final void shout() ）
		System.out.println("叫了一声！");
	}
}

class Dog extends Animal {
	public void shout() {
		System.out.println("汪汪汪！");
	}
}

class Cat extends Animal {
	public void shout() {
		System.out.println("喵喵喵喵");
	}
}
