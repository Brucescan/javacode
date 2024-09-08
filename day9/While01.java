//这几种循环没有什么本质的区别，只是循环四要素的位置不同而已
//
//循环条件是返回一个bool值的表达式
//while循环是先判断再执行语句
//
public class While01{
	public static void main(String[] args){
		int i = 0;//循环变量初始化
		while(i<10){//循环条件
			System.out.println("hello,world!"+i);//循环语句执行
			i++;//循环变量迭代
		}
	}
}