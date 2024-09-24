public class HomeWork08{
	int count = 9;
	public void count1(){
		count = 10;
		System.out.println("count1="+count);
	}

	public void count2(){
		System.out.println("count1="+count);
	}
	public static void main(String[] args){
		new HomeWork08().count1();
		HomeWork08 t1 = new HomeWork08();
		t1.count2();//9
		t1.count2();//9
	}
} 