//成员方法的好处
public class Method02{
	public static void main(Strinng[] args){
		//使用传统方法去解决我们的需求
		int[][] map = {{0,0,1},{1,1,1},{1,1,3}};

		//遍历map数组
		//传统的解决方法就是直接遍历
		// for(int i = 0;i<map.length;i++){
		// 	for(int j = 0;j<map[i].length;j++){
		// 		System.out.print(map[i][j]+" ");
		// 	}
		// 	System.out.println();
		// }

		//如果我们要求再次遍历数组的话会发现代码重复率太高
		//所以虽然我们可以使用传统方法去解决，但是不够好，所以我们需要新的技术，成员方法
		
		//解决思路2，定义一个类MyTools，然后写一个成员方法。接受一个二维数组
		MyTools tool = new MyTools();
		tool.printArr(map);
		tool.printArr(map);
		tool.printArr(map);
		tool.printArr(map);
		//成员方法的好处，1，提高了代码的复用性 2、可以将实现的细节封装起来，然后供其他用户来进行调用
				

	}
}


class MyTools{
	public void printArr(int[][] map){
		for(int i = 0;i<map.length;i++){
			for(int j = 0;j<map[i].length;j++){
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
	}
}