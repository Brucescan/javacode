import java.util.Scanner;
public class IfPractice01{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("�����ڶ����Ʊ(�·�)��");
		int month = myScanner.nextInt();
		if (month>=4 && month<=10){
			System.out.println("�����������");
			int age = myScanner.nextInt();
			if (age<18 && age>0){
				System.out.println("Ʊ�ۣ�30");
			}else if(age>=18 &&age<=60){
				System.out.println("Ʊ�ۣ�60");
			}else if(age>60){
				System.out.println("Ʊ�ۣ�20");
			}else{
				System.out.println("���ˣ�");
			}
		}else if((month>=1 && month<4) || (10<month && month<=12)){
			System.out.println("�����������");
			int age = myScanner.nextInt();
			if (age>=18 && age<=60){
				System.out.println("Ʊ�ۣ�40");
			}else{
				System.out.println("Ʊ�ۣ�20");
			}
		}else{
			System.out.println("ͼ��������");
		}
	}
}