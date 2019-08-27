package cn.edu.neautest;

public class Person4En{
	private int id;
	private String name;
	private int age;
	private boolean man;
	
	public void setName(String name) {
		this.name = name;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		if(age>=1&&age<=130) {  //方便在具体动作方法内设置校验，检验输入值是否合法
		this.age = age;
		}else {
			System.out.println("请输入正确的年龄");
		}
	}

	public boolean isMan()
	{
		return man;
	}

	public void setMan(boolean man)
	{
		this.man = man;
	}

	public String getName()
	{
		return name;
	}
	
	

}
