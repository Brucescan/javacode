public class HomeWork01{
	public static void main(String[] args){
		//思路分析
		//1、定义一个记录钱的变量 double money = 100000;和一个记录路口次数的变量int num = 0;
		//2、因为要使用break所以要跳出整个循环，只有在结束的时候才会跳出整个循环
		//3、
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