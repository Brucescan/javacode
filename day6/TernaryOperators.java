//三元运算符
public class TernaryOperators{
	public static void main(String[] args){
		// int a = 10;
		// int b = 99;
		// int result = a > b ? a++ : b--;//从此结果可知三元运算符也有短路的效果
		// System.out.println(result);
		// System.out.println(a);
		// System.out.println(b);

		//细节问题
		//1、表达式1和表达式2要为可以赋给接受变量的类型(或者可以自动转换)
		// 注意下面的bc都是int类型，赋给左边的int类型的max也是没有问题的
		//2、三元运算符可以转换成if--else语句
		
		//练习，在三个数里找到最大值
		//后面我们可以使用更简单的方式，比如排序
		// int a=1,b=2,c=3;
		// int max = (a>b?a:b) > c ? (a>b?a:b) : c;
		// System.out.println(max);
		
		// 运算符优先级不需要特别去记，用久了自然就掌握了
		// 其中只有单目运算符与赋值运算符是从右往左的顺序，其他都是从左往右的顺序
	}
}