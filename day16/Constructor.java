//�����������췽��
public class Constructor{
	public static void main(String[] args){
		//1��˵���������������η�������Ĭ�ϵģ�Ҳ�����������ģ�
		//����public protected private�ȵ�
		//2��������û�з���ֵ
		//3�������� �������ֱ���һ��
		//4�������б� �� ��Ա����һ���Ĺ���
		//5���ڴ�������ʱ��ϵͳ���Զ��ĵ��ø���Ĺ�������ɶԶ���ĳ�ʼ��
		//��Ҫ��������ɶԶ���ĳ�ʼ��
		Person p = new Person("bruces",100);
		System.out.println("p�Ķ�������֣�"+p.name);
		System.out.println("p�Ķ�������䣺"+p.age);

		
	}
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


}