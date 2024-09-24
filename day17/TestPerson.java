public class TestPerson{
	public static void main(String[] args){
		Person p1 = new Person("bruces",18);
		Person p2 = new Person("bruces",18);
		if(p1.compareTo(p2)){
			System.out.println("两个双胞胎:)");
		}else{
			System.out.println("两个陌生人:)");
		}
	}
}



class Person{
	String name;
	int age;
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}

	public boolean compareTo(Person p){
		if(this.name==p.name&&this.age==p.age){
			return true;
		}
		return false;
	}
}