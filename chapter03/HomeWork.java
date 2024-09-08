public class HomeWork{
	public static void main(String[] args){
		// System.out.println(10/3);//3
		// System.out.println(10/5);//2
		// System.out.println(10%2);//0
		// System.out.println(-10.5%3);//-1.5
		// //注意，有小数参与的运算，得到的结果是近似值
		// int i = 66;
		// System.out.println(++i+i);//134
		// //在java中下面赋值语句正确的是
		// int num1 = (int)"18";//错误
		// int num2 = 18.0;//错误
		// double num3 = 3d;//正确
		// double num4 = 8;//正确 int => double 自动类型转换
		// int i = 48;char ch = i+1;//错误
		// byte b = 19;short s = b+2;//错误int 给到short了

		String s1 = "18.0";
		double d1 = Double.parseDouble(s1);
		System.out.println(d1);

		char c1 = 'h';
		String s2 = c1 + "";
		System.out.println(s2);
	}
}