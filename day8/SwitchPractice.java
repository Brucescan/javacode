import java.util.Scanner;
public class SwitchPractice{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		
		//1����ϰ1
		// System.out.println("����һ��a-e���ַ���");
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
		

		//2����ϰ2
		// System.out.println("������ĳɼ�(1-100)��");
		// int score = myScanner.nextInt();
		// if (score<=100 && score>=1){
		// 	switch(score/60){
		// 	case 1:
		// 		System.out.println("�ϸ�");
		// 		break;
		// 	case 0:
		// 		System.out.println("���ϸ�");
		// 		break;
		// 	default:
		// 		System.out.println("6");
		// 	}
		// }else{
		// 	System.out.println("���ˣ�");
		// }
		// 
		

		//3����ϰ3
		System.out.println("�����·ݲ�ѯ���ڣ�");
		int month = myScanner.nextInt();
		switch(month){
		case 3:
		case 4:
		case 5:
			System.out.println("����:)");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("�ļ�");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("�＾");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("����");
			break;
		}
	}
}