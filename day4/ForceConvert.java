//ǿ������ת��
//�Զ�ת��������̣��������������ת��Ϊ����С������
public class ForceConvert{
	public static void main(String[] args){
		// int i = (int)1.9;
		// System.out.println(i);//������ʧ��

		// int j = 100;
		// byte b1 = (byte)j;
		// System.out.println(b1);

		// int k = 2000;
		// byte b2 = (byte)k;
		// System.out.println(b2);//�����-48����Ϊ�ڴ������
		
		//ǿ��ת����ϸ��
		//1�������ݵĴ�С�Ӵ�С������Ҫʹ��ǿ������ת��
		
		//2��ǿ�Ʒ���ֻ�������Ĳ�������Ч��������ʹ��С�����������ȼ�
		// int x = (int)10 * 3.5 + 6 * 1.5;//�ұ����յ�����Ϊdouble���ᱨ��
		int y = (int)(10 * 3.5 + 6 * 1.5);//ok
		// System.out.println(x);
		System.out.println(y);

		//3��char���Ϳ��Ա���int�ĳ���ֵ�������ܱ���int�ı���ֵ����Ҫǿת
		char c1 = 100;//ok
		int m = 100;
		// char c2 = m;//�����Զ�����ԭ��int�ľ��Ȼ��char���ߣ������޷�����ת��
		char c3 = (char)m;//ok
		System.out.println(c3);
		//4��byte��short�����ڽ�������ʱ������int���ʹ���
	}
}