import java.util.Scanner;
public class SwitchPractice{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		
		//1、练习1
		// System.out.println("输入一个a-e的字符：");
		// char c = myScanner.next().charAt(0);
		// switch(c){
		// case 'a':
		// 	System.out.println('A');
		// 	break;
		// case 'b':
		// 	System.out.println('B');
		// 	break;
		// case 'c':
		// 	System.out.println('C');
		// 	break;
		// case 'd':
		// 	System.out.println('D');
		// 	break;
		// case 'e':
		// 	System.out.println('E');
		// 	break;
		// }
		

		//2、练习2
		// System.out.println("输入你的成绩(1-100)：");
		// int score = myScanner.nextInt();
		// if (score<=100 && score>=1){
		// 	switch(score/60){
		// 	case 1:
		// 		System.out.println("合格");
		// 		break;
		// 	case 0:
		// 		System.out.println("不合格");
		// 		break;
		// 	default:
		// 		System.out.println("6");
		// 	}
		// }else{
		// 	System.out.println("是人？");
		// }
		// 
		

		//3、练习3
		System.out.println("输入月份查询季节：");
		int month = myScanner.nextInt();
		switch(month){
		case 3:
		case 4:
		case 5:
			System.out.println("春季:)");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("夏季");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("秋季");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("冬季");
			break;
		}
	}
}