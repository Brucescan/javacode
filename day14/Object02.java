public class Object02{
	public static void main(String[] args){
		//���Կ�����һ�������������ͣ�Ҳ������������������
		//����ע��ϸ��
		//1�����ԵĶ����﷨ͬ������ʾ�����������η�(private protected public Ĭ��) �������� ��������
		//�������η����ǿ������Եķ��ʷ�Χ��
		//2�����ԵĶ������Ϳ���Ϊ�������ͣ�������������������������������
		//3�������������ֵ����Ĭ��ֵ������������һ��
		//�����man��һ���������ã�Ҳ���Գ�Ϊһ����������
		//new Person();�����������Ķ���ռ���������Ķ���
		Person man = new Person();
		System.out.println(man.name);//null
		System.out.println(man.age);//0
		System.out.println(man.sal);//0.0
		System.out.println(man.isPass);//false
		//���Կ�����Ĭ����������Ĺ���һ�µġ�
		Cat cat1;
		//����ֻ������ʱ��cat1��ʵָ�����һ���գ�ֻ�е�new��֮������һ���ڴ�������cat1ָ�������ǿ��ڴ�
		//


	}
}


class Person{
	String name;
	int age;
	double sal;
	boolean isPass;
}