//引出this
public class This01{
	public static void main(String[] args){
		Dog dog1 = new Dog("小白",4);
		dog1.info();//小白   4
	}
}


class Dog{
	String name;
	int age;
	// public Dog(String dname,int dage){//构造器
	// 	name = dname;
	// 	age = dage;
	// }
	//如果我们构造器的形参可以写成属性名就更好了，但是直接写是不行的
	//因为根据变量的作用域原则，会将形参赋给形参，其实什么也没发生变化，
	//调用的还是属性默认初始化的值
	//-------->>>>>引出this
	//简单来说，哪个对象调用，this就代表哪个对象，具体理解还是要看对象在内存中的创建方式
	public Dog(String name,int age){//构造器
		this.name = name;
		this.age = age;
	}
	public void info(){//成员方法   输出属性信息
		System.out.println(name+"\t"+age+"\t");
	}
}