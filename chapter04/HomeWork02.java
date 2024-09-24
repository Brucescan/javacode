import java.util.Scanner;
public class HomeWork02{
	public static void main(String[] args){
		//1、练习1
		// Scanner myScanner = new Scanner(System.in);
		// System.out.println("输入一个整数：");
		// int num = myScanner.nextInt();
		// if (num>0){
		// 	System.out.println("大于0");
		// }else if(num==0){
		// 	System.out.println("等于0");
		// }else{
		// 	System.out.println("小于0");
		// }
		

		//2、练习2
		// Scanner myScanner = new Scanner(System.in);
		// System.out.println("输入一个年份：");
		// int year = myScanner.nextInt();
		// if((year % 4 == 0)&&(year % 100 != 0)||year % 400 == 0){
		// 	System.out.println("是闰年");
		// }else{
		// 	System.out.println("不是闰年");
		// }

		//3、练习3
		Scanner myScanner = new Scanner(System.in);
		System.out.println("输入一个三位的整数：");
		int num = myScanner.nextInt();
		int okNum = (int)(Math.pow((num/100),3)+Math.pow((num%100%10),3)+Math.pow((num%100/10),3));
		if(num==okNum){
			System.out.println("是水仙花数");
		}else{
			System.out.println("不是水仙花数");
		}
	}
}