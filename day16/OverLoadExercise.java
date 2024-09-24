public class OverLoadExercise{
	public static void main(String[] args){
		//1¡¢
		//b,c,d,e
		
		//2¡¢
		Methods my = new Methods();
		my.m(5);
		my.m(10,3);
		my.m("777");
		System.out.println(my.max(3,5));
		System.out.println(my.max(3.1,5.6));
		System.out.println(my.max(3.4,5.9,8.1));
	}
}

class Methods{
	public void m(int n){
		System.out.println(n*n);
	} 
	public void m(int m,int n){
		System.out.println(m*n);
	}
	public void m(String str){
		System.out.println(str);
	}


	public int max(int x,int y){
		return x>y?x:y;
	}
	public double max(double a,double b){
		return a>b?a:b;
	}
	public double max(double a,double b,double c){
		return (a>b?a:b)>c?(a>b?a:b):c;
	}
}