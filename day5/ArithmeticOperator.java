//算数运算符的使用
public class ArithmeticOperator{
	public static void main(String[] args){
		// System.out.println(10 / 4);//2,因为自动类型转换，在java中两个都是int类型
		// System.out.println(10.0 / 4);//2.5
		// double d = 10/4;//2.0，对的，因为后面是int类型，会自动进行类型转换
		// System.out.println(d);
		
		// % 取模运算符
		// 在java中，%的本质，有一个公式 a % b = a - (int)a / b * b
		// 
		// System.out.println(10 % 3);//1
		// System.out.println(-10 % 3);//-1
		// System.out.println(10 % -3);//1
		// System.out.println(-10 % -3);//-1
		// int i = 10;
		// i++;//自增 等价于 i = i + 1
		// ++i;//自增 等价于 i = i + 1
		//如果作为独立语句使用，两者没有任何区别
		
		// System.out.print("i = " + i);//12

		//作为表达式使用，后++是先使用这个值作为表达式的值，之后+1
		//前++是直接使用加一后的值作为表达式的值
		

		//练习题
		//1、注意计算机规则，使用临时变量：temp = i; i = i+1; k = temp; 
		// int i = 1;
		// i = i++;
		// System.out.println(i);


		//2、同样也是临时变量：i = i + 1;temp = i; k = temp
		// int i = 1;
		// i = ++i;
		// System.out.println(i);//2
		
		//3、
		// int i1 = 10;//11
		// int i2 = 20;//19
		// int i = i1++;
		// System.out.println("i=" + i);//10
		// i = --i2;
		// System.out.println("i=" + i);//19
		// System.out.println("i2=" + i2);//19

		//4、假如还有59天放假，问合xx个星期零几天
		// int day = 59 % 7;
		// int week = 59 / 7;
		// System.out.println("合" + week + "个星期" + day + "天");
		
		//5、定义一个变量保存华氏温度，华氏温度转换摄氏温度的公式为： 5/9(华氏温度-100)，请求出华氏温度对应的摄氏温度
		double Fahrenheit = 234.5;
		double Celsius = 5.0 / 9 * (Fahrenheit-100);//注意按照题中所示，5/9的结果为0，所以结果只可能为0
		System.out.println("234.5的华氏温度对应的摄氏温度是" + Celsius);
	}
}