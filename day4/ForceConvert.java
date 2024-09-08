//强制类型转换
//自动转换的逆过程，将容量大的类型转换为容量小的类型
public class ForceConvert{
	public static void main(String[] args){
		// int i = (int)1.9;
		// System.out.println(i);//精度损失了

		// int j = 100;
		// byte b1 = (byte)j;
		// System.out.println(b1);

		// int k = 2000;
		// byte b2 = (byte)k;
		// System.out.println(b2);//结果是-48，因为内存溢出了
		
		//强制转换的细节
		//1、当数据的大小从大到小记忆需要使用强制类型转换
		
		//2、强制符号只针对最近的操作数有效，往往会使用小括号提升优先级
		// int x = (int)10 * 3.5 + 6 * 1.5;//右边最终的类型为double，会报错
		int y = (int)(10 * 3.5 + 6 * 1.5);//ok
		// System.out.println(x);
		System.out.println(y);

		//3、char类型可以保存int的常量值，但不能保存int的变量值，需要强转
		char c1 = 100;//ok
		int m = 100;
		// char c2 = m;//根据自动提升原则，int的精度会比char更高，所以无法进行转换
		char c3 = (char)m;//ok
		System.out.println(c3);
		//4、byte和short类型在进行运算时，当作int类型处理
	}
}