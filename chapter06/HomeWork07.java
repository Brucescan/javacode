public class HomeWork07{
	public static void main(String[] args){
		Dog d = new Dog("小花","花色",3);
		d.show();
	}
}


class Dog{
	String name;
	String color;
	int age;
	public Dog(String name,String color,int age){
		this.name = name;
		this.color = color;
		this.age = age;
	}


	public void show(){
		System.out.println("你的狗如下所示=======");
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.age);
	}
}