public class Object02{
	public static void main(String[] args){
		//属性可以是一个基本数据类型，也可以是引用数据类型
		//属性注意细节
		//1、属性的定义语法同变量，示例：访问修饰符(private protected public 默认) 属性类型 属性名；
		//访问修饰符就是控制属性的访问范围的
		//2、属性的定义类型可以为任意类型，包含基本数据类型与引用数据类型
		//3、属性如果不赋值，有默认值，规则与数组一致
		//这里的man是一个对象引用，也可以称为一个对象名。
		//new Person();这个申请出来的对象空间才是真正的对象
		Person man = new Person();
		System.out.println(man.name);//null
		System.out.println(man.age);//0
		System.out.println(man.sal);//0.0
		System.out.println(man.isPass);//false
		//可以看到，默认是与数组的规则一致的。
		Cat cat1;
		//当你只是声明时，cat1其实指向的是一个空，只有当new完之后分配出一块内存后才能让cat1指向分配的那块内存
		//


	}
}


class Person{
	String name;
	int age;
	double sal;
	boolean isPass;
}