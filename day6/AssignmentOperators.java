//赋值运算符 讲某个运算后的值，赋给指定的变量
//基本赋值运算符 = 以及复合赋值运算符 += -= *= /= %=
public class AssignmentOperators{
	public static void main(String[] args){
		// int n1 = 10;
		// n1 += 4;
		// System.out.println(n1);
		//赋值运算符的一些特点
		
		//1、运算顺序从右往左 int num = a + b + c;先执行右边的表达式，再赋给左边
		//
		//2、赋值运算符的左边只能是变量，右边可以是变量，表达式，常量值
		//
		//3、复合赋值运算符会进行类型转换
		byte b = 2;
		b += 3;//从这里可以思考到，b += 2并不是真正等价于b = b + 2;
		//而真正等价的是b = (byte)(b + 2)
		b++;
		System.out.println(b);
	}
}