public class HomeWork03{
	public static void main(String[] args){
		Book b1 = new Book("��¥��",100.8);
		System.out.println(b1.price);
		b1.updatePrice();
		System.out.println(b1.price);
		System.out.println("============�ڶ�����=============");
		Book b2 = new Book("���μ�",200.8);
		System.out.println(b2.price);
		b2.updatePrice();
		System.out.println(b2.price);

	}
}


class Book{
	double price;
	String name;
	public Book(String name,double price){
		this.name = name;
		this.price = price;
	}


	public void updatePrice(){
		if(this.price>150){
			this.price = 150;
		}else if(this.price>100){
			this.price = 100;
		}
	}
}