//整型数据类型的使用

public class Integer{
	public static void main(String[] args){
		//有哪些整型数据类型，byte(1),short(2),int(4),long(8)
		// byte n1 = 10;
		// short n2 = 10;
		// int n3 = 10;
		// long n4 = 10;
		//虽然放的都是10，但是空间大小是不一样的
		//
		//整型的细节
		//1、java各整数类型有固定的范围与字段长度，不受具体操作系统的影响，以保证java程序的可移植性
		
		//2、java整型常量默认为int型，声明long型常量需要后加“l”或者"L"
		// int n1 = 1;//4个字节
		// int n2 = 1L;//不对，因为后面这个是long型常量，赋给4个字节的会报错
		// long n3 = 1L;//这个是对的
		
		//3、java变量通常使用int就可以，除非不足以表达大数才用long
		
		//4、位是计算机中的最小存储单位，一个字节等于8位
	}
}


