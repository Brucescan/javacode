public class HomeWork12{
	public static void main(String[] args){
		//����д�ˣ��Լ�����
	}
}


class Employee{
	String name;
	char sex;
	int age;
	String posts;
	double salary;
	public Employee(String name,char sex,int age,String posts,double salary){
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.posts = posts;
		this.salary = salary;
	}
	public Employee(String name,char sex,int age){
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	public Employee(String posts,double salary){
		this.posts = posts;
		this.salary = salary;
	}
}