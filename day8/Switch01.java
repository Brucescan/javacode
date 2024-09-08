//switch基本语法
//1、switch关键字，表示switch分支
//2、表达式对应一个值
//3、case 常量(表示一个具体的值)1：当表达式的值等于常量1，就执行语句块1
//4、break:表示退出switch
//5、如果和case 常量1 匹配，就执行语句块1，如果没有匹配，就继续匹配case 常量2
//6、如果一个都没匹配上就执行default
//注意switch有穿透现象，具体看流程图
import java.util.Scanner;
public class Switch01{
	public static void main(String[] args){
		System.out.println("输入a,b,c,d,e,f,g中的一种：");
		Scanner myScanner = new Scanner(System.in);
		char week = myScanner.next().charAt(0);//把接受的字符串转换成一个字符
		//在java中，只要有值返回，就是一个表达式
		switch(week){
			case 'a':
				System.out.println("星期一");
				break; 
			case 'b':
				System.out.println("星期二");
				break; 
			case 'c':
				System.out.println("星期三");
				break;
			case 'd':
				System.out.println("星期四");
				break;
			case 'e':
				System.out.println("星期五");
				break; 
			case 'f':
				System.out.println("星期六");
				break;
			case 'g':
				System.out.println("星期天");
				break;
			default:
				System.out.println("你输入的字符不正确");
		}
		System.out.println("退出了switch，继续执行=======");

		//细节讨论
		//1、表达式数据类型，应和case后面的常量类型一致，或者是可以自动转成可以相互比较的类型，比如输入的是字符，而常量是int
		//2、switch(表达式)中表达式的返回值必须是：(byte,short,int,char,enum,String)
		// double c = 1.1;
		// switch(c){//错误
		// 	case 1.1://错误
		// 		System.out.println("ok");
		// 		break;
		// } 
		//3、case字句中的值必须是常量或者常量表达式，而不能是变量
		//4、default子句是可选的，当没有匹配的case时，执行default。
		//5、break语句用来执行完一个case分支后使程序跳出switch语句块；如果没有break语句，程序会执行到switch结尾
	}
}