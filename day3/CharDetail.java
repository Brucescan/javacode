//字符类型可以表示单个字符，字符类型是char
//多个字符我们使用String，后面会讲
public class CharDetail{
	public static void main(String[] args){
		// char c1 = 'a';
		// char c2 = '\t';
		// char c3 = '韩';
		// char c4 = 97;//说明：字符类型可以直接存放一个数字
		// System.out.println(c1);
		// System.out.println(c2);
		// System.out.println(c3);
		// System.out.println(c4);//当输出c4的时候，会输出97这个数字所表示的那个字符ascii码值
		
		//1、字符常量使用单引号('')括起来的单个字符，
		// char c1 = 'a';
		// char c2 = '中';
		// char c3 = '9';

		//2、java中还允许使用转义字符'\'来将其后的字符转变为特殊字符型常量，'\n'表示换行
		
		//3、在java中，字符类型的本质是一个整数，在输出时，会输出对应的unicode码对应的字符
		int n1 = 'a' + 'b';
		char c0 = 'a' + 2;
		System.out.println(n1);
		System.out.println(c0);

		//4、可以直接给char赋一个整数，然后输出时，会按照对应的unicode字符输出
		char c1 = 'a';
		char c2 = '\t';
		char c3 = '韩';
		char c4 = 97;//说明：字符类型可以直接存放一个数字
		System.out.println((int)c1);
		System.out.println((int)c2);
		System.out.println((int)c3);
		System.out.println((int)c4);//当输出c4的时候，会输出97这个数字所表示的那个字符ascii码值

		//5、char类型是可以进行运算的，相当于一个整数，因为他们都有对应的unicode码  
	}
}