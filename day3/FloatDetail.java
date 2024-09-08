//浮点数细节
//1、在机器中的存放形式是，浮点数=符号位+指数位+尾数位
//2、尾数部分可能丢失，造成精度损失(小数都是近似值)
public class FloatDetail{
	public static void main(String[] args){
		//1、与整型类似，java浮点类型也有固定的范围与字段长度，不受操作系统的影响
		
		//2、java的浮点型常量默认为double类型，声明float型常量，需要后加"f"或"F"
		// float n1 = 1.1;//不对，因为常量默认为double类型，会溢出
		// float n2 = 1.1F;//这个是对的
		// double n3 = 1.1f;//这个也是对的

		//3、浮点型常量表示方法有两种，十进制数形式，科学计数法形式
		// double n4 = 5.12;//十进制形式
		// double n5 = 512.0f;//十进制形式
		// double n6 = .512;//十进制形式
		// double n7 = 5.12e2;//科学计数法形式,为什么是512.0而不是512(运行后类型还是double,所以后会加个.0)
		// double n8 = 5.12E-2;//科学计数法形式
		
		//4、通常形式下我们使用double型,因为他更加的精确
		// double n9 = 2.1234567851;
		// float n10 = 2.1234567851f;
		// System.out.println(n9);
		// System.out.println(n10);
		
		//5、浮点数使用陷阱2.7 与8.1/3进行比较
		double n11 = 2.7;
		double n12 = 8.1 / 3;
		// System.out.println(n11);//2.7
		// System.out.println(n12);//2.699999997
		//
		//得到一个重要的小数点；当我们对运算结果是小数的进行相等判断时要小心
		//应该是以两个数的差值的绝对值，在某个精度范围内判断
		// System.out.println(Math.abs(n11-n12));
		if (Math.abs(n11-n12) < 0.0000001){
			System.out.println("这俩货相等");
		}
	}
}