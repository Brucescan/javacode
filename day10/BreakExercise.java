//break����ϸ��
//break�������ڶ��Ƕ�׵�������ʱ������ͨ����ǩָ��Ҫ��ֹ������һ�����
//��ǩ�Ļ���ʹ��
//label1:{......
//label2:	{......
//label3:		{......
//					break label2;
//				}			
//			}
//		 
//		 }
//(1) break������ָ���˳��Ĳ�
//(2) label1�Ǳ�ǩ���ɳ���Աָ��
//(3) break��ָ�����ĸ�label���˳�������
//(4) ��ʵ�ʵĿ����У�������Ҫʹ��label(��Ϊ����Ŀɶ��Ի���)
//(5) ���û��ָ��break����Ĭ���˳������ѭ����
import java.util.Scanner;
public class BreakExercise{
	public static void main(String[] args){
		// lable1:
		// for (int j = 0;j<4;j++){
		// lable2:
		// 	for(int i = 0;i<10;i++){
		// 		if(i==2){
		// 			System.out.println("i="+i+",j="+j);
		// 			break lable1;
		// 		}
		// 	}
		// }
		// 
		

		//1����ϰ1
		//1-100���ڵ�����ͣ�������͵�һ�δ���20�ĵ�ǰ��
		// int sum = 0;
		// int currentNum = 0;
		// for(int i = 1;i<=100;i++){
		// 	sum+=i;
		// 	if(sum>20){
		// 		currentNum = i;
		// 		break;
		// 	}
		// }
		// System.out.println(currentNum);
		// System.out.println(sum);
		// 
		//2����ϰ2
		Scanner myScanner = new Scanner(System.in);
		String username = "";
		String pwd = "";
		for(int i = 1;i<=3;i++){
			System.out.println("����������");
			username = myScanner.next();
			System.out.println("�������룺");
			pwd = myScanner.next();
			//����˵�����ַ��� �����ݱȽ� ʹ�õ� ����equals������ȥjava�ĵ���ѯ
			//
			//�Ƽ�"����".equals(username) ����д������Ϊ����д�����Ա����ָ������
			if(username.equals("����") && pwd.equals("666") ){
				System.out.println("��¼�ɹ�");
				break;
			}else{
				System.out.println("�㻹��"+(3-i)+"�ε�¼����");
			}
		}

	}
}