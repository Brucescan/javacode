import java.util.Scanner;
public class If04{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("输入你的成绩:");
		double score = myScanner.nextDouble();
		if (score>8.0){
			System.out.println("输入你的性别:");
			char gender = myScanner.next().charAt(0);
			//接受字符
			if (gender == '男'){
				System.out.println("进入男子组");
			}else if(gender == '女'){
				System.out.println("进入女子组");
			}else{
				System.out.println("你是人我吃");
			}
		}else{
			System.out.println("你没了");
		}
	}
}