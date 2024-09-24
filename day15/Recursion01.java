//递归可以解决什么问题？？？？？？
//递归就是自己调用自己，每次调用时传入不同的变量，递归有助于编程者解决复杂问题，同时可以让代码变的简洁。
//1、各种数学问题，比如8皇后问题，汉诺塔，阶乘问题，迷宫问题，球和篮子的问题(google编程大赛)
//2、各种算法也会用到递归，比如快排，归并排序，二分查找，分治算法等
//3、将用栈解决的问题 --> 递归代码比较简洁
public class Recursion01{
	public static void main(String[] args){
		//两个小案例
		//1、打印问题
		//2、阶乘问题
		Test t = new Test();
		t.print(10);//会输出n=2,3,4,5,6,7,8,9,10

		System.out.println(t.factorial(5));

	}
}


//其中递归有几项注意的地方
//
//1、执行一个方法时，就创建一个新的受保护的独立空间(栈空间)
//2、方法的局部变量是独立的，不会相互影响，比如n变量
//3、如果方法中使用的是引用数据类型(比如数组),就会共享该引用的类型
//4、递归必须向退出递归的条件逼近，否则就是无限递归了，出现StackOverflowError，死龟了
//5、当以方法执行完毕，或者遇到return，就会返回，遵守谁调用，就将结果返回谁，同时当方法执行完毕后或者返回时，该方法也就执行完毕
class Test{
	public void print(int n){
		if(n>2){
			print(n-1);
		}
		System.out.println("n="+n);
	}

	public int factorial(int n){
		if(n==1){
			return 1;
		}else{
			return factorial(n-1)*n;
		}
	}
}