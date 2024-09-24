public class Hanoi{
	public static  void main(String[] args){
		Test t = new Test();
		t.run(5,'A','B','C');
	}
}

class Test{
	public void run(int n,char a,char b,char c){
		if(n==1){
			System.out.println(a+"->"+c);
		}else{
			run(n-1,a,c,b);
			System.out.println(a+"->"+c);
			run(n-1,b,a,c);
		}
	}
}