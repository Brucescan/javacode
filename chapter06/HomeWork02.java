public class HomeWork02{
	public static void main(String[] args){
		String[] str = {"111","222","333"};
		A02 a = new A02();
		int index = a.find(str,"111");
		if(index==-1){
			System.out.println("û�ҵ�:(");
		}else{
			System.out.println("�ҵ���:) ������"+index);
		}
	}
}


class A02{
	public int find(String[] arr,String a){
		int count = 0;
		for(int i = 0;i<arr.length;i++){
			if(a.equals(arr[i])){
				return i;
			}
		}
		return -1;

	}
}