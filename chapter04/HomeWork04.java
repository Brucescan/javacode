public class HomeWork04{
	public static void main(String[] args){
		//1¡¢Á·Ï°1
		// for(int i =1;i<=100;i++){
		// 	if(i%6==0){
		// 		System.out.print(i);
		// 		System.out.println("");
		// 		continue;
		// 	}else if(i%5==0){
		// 		continue;
		// 	}
		// 	System.out.print(i+"\t");
		// }
		// 
		

		//2¡¢Á·Ï°2
		// for(char i = 'a';i<='z';i++){
		// 	System.out.print(i);
		// 	System.out.print((char)(i-32));
		// 	System.out.println("");
		// }
		

		//3¡¢Á·Ï°3
		// double sum = 0;
		// for(int i =1;i<=100;i++){
		// 	sum = -(sum + 1.0/i);
		// }
		// System.out.println(sum);
		

		//4¡¢Á·Ï°4
		
		int outSum =0;
		for(int i =1;i<=100;i++){
			int innerSum = 0;
			for(int j =1;j<=i;j++){
				innerSum += i;
			}
			outSum += innerSum;
		}
		System.out.println(outSum);
	}
}