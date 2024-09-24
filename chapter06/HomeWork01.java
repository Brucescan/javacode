public class HomeWork01{
	public static void main(String[] args){
		double[] arr = {1.2,3.4,8.1,9.0,10};
		//注意数组有两种特殊情况，长度为0与null，这两种情况我们都要避免
		A01 a = new A01();
		Double res = a.max(arr); 
		if(res!=null){
			System.out.println("最大值是"+res);
		}else{
			System.out.println("输入有误");
		}
	}
}

class A01{
	public Double max(double[] arr){
		if(arr.length==0||arr==null){
			System.out.println("数组越界");
			return null;//因为对象可以为空，但double不行，，
			//所以我们要返回一个Double对象
		}
		double max = 0;
		for(int i = 0;i<arr.length;i++){
			max = max>arr[i]?max:arr[i];
		}
		return max;
	}
}