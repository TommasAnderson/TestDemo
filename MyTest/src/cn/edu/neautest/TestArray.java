package cn.edu.neautest;

public class TestArray{
	public static void main(String[] args)
	{
		int[] arr01;        //创建一个数组，也可以用 int arr01[] 这种形式
		String[] arr02 = new String[5];  //创建一个数组，并指定长度
		UserMan[] arr03 = new UserMan[3];     //创建一个对象数组
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