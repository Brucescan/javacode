public class ThisDetail{
	public static void main(String[] args){
		//thisʹ��ϸ��
		//1��this�ؼ��ʿ����������ʱ�������ԣ�������������
		//2��this�������ֵ�ǰ���������ֲ�������
		//3�����ʳ�Ա�������﷨��this.������(�����б�)
		//4�����ʹ������﷨��this(�����б�)��
		//��������ע�⣬ֻ���ڹ������е�������һ��������
		//�������������this���ַ��ʹ������﷨��������ڵ�һ��
		//5��this�������ඨ����ⲿʹ�ã�ֻ�����ඨ��ķ�����ʹ��
		
		T t = new T();
		// t.f2();

	}
}



class T{
	public T(){
		this("jack",18);
		System.out.println("T()������");
		//����ȥ����T(String name,int age)������
	}

	public T(String name,int age){
		System.out.println("T(String name,int age)������");
	}

	public void f1(){
		System.out.println("f1����");
	}
	public void f2(){
		System.out.println("f2����");
		// 1����һ�ַ���ֱ�ӵ���
		f1();
		// 2���ڶ��ַ���ͨ��thisȥ���÷���
		this.f1();
		// �����ַ���������ʲô���𵽼̳�����ͻ�֪����
	}
}