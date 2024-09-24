//方法的使用细节
//1、一个方法最多有一个返回值，那么如何返回多个值呢，使用引用类型即可
//2、返回类型可以为任意类型，包含基本数据类型与引用类型
//3、如果方法要求有返回数据类型，则方法体中最后的执行语句必须为return值，而要求返回值类型必须和return的值类型一致或兼容
//4、如果方法是void，则方法体中可以没有return语句，或者只写return；、
//5、注意方法名的命名规范，遵循驼峰命名法
//
//参数列表细节
//1、一个方法可以有0个参数，也可以有多个参数，中间用逗号，隔开
//2、参数类型可以是任何类型，包含基本类型与引用类型
//3、调用带参数的方法时，一定对应着参数列表传入相同类型或兼容类型的参数！
//4、方法定义时的参数称为形式参数，简称形参；方法调用时的参数称为实际参数，简称实参，实参与形参的类型要一致或兼容，个数，顺序必须一致
//
//方法体
//里面写完成功能具体的语句，可以为输入，输出，变量，运算，分支，循环，方法调用，但里面不能再定义方法！即方法不能嵌套使用
public class MethodDetail{
	public static void main(String[] args){
		AA a = new AA();
		if(a.isOdd(1)){
			System.out.println("是奇数");
		}
		a.print(10,10,'#');
	}
}

class AA{
	public boolean isOdd(int num){
		return num%2!=0;
	}

	public void print(int raw,int col,char c){
		for(int i = 0;i<raw;i++){
			for(int j = 0;j<col;j++){
				System.out.print(c);
			}
			System.out.println();
		}
	}
}