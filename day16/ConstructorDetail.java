//ϸ��
//1��һ������Զ�������ͬ�Ĺ�������������������
//2����������Ҫ��������ͬ
//3��������û�з���ֵ
//4������������ɶ���ĳ�ʼ���������Ǵ�������
//5���ڴ��������ʱ��ϵͳ�Զ����ø���Ĺ��췽��
//6���������Աû�ж��幹�췽����ϵͳ���Զ���������һ��Ĭ���޲ι��췽��(Ҳ��Ĭ�Ϲ��췽��)
//����Person(){} ,ʹ��javap ָ����뿴��
//7��һ���������Լ��Ĺ�������Ĭ�ϵĹ������͸����ˣ��Ͳ�����ʹ��Ĭ�ϵ��޲ι�������
//������ʾ�Ķ���һ�£���Person(){}
public class ConstructorDetail{
	public static void main(String[] args){
		Person p1 = new Person("bruces",100);
		Person p2 = new Person("bruces");
		Dog d = new Dog();
	}
}


class Dog{

}

class Person{
	String name;
	int age;
	//1��������û�з���ֵ��Ҳ����дvoid
	//2�������������ƺ���Personһ��
	//3��(String pName,int page)���β��б�
	public Person(String pName,int page){
		System.out.println("������������   :)   ");
		name = pName;
		age = page;
	}
	//������������
	public Person(String pName){
		System.out.println("������������   ����");
		name = pName;
	}

}