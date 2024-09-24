public class HomeWork06{
	public static void main(String[] args){
		Cale c = new Cale(4,2);
		int num1 = c.add();
		int num2 = c.subtract();
		int num3 = c.multiply();
		int num4 = c.except();
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);

		Cale c1 = new Cale(1,0);
		System.out.println(c1.except());
	}
}


class Cale{
	int operand1;
	int operand2;
	public Cale(int operand1,int operand2){
		this.operand1 = operand1;
		this.operand2 = operand2;
	}


	public int add(){
		return this.operand1+this.operand2;
	}
	public int subtract(){
		return this.operand1-this.operand2;
	}
	public int multiply(){
		return this.operand1*this.operand2;
	}
	public int except(){
		if(this.operand2==0){
			System.out.println("´íÎó");
			return -1;
		}
		return this.operand1/this.operand2;
	}
}