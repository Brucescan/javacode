//字符串类型转基本数据结构
//基本数据结构转字符串类型
public class StringToBasic{
	public static void main(String[] args){
		//基本类型转字符串类型 基本类型值+""即可
		// int n1 = 100;
		// float n2 = 1.1F;
		// double n3 = 3.4;
		// boolean b1 = true;
		// String str1 = n1 + "";
		// String str2 = n2 + "";
		// String str3 = n3 + "";
		// String str4 = b1 + "";
		// System.out.println(str1 + " " + str2 + " " + str3 + " " + str4);
		
		//字符串类型转基本类型，通过基本类型的包装类调用parsexxx方法即可
		//下面是 使用 基本类型对应的包装类，的相应方法，得到基本的数据类型
		//注意，字符串得到字符，是指把字符串的第一个字符得到
		// String s5 = "123";
		// int n1 = Integer.parseInt(s5);
		// double n2 = Double.parseDouble(s5);
		// float n3 = Float.parseFloat(s5);
		// long n4 = Long.parseLong(s5);
		// byte n5 = Byte.parseByte(s5);
		// boolean b1 = Boolean.parseBoolean("true");
		// System.out.println(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + b1);

		//细节处理
		// System.out.println(s5.charAt(1));//结果为2，因为这帮老外是从0开始数的
		//1、将String类型转换为基本数据类型时，要确保转换后的数据有效，例如，不能将“hello”转换为整数类型
		String str = "hello";
		int n1 = Integer.parseInt(str);
		System.out.println(n1);//这个编译是可以的，运行会导致程序异常终止
		//下面这些就是异常提示
		// Exception in thread "main" java.lang.NumberFormatException: For input string: "hello"
        // at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        // at java.lang.Integer.parseInt(Integer.java:580)
        // at java.lang.Integer.parseInt(Integer.java:615)
        // at StringToBasic.main(StringToBasic.java:32)

		//2、如果格式不正确，就会抛出异常，这个问题后面学
	}
}