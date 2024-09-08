import java.util.Scanner;
public class IfPractice01{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("你想在多会买票(月份)：");
		int month = myScanner.nextInt();
		if (month>=4 && month<=10){
			System.out.println("输入你的年龄");
			int age = myScanner.nextInt();
			if (age<18 && age>0){
				System.out.println("票价：30");
			}else if(age>=18 &&age<=60){
				System.out.println("票价：60");
			}else if(age>60){
				System.out.println("票价：20");
			}else{
				System.out.println("是人？");
			}
		}else if((month>=1 && month<4) || (10<month && month<=12)){
			System.out.println("输入你的年龄");
			int age = myScanner.nextInt();
			if (age>=18 && age<=60){
				System.out.println("票价：40");
			}else{
				System.out.println("票价：20");
			}
		}else{
			System.out.println("图灵测试完毕");
		}
	}
}