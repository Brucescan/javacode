public class MethodExercise{
	public static void main(String[] args){
		MyTools m = new MyTools();
		int[][] arr = {{1,2,3},{3,2,1}};
		m.printArr(arr);
		Person p1 = new Person();
		p1.name = "С��";
		p1.age = 18;
		Person p2 = m.copyPerson(p1);
		System.out.println(p2.name);
		//����ͨ����������Hashcode���������Ƿ��Ƕ�����
		System.out.println(p1==p2);//false
		//˵���Ƕ�����
	}
} 

class MyTools{
	public void printArr(int[][] arr){
		for(int i = 0;i<arr.length;i++){
			for(int j = 0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}



	public Person copyPerson(Person p){
		Person p1 = new Person();
		p1.name = p.name;
		p1.age = p.age;
		return p1;
	}
}

class Person{
	String name;
	int age;
}