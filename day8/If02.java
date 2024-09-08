//双分支的使用
import java.util.Scanner;
public class If02{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);//创建扫描器对象
		System.out.println("输入你的年龄：");//提示输入
		int age = myScanner.nextInt();//扫描输入的内容
		if (age > 18){//判断分支
			System.out.println("送入监狱");
		}else{
			System.out.println("放过你了");
		}
	}
}