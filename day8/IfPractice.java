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
		

		//2、编写程序，声明两个double变量并赋值，判断第一个数大于10.0，且第二个书小于20.0，打印两数之和;
		// double d1 = 11.8;
		// double d2 = 13.654;
		// if (d1 > 10.0 && d2 < 20.0){
		// 	System.out.println(d1+d2+"我是天下第一帅B");
		// }

		//3、定义两个变量int，判断两者和，能否被3又能被5整除，打印提示信息
		// int x = 10;
		// int y = 5;
		// if ((x+y)%3==0 && (x+y)%5==0){
		// 	System.out.println("我是天下第一帅B");
		// }

		//4、判断一个年份是否是闰年，闰年的条件是符合下面两者之一：(1)能被4整除，但不能被100整除 (2)能被400整除
		int year = 2001;
		if((year%4==0 && year%100!=0) || year%400==0){
			System.out.println("是闰年");
		}else{
			System.out.println("不是闰年");
		}
	}
}