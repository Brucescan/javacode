//方法的传参机制，基本数据类型，引用数据类型的传参机制
public class MethodParameter{
	public static void main(String[] args){
		// int a = 10;
		// int b = 20;
		// AA c = new AA();
		// c.swap(a,b);
		// System.out.println("a="+a+",b="+b);
		// 
		// 
		int[] arr = {20,100,20,17,50};
		AA a = new AA();
		a.test100(arr);
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
		Person man = new Person();
		man.name = "777";
		a.test200(man);
		System.out.println(man.name);//666
	}
}


//可以看到参数的传递对于基本数据类型来说只是简单的值传递，并不会将地址赋给形参，所以实际上a与b并没有交换
//可以看到参数的传递对于引用数据类型来说是引用传递，会将地址赋给形参


class AA{
	public void swap(int a,int b){
		//完成a与b的交换
		int tmp = a;
		a=b;
		b=tmp;
		System.out.println("a="+a+",b="+b);
	}
	public void test100(int[] arr){
		arr[0] = 10;
	}

	public void test200(Person man){
		man.name = "666";
	}
}

class Person{
	String name;
	int age;
}