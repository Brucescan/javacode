public class HomeWork01{
	public static void main(String[] args){
		//下面数组定义正确的是
		String str[] = {'a','b','c'};//错误
		String[] str = {"a","b","c"};//ok
		String[] str = new String{"a","b","c"};//错误
		String str[] = new String[]{"a","b","c"};//ok的
		String[] str = new String[3]{"a","b","c"};//错误 error编译错误
	}
}