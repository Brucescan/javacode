public class Object04{
	public static void main(String[] args){
		//java内存结构分析
		//1、栈，一般存放基本数据类型(局部变量)
		//2、堆，存放对象(Cat cat,数组等)
		//3、方法区，常量池(常量，比如字符串)，类加载信息
		//java创建对象的流程简单分析
		Person p = new Person();
		p.name = "jack";
		p.age = 10;

		//1、先加载Person类信息(属性和方法信息）！！！！只会加载一次
		//2、在堆中分配空间，进行默认初始化，把堆中的地址赋给p
		//
		//3、进行指定初始化比如p.name = "jack" p.age = 10
	}
}


class Person{
	String name;
	int age;
}