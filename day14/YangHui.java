public class YangHui{
	public static void main(String[] args){
		int[][] arr = new int[10][];
		for(int i = 0;i<arr.length;i++){
			arr[i] = new int[i+1];//创建数组
			for(int j = 0;j<arr[i].length;j++){
				//判断第一个和最后一个输出位1，其余位置使用等于上面两个加1
				if(j==0||j==arr[i].length-1){
					arr[i][j] = 1;
				}else{
					arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
				}
				
			}
		}
		//打印输出
		for(int i = 0;i<arr.length;i++){
			for(int j = 0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}