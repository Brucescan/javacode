//逻辑运算符
//用于连接多个条件(多个关系表达式),最终的结果也是一个boolean值
//分为两组，1，短路与 && 短路或 || 取反！
//2、逻辑与 & 逻辑或 | 逻辑异或 ^
public class LogicalOperators{
	public static void main(String[] args){
		//练习题
		//1、
		// int x = 5;
		// int y = 5;
		// if(x++ == 6 && ++y == 6){
			// x=11;
		// } 
		// System.out.println("x=" + x + ",y=" +y);//6,5
		
		//2、
		// int x=5,y=5;
		// if (x++ == 6 & ++y == 6){
		// 	x=11;
		// }
		// System.out.println("x=" + x + ",y=" +y);//6,6
		
		//3、
		// int x=5,y=5;
		// if (x++ == 5 || y++ == 5){
		// 	x=11;
		// }
		// System.out.println("x=" + x + ",y=" +y);//11,5

		//4、
		// int x=5,y=5;
		// if (x++ == 5 | y++ == 5){
		// 	x=11;
		// }
		// System.out.println("x=" + x + ",y=" +y);//11,6
		
		//5、
		boolean x = true;
		boolean y = true;
		short z = 46;
		if ((z++ == 46)&&(y = true)) z++;//将true赋给了y，这里表达式的结果是y的值，也就是true
		if ((x = false)||(++z == 49)) z++;
		System.out.println("z=" + z);//50

	}
}