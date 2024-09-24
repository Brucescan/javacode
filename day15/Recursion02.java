public class Recursion02{
	public static void main(String[] args){
		//斐波那契递归实现
		Tool t = new Tool();
		int num = t.Fibonacci(5);
		System.out.println(num);

		//猴子吃桃问题
		// int sum = t.monkey(10);
		// System.out.println("最初共有"+sum+"个桃子");
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