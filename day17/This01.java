//����this
public class This01{
	public static void main(String[] args){
		Dog dog1 = new Dog("С��",4);
		dog1.info();//С��   4
	}
}


class Dog{
	String name;
	int age;
	// public Dog(String dname,int dage){//������
	// 	name = dname;
	// 	age = dage;
	// }
	//������ǹ��������βο���д���������͸����ˣ�����ֱ��д�ǲ��е�
	//��Ϊ���ݱ�����������ԭ�򣬻Ὣ�βθ����βΣ���ʵʲôҲû�����仯��
	//���õĻ�������Ĭ�ϳ�ʼ����ֵ
	//-------->>>>>����this
	//����˵���ĸ�������ã�this�ʹ����ĸ����󣬾�����⻹��Ҫ���������ڴ��еĴ�����ʽ
	public Dog(String name,int age){//������
		this.name = name;
		this.age = age;
	}
	public void info(){//��Ա����   ���������Ϣ
		System.out.println(name+"\t"+age+"\t");
	}
}