public class HomeWork05{
	public static void main(String[] args){
		// char[] arr1 = {'a','z','b','c'};
		// char[] arr2 = arr1;
		// arr1[2] = '��';

		// for(int i = 0;i<arr2.length;i++){
		// 	System.out.println(arr1[i]+","+arr2[i]);
		// }
		//���
		//a,a
		//z,z
		//������
		//c,c
		


		//ͽ��ߣð��ѭ��
		int[] arr = {23,45,123,5657,1232,2344,129};
		for(int i = 0;i<arr.length-1;i++){//���ѭ�������ѭ������˼�Ǽ��ֱȽ�
			for(int j=0;j<arr.length-i-1;j++){//ÿһ�ֵıȽϴ���
				if(arr[j]>arr[j+1]){
					//�����н���
					arr[j] = arr[j]^arr[j+1];
					arr[j+1] = arr[j]^arr[j+1];
					arr[j] = arr[j]^arr[j+1];
				}

			}
		}
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
		


		//�����Ǹ���ţ�����������
	}
}