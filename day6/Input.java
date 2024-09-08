//键盘的输入
import java.util.Scanner;//表示把java.util包下的Scanner类导入到这个文件
public class Input{
	public static void main(String[] args){
		//演示接受用户的数据
		//1、引入Scanner类(简单的文本扫描器)所在的包
		//2、创建 Scanner 对象,new新建的意思
		Scanner myScanner = new Scanner(System.in);

		//3、接收用户的输入了，使用的是相关的方法
		System.out.println("请输入名字：");
		//当程序执行到next方法时，会等待用户进行输入
		String name = myScanner.next();//接收用户的输入的字符串

		System.out.println("请输入年龄：");
		int age = myScanner.nextInt();//接收用户的输入的整数

		System.out.println("请输入成绩：");
		double score = myScanner.nextDouble();//接收用户的输入的浮点数

		System.out.println("name="+name);
		System.out.println("age="+age);
		System.out.println("score="+score);
	}
}