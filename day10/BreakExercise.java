//break语句的细节
//break语句出现在多层嵌套的语句块中时，可以通过标签指明要终止的是哪一层语句
//标签的基本使用
//label1:{......
//label2:	{......
//label3:		{......
//					break label2;
//				}			
//			}
//		 
//		 }
//(1) break语句可以指定退出哪层
//(2) label1是标签，由程序员指定
//(3) break后指定到哪个label就退出到哪里
//(4) 在实际的开发中，尽量不要使用label(因为程序的可读性会变差)
//(5) 如果没有指定break，则默认退出最近的循环体
import java.util.Scanner;
public class BreakExercise{
	public static void main(String[] args){
		// lable1:
		// for (int j = 0;j<4;j++){
		// lable2:
		// 	for(int i = 0;i<10;i++){
		// 		if(i==2){
		// 			System.out.println("i="+i+",j="+j);
		// 			break lable1;
		// 		}
		// 	}
		// }
		// 
		

		//1、练习1
		//1-100以内的数求和，求出当和第一次大于20的当前数
		// int sum = 0;
		// int currentNum = 0;
		// for(int i = 1;i<=100;i++){
		// 	sum+=i;
		// 	if(sum>20){
		// 		currentNum = i;
		// 		break;
		// 	}
		// }
		// System.out.println(currentNum);
		// System.out.println(sum);
		// 
		//2、练习2
		Scanner myScanner = new Scanner(System.in);
		String username = "";
		String pwd = "";
		for(int i = 1;i<=3;i++){
			System.out.println("输入姓名：");
			username = myScanner.next();
			System.out.println("输入密码：");
			pwd = myScanner.next();
			//补充说明，字符串 的内容比较 使用的 方法equals，具体去java文档查询
			//
			//推荐"丁真".equals(username) 这种写法，因为这种写法可以避免空指针问题
			if(username.equals("丁真") && pwd.equals("666") ){
				System.out.println("登录成功");
				break;
			}else{
				System.out.println("你还有"+(3-i)+"次登录机会");
			}
		}

	}
}