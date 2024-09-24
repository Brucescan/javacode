import java.util.Arrays;
public class ArrayReverse{
	public static void main(String[] args){
		int[] arr1 = {11,22,33,44,55,66,77};
		int length = arr1.length;
		for(int i = 0;i<length/2;i++){
			int temp = 0;
			temp = arr1[i];
			arr1[i] = arr1[length-i-1];
			arr1[length-i-1] = temp;
			// 也可以使用异或进行交换两数
			// 原理1、(a^b)^b = a;2、(a^b)^a = b
			// 
			// 证明原理1
			// a^0 = a;(无需证明)
			// a^a = 0;(无需证明)
			// (a^b)^b = a^(b^b) = a^0 = a(证明成功)
			// 第二个与第一个同理
			// 以上两个证明说明通过异或运算交换两个数a和b的值，我们可以得到a和b的交换结果
			// 所以可以通过这样的方式进行交换
			// a = a ^ b;
			// b = a ^ b;
			// a = a ^ b;
			// 
			// 这里的第二步变成 (a^b)^b 即b的值变成了a
			// 第三部 a还是等于a^b,而在第二步中b变成了a，所以最终右边表达式变成(a^b)^a最后也就变成了b
			// 
		}
		System.out.println(Arrays.toString(arr1));
	}
}