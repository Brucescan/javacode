//��java�ڽ��и�ֵ��������ʱ������С�������Զ�ת��Ϊ���ȴ���������ͣ����Զ�����ת��
public class AutoConvert{
	public static void main(String[] args){
		// int a = 'c';//ok
		// double d = 80;//ok
		// System.out.println(a);
		// System.out.println(d);

		//�Զ�ת��ϸ��
		//1���ж������͵����ݻ������ʱ��ϵͳ�����Զ�����������ת�������������������������ٽ��м���
		// int num = 10;
		// float f = num + 1.2;//�����Բ����ԣ���Ϊ������double���ͣ�����float���ͻᱨ��
		// double d2 = num + 1.2;
		// System.out.println(f);
		// System.out.println(d2);

		//2�������ȴ���������͸�������С���������ͻᱨ����֮������Զ���������ת��
		// int n2 = 1.1;//����
		
		//3��(byte,short)��char֮�䲻���໥�Զ�ת��
		//���Ѿ����������byteʱ�����жϸ����Ƿ���byte��Χ�ڣ�����ǾͿ���
		// byte b1 = 10;//�Եģ�-128~127֮��
		// int num = 1;
		// byte b2 = num;//����ԭ����Ϊ��������ֵ����ֱ���ж�����
		// char c1 = b1;//���ԣ���Ϊ(3)ԭ��

		//4��byte,short,char���߿��Խ��м��㣬�ڼ���ʱ����ת��Ϊint���͡�
		byte b2 = 1;
		byte b3 = 2;
		byte b4 = b2 + b3;
		// short s1 = 1;
		// short s2 = b2 + s1;//ע�⣡����������b2 + s1 => int���ᱨ��
		// byte b4 = b2 + b3;//Ҳ�ᱨ��ֻҪ����ͻ��Զ�������int����

		//5��boolean���Ͳ������Զ�����ת��
		// boolean pass = True;
		// int num100 = pass;//�ᱨ����Ϊboolean���������͵��Զ�ת��

		//6���Զ�����ԭ�򣺱��ʽ����������Զ�����Ϊ����������������
		byte b4 = 1;
		short s3 = 100;
		int num200 = 1;
		double num300 = 1.1;
		double result = b4 + s3 + num200 + num300;//����������Զ�����Ϊdouble����

	}
}