//�ַ�������ת�������ݽṹ
//�������ݽṹת�ַ�������
public class StringToBasic{
	public static void main(String[] args){
		//��������ת�ַ������� ��������ֵ+""����
		// int n1 = 100;
		// float n2 = 1.1F;
		// double n3 = 3.4;
		// boolean b1 = true;
		// String str1 = n1 + "";
		// String str2 = n2 + "";
		// String str3 = n3 + "";
		// String str4 = b1 + "";
		// System.out.println(str1 + " " + str2 + " " + str3 + " " + str4);
		
		//�ַ�������ת�������ͣ�ͨ���������͵İ�װ�����parsexxx��������
		//������ ʹ�� �������Ͷ�Ӧ�İ�װ�࣬����Ӧ�������õ���������������
		//ע�⣬�ַ����õ��ַ�����ָ���ַ����ĵ�һ���ַ��õ�
		// String s5 = "123";
		// int n1 = Integer.parseInt(s5);
		// double n2 = Double.parseDouble(s5);
		// float n3 = Float.parseFloat(s5);
		// long n4 = Long.parseLong(s5);
		// byte n5 = Byte.parseByte(s5);
		// boolean b1 = Boolean.parseBoolean("true");
		// System.out.println(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + b1);

		//ϸ�ڴ���
		// System.out.println(s5.charAt(1));//���Ϊ2����Ϊ��������Ǵ�0��ʼ����
		//1����String����ת��Ϊ������������ʱ��Ҫȷ��ת�����������Ч�����磬���ܽ���hello��ת��Ϊ��������
		String str = "hello";
		int n1 = Integer.parseInt(str);
		System.out.println(n1);//��������ǿ��Եģ����лᵼ�³����쳣��ֹ
		//������Щ�����쳣��ʾ
		// Exception in thread "main" java.lang.NumberFormatException: For input string: "hello"
        // at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        // at java.lang.Integer.parseInt(Integer.java:580)
        // at java.lang.Integer.parseInt(Integer.java:615)
        // at StringToBasic.main(StringToBasic.java:32)

		//2�������ʽ����ȷ���ͻ��׳��쳣������������ѧ
	}
}