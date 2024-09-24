public class HomeWork13{
	public static void main(String[] args){
		Circle c = new Circle();
		PassObject p = new PassObject();
		p.printAreas(c,5);
	}
}


class Circle{
	double PI = 3.1415926;
	double radius;
	public double findArea(double radius){
		return radius*radius*PI;
	}
}

class PassObject{
	public void printAreas(Circle c,int times){
		System.out.println("Radius\tArea");
		for(int i = 1;i<=times;i++){
			c.radius = i;
			System.out.println(c.radius+"\t"+c.findArea(i));
		}
	}
}