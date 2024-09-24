public class HomeWork04{
	public static void main(String[] args){
		int[] arr = new int[10];
		for(int i = 0;i<arr.length;i++){
			//生成1-100的随机数 (int)(Math.random()*100) + 1
			arr[i] = (int)(Math.random()*100) + 1;
		}

		for(int i = arr.length-1;i>=0;i--){
			System.out.print(arr[i]+"\t");
		}
		int sum = 0;
		for(int i = 0;i<arr.length;i++){
			sum += arr[i];
		}

		System.out.println("平均值是"+(sum/arr.length));
		int max = 0;
		int min = 0;
		for(int i = 0;i<arr.length;i++){
			max = max>arr[i]?max:arr[i];
			min = min<arr[i]?min:arr[i];
		}
		System.out.println("最大值是" + max + " 最小值是" + min);

		for(int i = 0;i<arr.length;i++){
			if(arr[i]==8){
				System.out.println("有8这个值！");
			}
		}


	}
}