import java.util.Arrays;
public class ArraySort{
	public static void main(String[] args){
		//����ķ���
		//1���ڲ�����
		//ָ����Ҫ������������ݶ����ص��ڲ��洢���н������򣬰���(����ʽ���򷨣�ѡ��ʽ���򷨣�����ʽ����)
		//2���ⲿ����
		//�����������޷�ȫ�����ص��ڴ��У���Ҫ�����ⲿ�洢�������򡣰���(�ϲ����򷨺�ֱ�Ӻϲ�����)
		int[] arr = {123,345,23,567,11,96,234,345,124};
		// for(int i = 0;i<arr.length;i++){
		// 	for(int j = i+1;j<arr.length;j++){
		// 		if(arr[i]>arr[j]){
		// 			arr[i] = arr[i]^arr[j];
		// 			arr[j] = arr[i]^arr[j];
		// 			arr[i] = arr[i]^arr[j];
		// 		}
		// 	}
		// }
		//ð������
		for(int i = 0;i<arr.length-1;i++){
			for(int j = 0;j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1]){
					arr[j] = arr[j]^arr[j+1];
					arr[j+1] = arr[j]^arr[j+1];
					arr[j] = arr[j]^arr[j+1];
				}
			}
		}
		

		System.out.println("����������===================");
		System.out.println(Arrays.toString(arr));
		
	}
}