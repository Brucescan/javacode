//�����������ʹ��
public class ArithmeticOperator{
	public static void main(String[] args){
		// System.out.println(10 / 4);//2,��Ϊ�Զ�����ת������java����������int����
		// System.out.println(10.0 / 4);//2.5
		// double d = 10/4;//2.0���Եģ���Ϊ������int���ͣ����Զ���������ת��
		// System.out.println(d);
		
		// % ȡģ�����
		// ��java�У�%�ı��ʣ���һ����ʽ a % b = a - (int)a / b * b
		// 
		// System.out.println(10 % 3);//1
		// System.out.println(-10 % 3);//-1
		// System.out.println(10 % -3);//1
		// System.out.println(-10 % -3);//-1
		// int i = 10;
		// i++;//���� �ȼ��� i = i + 1
		// ++i;//���� �ȼ��� i = i + 1
		//�����Ϊ�������ʹ�ã�����û���κ�����
		
		// System.out.print("i = " + i);//12

		//��Ϊ���ʽʹ�ã���++����ʹ�����ֵ��Ϊ���ʽ��ֵ��֮��+1
		//ǰ++��ֱ��ʹ�ü�һ���ֵ��Ϊ���ʽ��ֵ
		

		//��ϰ��
		//1��ע����������ʹ����ʱ������temp = i; i = i+1; k = temp; 
		// int i = 1;
		// i = i++;
		// System.out.println(i);


		//2��ͬ��Ҳ����ʱ������i = i + 1;temp = i; k = temp
		// int i = 1;
		// i = ++i;
		// System.out.println(i);//2
		
		//3��
		// int i1 = 10;//11
		// int i2 = 20;//19
		// int i = i1++;
		// System.out.println("i=" + i);//10
		// i = --i2;
		// System.out.println("i=" + i);//19
		// System.out.println("i2=" + i2);//19

		//4�����绹��59��ż٣��ʺ�xx�������㼸��
		// int day = 59 % 7;
		// int week = 59 / 7;
		// System.out.println("��" + week + "������" + day + "��");
		
		//5������һ���������滪���¶ȣ������¶�ת�������¶ȵĹ�ʽΪ�� 5/9(�����¶�-100)������������¶ȶ�Ӧ�������¶�
		double Fahrenheit = 234.5;
		double Celsius = 5.0 / 9 * (Fahrenheit-100);//ע�ⰴ��������ʾ��5/9�Ľ��Ϊ0�����Խ��ֻ����Ϊ0
		System.out.println("234.5�Ļ����¶ȶ�Ӧ�������¶���" + Celsius);
	}
}