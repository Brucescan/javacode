//重载
//允许一个类中，多个同名方法的存在，但要求形参列表不一致
//重载可以帮助我们减轻起名的麻烦
//利于我们的接口变成
public class OverLoad{
	public static void main(String[] args){

	}
}

class MyCalculator{
	//下面这四个方法构成了重载
	public int calculate(int n1,int n2){
		return n1+n2;
	}
	public double calculate(int n1,double n2){
		return n1+n2;
	}
	public double calculate(double n1,int n2){
		return n1+n2;
	}
	public int calculate(int n1,int n2,int n3){
		return n1+n2+n3;
	}
}