package cn.edu.arrays;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//数组静态初始化
		int[] a = {2,4,65};
		UserMan[] b = {
				       new UserMan(1001,"高琪"),
				       new UserMan(1002, "高二期"),
				       new UserMan(1003, "高三期")	
				       };
		
		
		//数组默认初始化
		int[] c = new int[3];  //默认给数组的元素进行赋值。赋值的规则和成员变量默认赋值规则一样
		/*
		 *  int a2[] = new int[2];  默认值：0，0
		 *  boolean[] b = new boolean[2]; 默认值：false,false
		 *  String[] s = new String[2]; 默认值：null,null
  		 */
		
		//动态初始化
		int[] a1 = new int[2];//动态初始化数组，先分配空间
		a1[0] = 1;//给数组赋值
		a1[1] = 2;//给数组赋值
		
		
		
	}

}
