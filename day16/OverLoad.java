//����
//����һ�����У����ͬ�������Ĵ��ڣ���Ҫ���β��б�һ��
//���ؿ��԰������Ǽ����������鷳
//�������ǵĽӿڱ��
public class OverLoad{
	public static void main(String[] args){

	}
}

class MyCalculator{
	//�������ĸ���������������
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