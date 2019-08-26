package cn.edu.neautest;
/*
 * 测试重写
 * 
 */

public class TestOverride{
	public static void main(String[] args) {
		Horse h = new Horse();
		h.run();
		
	}

}

class Vehicle{
	public void run() {
		System.out.println("跑。。。");
	}
	
	public void stop() {
		System.out.println("停止。。。");
	}
	public Person whoIsPsg() {
		return new Person();
	}
}


class Horse extends Vehicle {
	public void run() {
		System.out.println("四蹄翻飞，嘚嘚的。。。");  //方法重写override
	}
	public Student whoIsPsg() {    //返回值类型要小于等于父类
		return new Student();
	}
}


