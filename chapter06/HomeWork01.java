public class HomeWork01{
	public static void main(String[] args){
		double[] arr = {1.2,3.4,8.1,9.0,10};
		//ע�������������������������Ϊ0��null��������������Ƕ�Ҫ����
		A01 a = new A01();
		Double res = a.max(arr); 
		if(res!=null){
			System.out.println("���ֵ��"+res);
		}else{
			System.out.println("��������");
		}
	}
}

class A01{
	public Double max(double[] arr){
		if(arr.length==0||arr==null){
			System.out.println("����Խ��");
			return null;//��Ϊ�������Ϊ�գ���double���У���
			//��������Ҫ����һ��Double����
		}
		double max = 0;
		for(int i = 0;i<arr.length;i++){
			max = max>arr[i]?max:arr[i];
		}
		return max;
	}
}