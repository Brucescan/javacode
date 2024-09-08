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
		// 	i++;//一定不要忘了加循环变量迭代
		// }while(i<=200);//注意这里要加分号
		// // System.out.println(sum);
		// System.out.println(count);
		// 
		
		char answer = 0;
		Scanner myScanner = new Scanner(System.in);
		do{
			System.out.println("五连鞭中......");
			System.out.println("bruces问：还钱吗？ y/n");
			answer = myScanner.next().charAt(0);
		}while(answer != 'y');//判断条件很关键
	}
}