public class HomeWork04{
	public static void main(String[] args){
		int[] arr = {1,2,3,3,4,5};
		A03 a = new A03();
		int[] arrNew;
		arrNew = a.copyArr(arr);
		System.out.println("===========拷贝后的数组============");
		for(int i = 0;i<arrNew.length;i++){
			System.out.println(arrNew[i]+"\t");
		}
	}
}

class A03{
	public int[] copyArr(int[] arr){
		int[] arrNew = new int[arr.length];
		for(int i = 0;i<arr.length;i++){
			arrNew[i] = arr[i];
		}
		return arrNew;
	}
}