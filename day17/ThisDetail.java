public class ThisDetail{
	public static void main(String[] args){
		//this使用细节
		//1、this关键词可以用来访问本类的属性，方法，构造器
		//2、this用来区分当前类的属性与局部变量；
		//3、访问成员变量的语法：this.方法名(参数列表)
		//4、访问构造器语法：this(参数列表)；
		//！！！！注意，只能在构造器中调用另外一个构造器
		//！！！！如果有this这种访问构造器语法，必须放在第一句
		//5、this不能在类定义的外部使用，只能在类定义的方法中使用
		
		T t = new T();
		// t.f2();

	}
}



class T{
	public T(){
		this("jack",18);
		System.out.println("T()构造器");
		//这里去访问T(String name,int age)构造器
	}

	public T(String name,int age){
		System.out.println("T(String name,int age)构造器");
	}

	public void f1(){
		System.out.println("f1方法");
	}
	public void f2(){
		System.out.println("f2方法");
		// 1、第一种方法直接调用
		f1();
		// 2、第二种方法通过this去调用方法
		this.f1();
		// 这两种方法具体有什么区别到继承那里就回知道了
	}
}