//˫��֧��ʹ��
import java.util.Scanner;
public class If02{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);//����ɨ��������
		System.out.println("����������䣺");//��ʾ����
		int age = myScanner.nextInt();//ɨ�����������
		if (age > 18){//�жϷ�֧
			System.out.println("�������");
		}else{
			System.out.println("�Ź�����");
		}
	}
}