//switch�����﷨
//1��switch�ؼ��֣���ʾswitch��֧
//2�����ʽ��Ӧһ��ֵ
//3��case ����(��ʾһ�������ֵ)1�������ʽ��ֵ���ڳ���1����ִ������1
//4��break:��ʾ�˳�switch
//5�������case ����1 ƥ�䣬��ִ������1�����û��ƥ�䣬�ͼ���ƥ��case ����2
//6�����һ����ûƥ���Ͼ�ִ��default
//ע��switch�д�͸���󣬾��忴����ͼ
import java.util.Scanner;
public class Switch01{
	public static void main(String[] args){
		System.out.println("����a,b,c,d,e,f,g�е�һ�֣�");
		Scanner myScanner = new Scanner(System.in);
		char week = myScanner.next().charAt(0);//�ѽ��ܵ��ַ���ת����һ���ַ�
		//��java�У�ֻҪ��ֵ���أ�����һ�����ʽ
		switch(week){
			case 'a':
				System.out.println("����һ");
				break; 
			case 'b':
				System.out.println("���ڶ�");
				break; 
			case 'c':
				System.out.println("������");
				break;
			case 'd':
				System.out.println("������");
				break;
			case 'e':
				System.out.println("������");
				break; 
			case 'f':
				System.out.println("������");
				break;
			case 'g':
				System.out.println("������");
				break;
			default:
				System.out.println("��������ַ�����ȷ");
		}
		System.out.println("�˳���switch������ִ��=======");

		//ϸ������
		//1�����ʽ�������ͣ�Ӧ��case����ĳ�������һ�£������ǿ����Զ�ת�ɿ����໥�Ƚϵ����ͣ�������������ַ�����������int
		//2��switch(���ʽ)�б��ʽ�ķ���ֵ�����ǣ�(byte,short,int,char,enum,String)
		// double c = 1.1;
		// switch(c){//����
		// 	case 1.1://����
		// 		System.out.println("ok");
		// 		break;
		// } 
		//3��case�־��е�ֵ�����ǳ������߳������ʽ���������Ǳ���
		//4��default�Ӿ��ǿ�ѡ�ģ���û��ƥ���caseʱ��ִ��default��
		//5��break�������ִ����һ��case��֧��ʹ��������switch���飻���û��break��䣬�����ִ�е�switch��β
	}
}