package cn.edu.neautest;

public class TestArray{
	public static void main(String[] args)
	{
		int[] arr00 ; //创建一个数组，但没有规定长度
		int[] arr01 = new int[10];        //创建一个数组，也可以用 int arr01[] 这种形式
		String[] arr02 = new String[5];  //创建一个数组，并指定长度
		UserMan[] arr03 = new UserMan[3];     //创建一个对象数组
		
		arr01[0] = 13;
		arr01[1] = 15;
		//arr01[10] = 110; 数组下标从0至length-1，所以该数组下标超界 
		
		
		//通过循环初始化数组
		for (int i=0;i<arr01.length;i++) {
			arr01[i] = 10*i;
		}
		
		//通过循环打印数组
		for (int i=0;i<arr01.length;i++) {
			System.out.println(arr01[i]);
		}
	}

}

class UserMan {
	private int id;
	private String name;
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
		
	
}