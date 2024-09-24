import java.util.Scanner;
public class ArrayExercise01{
	public static void main(String[] args){
		// char[] letters = new char[26];
		// for(int i = 0;i<26;i++){
		// 	letters[i] = (char)('A'+i);
		// }
		// System.out.println("==============");
		// for(int i = 0;i<26;i++){
		// 	System.out.print(letters[i]);
		// }
		

		int[] a = {4,-1,9,10,23};
		int max = 0;
		int maxNum = 0;
		for(int i = 0;i<a.length;i++){
			max = max>a[i] ? max : a[i];
		}
		System.out.println("最大值是"+max);
	}
}