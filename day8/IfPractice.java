public class IfPractice{
	public static void main(String[] args){
		// int x = 7;
		// int y = 4;
		// if (x>5){
		// 	if (y>5){
		// 		System.out.println(x + y);
		// 	}else {
		// 		System.out.println("666");
		// 	}
		// } else{
		// 	System.out.println("x=" + x);
		// }
		

		//2����д������������double��������ֵ���жϵ�һ��������10.0���ҵڶ�����С��20.0����ӡ����֮��;
		// double d1 = 11.8;
		// double d2 = 13.654;
		// if (d1 > 10.0 && d2 < 20.0){
		// 	System.out.println(d1+d2+"�������µ�һ˧B");
		// }

		//3��������������int���ж����ߺͣ��ܷ�3���ܱ�5��������ӡ��ʾ��Ϣ
		// int x = 10;
		// int y = 5;
		// if ((x+y)%3==0 && (x+y)%5==0){
		// 	System.out.println("�������µ�һ˧B");
		// }

		//4���ж�һ������Ƿ������꣬����������Ƿ�����������֮һ��(1)�ܱ�4�����������ܱ�100���� (2)�ܱ�400����
		int year = 2001;
		if((year%4==0 && year%100!=0) || year%400==0){
			System.out.println("������");
		}else{
			System.out.println("��������");
		}
	}
}