public class Object04{
	public static void main(String[] args){
		//java�ڴ�ṹ����
		//1��ջ��һ���Ż�����������(�ֲ�����)
		//2���ѣ���Ŷ���(Cat cat,�����)
		//3����������������(�����������ַ���)���������Ϣ
		//java������������̼򵥷���
		Person p = new Person();
		p.name = "jack";
		p.age = 10;

		//1���ȼ���Person����Ϣ(���Ժͷ�����Ϣ����������ֻ�����һ��
		//2���ڶ��з���ռ䣬����Ĭ�ϳ�ʼ�����Ѷ��еĵ�ַ����p
		//
		//3������ָ����ʼ������p.name = "jack" p.age = 10
	}
}


class Person{
	String name;
	int age;
}