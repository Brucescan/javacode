public class HomeWork01{
	public static void main(String[] args){
		//˼·����
		//1������һ����¼Ǯ�ı��� double money = 100000;��һ����¼·�ڴ����ı���int num = 0;
		//2����ΪҪʹ��break����Ҫ��������ѭ����ֻ���ڽ�����ʱ��Ż���������ѭ��
		//3��
		double money = 100000;
		int num = 0;
		while(money!=0){
			// System.out.println(num);
			if(money>50000){
				money = money*(1-0.05);
				num++;
			}else if(money <= 50000 && money > 1000){
				money-=1000;
				num++;
			}else if(money < 1000){
				break;
			}
			// System.out.println(money);
		}
		System.out.println(money);
		System.out.println(num);
	}
}