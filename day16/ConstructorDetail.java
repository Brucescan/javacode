//细节
//1、一个类可以定义多个不同的构造器，即构造器重载
//2、构造器名要与类名相同
//3、构造器没有返回值
//4、构造器是完成对象的初始化，并不是创建数据
//5、在创建对象的时候，系统自动调用该类的构造方法
//6、如果程序员没有定义构造方法，系统会自动给类生成一个默认无参构造方法(也叫默认构造方法)
//比如Person(){} ,使用javap 指令反编译看看
//7、一旦定义了自己的构造器，默认的构造器就覆盖了，就不能再使用默认的无参构造器，
//除非显示的定义一下，即Person(){}
public class ConstructorDetail{
	public static void main(String[] args){
		Person p1 = new Person("bruces",100);
		Person p2 = new Person("bruces");
		Dog d = new Dog();
	}
}


class Dog{

}

class Person{
	String name;
	int age;
	//1、构造器没有返回值，也不能写void
	//2、构造器的名称和类Person一样
	//3、(String pName,int page)是形参列表
	public Person(String pName,int page){
		System.out.println("构造器被调用   :)   ");
		name = pName;
		age = page;
	}
	//构造器的重载
	public Person(String pName){
		System.out.println("构造器被调用   ：）");
		name = pName;
	}

}