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
			// Ҳ����ʹ�������н�������
			// ԭ��1��(a^b)^b = a;2��(a^b)^a = b
			// 
			// ֤��ԭ��1
			// a^0 = a;(����֤��)
			// a^a = 0;(����֤��)
			// (a^b)^b = a^(b^b) = a^0 = a(֤���ɹ�)
			// �ڶ������һ��ͬ��
			// ��������֤��˵��ͨ��������㽻��������a��b��ֵ�����ǿ��Եõ�a��b�Ľ������
			// ���Կ���ͨ�������ķ�ʽ���н���
			// a = a ^ b;
			// b = a ^ b;
			// a = a ^ b;
			// 
			// ����ĵڶ������ (a^b)^b ��b��ֵ�����a
			// ������ a���ǵ���a^b,���ڵڶ�����b�����a�����������ұ߱��ʽ���(a^b)^a���Ҳ�ͱ����b
			// 
		}
		System.out.println(Arrays.toString(arr1));
	}
}