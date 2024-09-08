public class ForExercise{
	public static void main(String[] args){
		// 练习1
		// int sum = 0;
		// int count = 0;
		// for(int i = 1;i<=100;i++){
		// 	if (i%9==0){
		// 		sum += i;
		// 		count++;
		// 	}
		// }
		// System.out.println("个数是" + count + ",总和是" + sum);
		

		// 练习2
		int count = 5;
		for(int i = 0;i<=count;i++){
			System.out.println(i+"+"+(count-i)+"="+count);
		}

		//这里有两个编程思想，化繁为简和先死后活
		//化繁为简 即将复杂的东西拆解为简单的东西
		//先死后活 先可以把东西写死，然后看看能不能让自己的程序更加灵活一点
	}
}