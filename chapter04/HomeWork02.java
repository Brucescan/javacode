import java.util.Scanner;
public class HomeWork02{
	public static void main(String[] args){
		//1����ϰ1
		// Scanner myScanner = new Scanner(System.in);
		// System.out.println("����һ��������");
		// int num = myScanner.nextInt();
		// if (num>0){
		// 	System.out.println("����0");
		// }else if(num==0){
		// 	System.out.println("����0");
		// }else{
		// 	System.out.println("С��0");
		// }
		

		//2����ϰ2
		// Scanner myScanner = new Scanner(System.in);
		// System.out.println("����һ����ݣ�");
		// int year = myScanner.nextInt();
		// if((year % 4 == 0)&&(year % 100 != 0)||year % 400 == 0){
		// 	System.out.println("������");
		// }else{
		// 	System.out.println("��������");
		// }

		//3����ϰ3
		Scanner myScanner = new Scanner(System.in);
		System.out.println("����һ����λ��������");
		int num = myScanner.nextInt();
		int okNum = (int)(Math.pow((num/100),3)+Math.pow((num%100%10),3)+Math.pow((num%100/10),3));
		if(num==okNum){
			System.out.println("��ˮ�ɻ���");
		}else{
			System.out.println("����ˮ�ɻ���");
		}
	}
}