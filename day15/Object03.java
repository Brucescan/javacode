//类和对象的内存分配机制
public class Object03{
	public static void main(String[] args){
		Person p1 = new Person();
		p1.age = 10;
		p1.name = "小明";

		Person p2 = p1;
		System.out.println(p2.age);//10
		//可以看出，对于类这种引用类型的赋值也是引用传递或者叫做地址拷贝
	}
}

class Person{
	String name;
	int age;
}