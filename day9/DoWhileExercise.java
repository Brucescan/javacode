import java.util.Scanner;
public class DoWhileExercise{
	public static void main(String[] args){
		// int i = 1;
		// int sum = 0;
		// int count = 0; 
		// do{
		// 	if(i%5 == 0 && i%3 != 0){
		// 		count++;
		// 	}
		// 	// System.out.println(i);
		// 	// sum+=i;
		// 	i++;//һ����Ҫ���˼�ѭ����������
		// }while(i<=200);//ע������Ҫ�ӷֺ�
		// // System.out.println(sum);
		// System.out.println(count);
		// 
		
		char answer = 0;
		Scanner myScanner = new Scanner(System.in);
		do{
			System.out.println("��������......");
			System.out.println("bruces�ʣ���Ǯ�� y/n");
			answer = myScanner.next().charAt(0);
		}while(answer != 'y');//�ж������ܹؼ�
	}
}