//�ַ����Ϳ��Ա�ʾ�����ַ����ַ�������char
//����ַ�����ʹ��String������ὲ
public class CharDetail{
	public static void main(String[] args){
		// char c1 = 'a';
		// char c2 = '\t';
		// char c3 = '��';
		// char c4 = 97;//˵�����ַ����Ϳ���ֱ�Ӵ��һ������
		// System.out.println(c1);
		// System.out.println(c2);
		// System.out.println(c3);
		// System.out.println(c4);//�����c4��ʱ�򣬻����97�����������ʾ���Ǹ��ַ�ascii��ֵ
		
		//1���ַ�����ʹ�õ�����('')�������ĵ����ַ���
		// char c1 = 'a';
		// char c2 = '��';
		// char c3 = '9';

		//2��java�л�����ʹ��ת���ַ�'\'���������ַ�ת��Ϊ�����ַ��ͳ�����'\n'��ʾ����
		
		//3����java�У��ַ����͵ı�����һ�������������ʱ���������Ӧ��unicode���Ӧ���ַ�
		int n1 = 'a' + 'b';
		char c0 = 'a' + 2;
		System.out.println(n1);
		System.out.println(c0);

		//4������ֱ�Ӹ�char��һ��������Ȼ�����ʱ���ᰴ�ն�Ӧ��unicode�ַ����
		char c1 = 'a';
		char c2 = '\t';
		char c3 = '��';
		char c4 = 97;//˵�����ַ����Ϳ���ֱ�Ӵ��һ������
		System.out.println((int)c1);
		System.out.println((int)c2);
		System.out.println((int)c3);
		System.out.println((int)c4);//�����c4��ʱ�򣬻����97�����������ʾ���Ǹ��ַ�ascii��ֵ

		//5��char�����ǿ��Խ�������ģ��൱��һ����������Ϊ���Ƕ��ж�Ӧ��unicode��  
	}
}