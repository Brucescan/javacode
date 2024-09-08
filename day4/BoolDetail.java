//占用一个字节
public class BoolDetail{
	public static void main(String[] args){
		boolean pass = true;
		if (pass){
			System.out.println("通过考试");
		} else {
			System.out.println("你个蠢货");
		}
		//有一点细节，不可以0或者非0表示true或者false，这点与c语言不同
	}
}