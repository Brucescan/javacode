//面向对象快速入门
public class Object01{
	public static void main(String[] args){
		//使用面向对象来解决养猫的问题
		//new Cat代表创建一只猫
		//把创建的猫赋给 cat1
		Cat cat1 = new Cat();
		cat1.name = "小白";
		cat1.age = 3;
		cat1.color = "白色";

		Cat cat2 = new Cat();
		cat2.name = "小花";
		cat2.age = 18;
		cat2.color = "花色";
		//这样的话两只猫就创建好了，数据相比于前两种要好管理的多。
		Cat cat = new Cat();
		cat.name = "小白";
		cat.age = 12;
		cat.color = "白色";
	}
}


//定义一个猫类 -> 自定义的数据类型
class Cat {
	//属性
	String name;
	int age;
	String color;
	//还可以在这里添加行为，或者叫做方法
	//对象的内存布局可以看图
	//注意，在实例化对象时，jvm会把我们类的信息加载到方法区，主要包括属性信息与方法信息。
}

