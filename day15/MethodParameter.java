//�����Ĵ��λ��ƣ������������ͣ������������͵Ĵ��λ���
public class MethodParameter{
	public static void main(String[] args){
		// int a = 10;
		// int b = 20;
		// AA c = new AA();
		// c.swap(a,b);
		// System.out.println("a="+a+",b="+b);
		// 
		// 
		int[] arr = {20,100,20,17,50};
		AA a = new AA();
		a.test100(arr);
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
		Person man = new Person();
		man.name = "777";
		a.test200(man);
		System.out.println(man.name);//666
	}
}


//���Կ��������Ĵ��ݶ��ڻ�������������˵ֻ�Ǽ򵥵�ֵ���ݣ������Ὣ��ַ�����βΣ�����ʵ����a��b��û�н���
//���Կ��������Ĵ��ݶ�����������������˵�����ô��ݣ��Ὣ��ַ�����β�


class AA{
	public void swap(int a,int b){
		//���a��b�Ľ���
		int tmp = a;
		a=b;
		b=tmp;
		System.out.println("a="+a+",b="+b);
	}
	public void test100(int[] arr){
		arr[0] = 10;
	}

	public void test200(Person man){
		man.name = "666";
	}
}

class Person{
	String name;
	int age;
}