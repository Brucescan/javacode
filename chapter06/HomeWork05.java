public class HomeWork05{
	public static void main(String[] args){
		Circle c1 = new Circle();
		c1.showCircleCircumference(3);
		c1.showCircleArea(4);
	}
}


class Circle{
	double PI = 3.1415926;
	double radius;
	public void showCircleCircumference(double radius){
		System.out.println("你的周长是：）  " + 2*PI*radius);
	}
	public void showCircleArea(double radius){
		System.out.println("你的面积是：）  " + 4*PI*radius*radius);
	}
}