//当java在进行赋值或者运算时，精度小的类型自动转换为精度大的数据类型，即自动类型转换
public class AutoConvert{
	public static void main(String[] args){
		// int a = 'c';//ok
		// double d = 80;//ok
		// System.out.println(a);
		// System.out.println(d);

		//自动转换细节
		//1、有多种类型的数据混合运算时，系统首先自动将所有数据转换成容量最大的那种数据类型再进行计算
		// int num = 10;
		// float f = num + 1.2;//很明显不可以，因为后面是double类型，赋给float类型会报错
		// double d2 = num + 1.2;
		// System.out.println(f);
		// System.out.println(d2);

		//2、将精度大的数据类型赋给精度小的数据类型会报错，反之会进行自动数据类型转换
		// int n2 = 1.1;//报错
		
		//3、(byte,short)和char之间不会相互自动转换
		//当把具体的数赋给byte时，先判断该数是否在byte范围内，如果是就可以
		// byte b1 = 10;//对的，-128~127之间
		// int num = 1;
		// byte b2 = num;//错误，原因：因为按变量赋值，会直接判断类型
		// char c1 = b1;//不对，因为(3)原因

		//4、byte,short,char三者可以进行计算，在计算时首先转换为int类型。
		byte b2 = 1;
		byte b3 = 2;
		byte b4 = b2 + b3;
		// short s1 = 1;
		// short s2 = b2 + s1;//注意！！！！！！b2 + s1 => int，会报错
		// byte b4 = b2 + b3;//也会报错，只要运算就会自动提升至int类型

		//5、boolean类型不参与自动类型转换
		// boolean pass = True;
		// int num100 = pass;//会报错，因为boolean不参与类型的自动转换

		//6、自动提升原则：表达式结果的类型自动提升为操作数中最大的类型
		byte b4 = 1;
		short s3 = 100;
		int num200 = 1;
		double num300 = 1.1;
		double result = b4 + s3 + num200 + num300;//后面这坨会自动提升为double类型

	}
}