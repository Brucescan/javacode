public class Recursion02{
	public static void main(String[] args){
		//쳲������ݹ�ʵ��
		Tool t = new Tool();
		int num = t.Fibonacci(5);
		System.out.println(num);

		//���ӳ�������
		// int sum = t.monkey(10);
		// System.out.println("�������"+sum+"������");
	}
} 

class Tool{
	public int Fibonacci(int n){
		if(n==1||n==2){
			return 1;
		}
		return Fibonacci(n-2)+Fibonacci(n-1);
	}
	public int monkey(int n){
		if(n == 1){
			return 1;
		}
		return 2*(monkey(n-1)+1);
	}
}