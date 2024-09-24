//成员方法
public class Method01{
	public static void main(String[] args){
		Person p = new Person();
		p.speak();
	}
}

class Person{
	String name;
	int age;


	//方法(成员方法)
	//解读，public表示方法是公开的，void表示方法没有返回值，speak表示方法名，小括号里面是形参列表
	public void speak(){
		System.out.println("我是一个好人");
	}
}