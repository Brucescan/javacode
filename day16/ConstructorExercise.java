public class ConstructorExercise{
	public static void main(String[] args){
		
	}
}

//对象创建流程分析
//1、加载Person类信息(Person.class)，只会加载一次
//2、在堆中分配空间(地址)
//3、完成对象初始化，3.1默认初始化 3.2显示初始化 3.3构造器初始化
//4、再把对象在堆中的地址返回给对象的引用，或者叫对象名
class Person{
	String name;
	String age;
	public Person(int pAge){
		age = pAge;
	}
	public Person(String pName,int pAge){
		age = pAge;
		name = pName;
	}
}