//��Ͷ�����ڴ�������
public class Object03{
	public static void main(String[] args){
		Person p1 = new Person();
		p1.age = 10;
		p1.name = "С��";

		Person p2 = p1;
		System.out.println(p2.age);//10
		//���Կ����������������������͵ĸ�ֵҲ�����ô��ݻ��߽�����ַ����
	}
}

class Person{
	String name;
	int age;
}