//���̵�����
import java.util.Scanner;//��ʾ��java.util���µ�Scanner�ർ�뵽����ļ�
public class Input{
	public static void main(String[] args){
		//��ʾ�����û�������
		//1������Scanner��(�򵥵��ı�ɨ����)���ڵİ�
		//2������ Scanner ����,new�½�����˼
		Scanner myScanner = new Scanner(System.in);

		//3�������û��������ˣ�ʹ�õ�����صķ���
		System.out.println("���������֣�");
		//������ִ�е�next����ʱ����ȴ��û���������
		String name = myScanner.next();//�����û���������ַ���

		System.out.println("���������䣺");
		int age = myScanner.nextInt();//�����û������������

		System.out.println("������ɼ���");
		double score = myScanner.nextDouble();//�����û�������ĸ�����

		System.out.println("name="+name);
		System.out.println("age="+age);
		System.out.println("score="+score);
	}
}