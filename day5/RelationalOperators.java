//关系运算符的
public class RelationalOperators{
	public static void main(String[] args){
		//关系表达式 经常用在 if结构的条件中或循环结构的条件中
		//instanceof检查是否是类的对象
		int a = 8;
		int b = 9;
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a >= b);
		System.out.println(a <= b);
		System.out.println(a == b);
		System.out.println(a != b);
		boolean flag = a > b;
		//细节
		//1、关系运算符的结果都是boolean类型，也就是要么是true，要么是false
		//2、关系运算符组成的表达式，我们称为关系表达式
		//3、比较运算符"=="不能误写为"="
	}
}