//�߼������
//�������Ӷ������(�����ϵ���ʽ),���յĽ��Ҳ��һ��booleanֵ
//��Ϊ���飬1����·�� && ��·�� || ȡ����
//2���߼��� & �߼��� | �߼���� ^
public class LogicalOperators{
	public static void main(String[] args){
		//��ϰ��
		//1��
		// int x = 5;
		// int y = 5;
		// if(x++ == 6 && ++y == 6){
			// x=11;
		// } 
		// System.out.println("x=" + x + ",y=" +y);//6,5
		
		//2��
		// int x=5,y=5;
		// if (x++ == 6 & ++y == 6){
		// 	x=11;
		// }
		// System.out.println("x=" + x + ",y=" +y);//6,6
		
		//3��
		// int x=5,y=5;
		// if (x++ == 5 || y++ == 5){
		// 	x=11;
		// }
		// System.out.println("x=" + x + ",y=" +y);//11,5

		//4��
		// int x=5,y=5;
		// if (x++ == 5 | y++ == 5){
		// 	x=11;
		// }
		// System.out.println("x=" + x + ",y=" +y);//11,6
		
		//5��
		boolean x = true;
		boolean y = true;
		short z = 46;
		if ((z++ == 46)&&(y = true)) z++;//��true������y��������ʽ�Ľ����y��ֵ��Ҳ����true
		if ((x = false)||(++z == 49)) z++;
		System.out.println("z=" + z);//50

	}
}