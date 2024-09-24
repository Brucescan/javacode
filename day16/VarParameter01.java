//可变参数，java允许将同一个类中多个同名同功能但参数个数不同的方法，封装成一个方法
public class VarParameter01{
	public static void main(String[] args){
		Methods my = new Methods();
		System.out.println("求和结果是"+my.sum(1,2));


		//可变参数的细节
		//1、可变参数的实参可以是0个或者多个
		//2、可变参数的实参可以是一个数组
		//3、可变参数的本质是一个数组
		
		//4、可变参数可以和普通类型的形参放在一起，但必须保证可变参数在最后
		//5、一个形参列表只能出现一个可变参数
	}
} 

class Methods{
	//int... 表示接受的是可变参数，类型是int，即可以接受多个int(0-多个)
	//使用可变参数时，可以当做数组来使用，即下面的a可以当做数组来使用
	public int sum(int... a){
		System.out.println("参数个数是"+a.length);
		int sum = 0;
		for(int i = 0;i<a.length;i++){
			sum+=a[i];
		}
		return sum;
	}
	//这样我们就完成了一个不定参数的开发
}