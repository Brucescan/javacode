public class HomeWork07{
	public static void main(String[] args){
		Dog d = new Dog("С��","��ɫ",3);
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
		System.out.println("��Ĺ�������ʾ=======");
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.age);
	}
}