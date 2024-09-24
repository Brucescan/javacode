//构造器，构造方法
public class Constructor{
	public static void main(String[] args){
		//1、说明，构造器的修饰符可以是默认的，也可以是其他的，
		//包括public protected private等等
		//2、构造器没有返回值
		//3、方法名 和类名字必须一样
		//4、参数列表 和 成员方法一样的规则
		//5、在创建对象时，系统会自动的调用该类的构造器完成对对象的初始化
		//主要作用是完成对对象的初始化
		Person p = new Person("bruces",100);
		System.out.println("p的对象的名字："+p.name);
		System.out.println("p的对象的年龄："+p.age);

		
	}
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


}