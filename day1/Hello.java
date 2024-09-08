//java快速入门
//每一个类编译后都会对应一个class文件，最多只有一个公共类
//如果源文件包含一个公共类，则该文件名必须按该类名命名(在该案例中文件名必须为Hello.java)
//main 方法可以写在非公有类里，这样指定运行非公有类时，程序的入口就变成了main的那个非公有类
public class Hello {
	public static void main(String[] args) {
		System.out.println("bruces is studying java!");
	}
}

class Dog {
	public static void main(String[] args){
		System.out.println("hello,dog");
	}
}

class animal {
	public static void main(String[] args){
		System.out.println("hello,tiger");
	}
}