import java.util.Arrays;
public class ArrayCopy{
	public static void main(String[] args){
		// ��ɿ���������ʹ�ò�ͬ�����ݿռ�
		// int[] arr1 = {10,20,30};
		// int[] arr2 = new int[arr1.length];
		// for(int i = 0;i<arr1.length;i++){
		// 	arr2[i] = arr1[i];
		// }
		// System.out.println(Arrays.toString(arr1));
		// System.out.println(Arrays.toString(arr2));
		// arr2[0] = 30;
		// System.out.println(Arrays.toString(arr1));
		// System.out.println(Arrays.toString(arr2));
		


		// Array����ҲΪ�����ṩ��һ�ּ��ķ���
		int[] arr1 = {10,20,30};
		int[] arr2;
		//��һ����������Ҫ��������������ƣ��ڶ���������������ĳ��ȣ��������ͨ��������������Ĵ�С
		//���������������ֵ�ͣ���ô�����Ԫ�ؽ�����ֵΪ0���������������boolean�ͣ��򽫱���ֵΪfalse
		//�෴���������С��ԭʼ����ĳ��ȣ���ֻ����ǰ���ֵ
		arr2 = Arrays.copyOf(arr1,2*arr1.length);
		System.out.println(Arrays.toString(arr2));
	}
}