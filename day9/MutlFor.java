import java.util.Scanner;
public class MutlFor{
	public static void main(String[] args){
		//1����ϰ1
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
		// 		System.out.println("������ĳɼ���");
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

		//2����ϰ2   �žų˷���
		// for(int i =1;i<=9;i++){
		// 	for(int j =1;j<=i;j++){
		// 		System.out.print(i + "*" + j + "=" + i*j + "\t");
		// 	}
		// 	System.out.print("\n");
		// }

		//3����ϵ3 ���Ľ�����
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
		

		//4����ϰ4  ��������
		//����Ϊ��
		//1������һ��5�����������
		//2����һ��Сɽ
		//3���Ƶ��м�
		//4�����Ĳ���
		int level = 6;
		int totalLevel = 2*level-1;//������ܲ���
		for (int i = 1;i<=totalLevel;i++){//i�����ܲ���
			if (i<=level){//�����Ϊ���㣬�����Ǻ������ǣ������������߼���ͬ��
				//Ψһ��ͬ������Ҫ����ÿ��ѭ����ӡ�Ĵ�������
				int length = 2*i-1;
				//��ӡ�ո�
				for(int k = 1;k<=level-i;k++){
					System.out.print(" ");
				}
				//��ӡ*��
				for (int j = 1;j<=length;j++){
					//if�жϴ�ӡ����
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
			//�����ĸ�sbд�Ĵ��룬��ôһ��ע�Ͷ�û�У�Ŷ~~~~��ԭ�����ҵ�
		}
	}
}