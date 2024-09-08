import java.util.Scanner;
public class MutlFor{
	public static void main(String[] args){
		//1、练习1
		// Scanner myScanner = new Scanner(System.in);
		// int score = 0;
		// int totalAverage = 0;
		// int oneAverage = 0;
		// int twoAverage = 0;
		// int threeAverage = 0;
		// int count1 = 0;
		// int count2 = 0;
		// int count3 = 0;
		// for(int i = 0;i < 3;i++){
		// 	for(int j = 0;j < 5;j++){
		// 		System.out.println("输入你的成绩：");
		// 		score = myScanner.nextInt();
		// 		totalAverage += score;
		// 		switch(i){
		// 		case 0:
		// 			oneAverage+=score;
		// 			if(score>60){
		// 				count1++;
		// 			}
		// 			break;
		// 		case 1:
		// 			twoAverage+=score;
		// 			if(score>60){
		// 				count2++;
		// 			}
		// 			break;
		// 		case 2:
		// 			threeAverage+=score;
		// 			if(score>60){
		// 				count3++;
		// 			}
		// 			break;
		// 		}
		// 	}
		// }
		// totalAverage /= 15;
		// oneAverage /= 5;
		// twoAverage /= 5;
		// threeAverage /= 5;
		// System.out.println(totalAverage);
		// System.out.println(oneAverage);
		// System.out.println(twoAverage);
		// System.out.println(threeAverage);
		// System.out.println(count1);
		// System.out.println(count2);
		// System.out.println(count3);

		//2、练习2   九九乘法表
		// for(int i =1;i<=9;i++){
		// 	for(int j =1;j<=i;j++){
		// 		System.out.print(i + "*" + j + "=" + i*j + "\t");
		// 	}
		// 	System.out.print("\n");
		// }

		//3、联系3 空心金字塔
		// int totalLevel = 6;
		// for(int i = 1;i<=totalLevel;i++){
		// 	for(int k = 1;k<=totalLevel-i;k++){
		// 		System.out.print(" ");
		// 	}
		// 	for(int j = 1;j<=2*i-1;j++){
		// 		if(i!=1 && i!=totalLevel){
		// 			if(j==1 || j==2*i-1){
		// 				System.out.print("*");
		// 			}else{
		// 				System.out.print(" ");
		// 			}
		// 		}else{
		// 			System.out.print("*");
		// 		}
		// 	}
		// 	System.out.println("");
		// }
		

		//4、练习4  空心菱形
		//化繁为简
		//1、划出一个5层的下三角形
		//2、画一个小山
		//3、移到中间
		//4、空心操作
		int level = 6;
		int totalLevel = 2*level-1;//计算出总层数
		for (int i = 1;i<=totalLevel;i++){//i代表总层数
			if (i<=level){//整体分为两层，上三角和下三角，两个的整体逻辑相同，
				//唯一不同的是需要计算每次循环打印的次数而已
				int length = 2*i-1;
				//打印空格
				for(int k = 1;k<=level-i;k++){
					System.out.print(" ");
				}
				//打印*号
				for (int j = 1;j<=length;j++){
					//if判断打印空心
					if(j==1 || j==length){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
			}else{
				int length = 2*(2*level-i)-1;
				for(int k = 1;k<=i-level;k++){
					System.out.print(" ");
				}
				for (int j =1;j<=length;j++){
					if(j==1 || j==length){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
			}
			System.out.println("");
			//这是哪个sb写的代码，怎么一句注释都没有，哦~~~~，原来是我的
		}
	}
}