import java.util.Scanner;
public class HomeWork14{
	public static void main(String[] args){
		int count = 0;
		double sum = 0;
		Computer c = new Computer();
		Scanner myScanner = new Scanner(System.in);
		while(true){
			System.out.println("ÊäÈë¼ô×Ó°ü¸¤´¸(0ÊÇÊ¯Í·£¬1ÊÇ¼ôµ¶£¬2ÊÇ²¼£¬-1ÊÇÍË³ö)");
			int answer = myScanner.nextInt();
			if(answer == -1){
				break;
			}else if(answer==0||answer==1||answer==2){
				switch(answer){
				case 0:
					if(c.randint() == 2){
						count++;
						System.out.println("Õâ¾ÖÄãÓ®ÁË");
					}else if(c.randint()==0){
						System.out.println("Õâ¾ÖÆ½¾Ö");
					}else{
						System.out.println("Õâ¾ÖÄãÊäÁË");
					}
					sum++;
					System.out.println("ÄãÄ¿Ç°µÄÊ¤ÂÊÊÇ"+count/sum*100+"%");
					break;
				case 1:
					if(c.randint() == 0){
						count++;
						System.out.println("Õâ¾ÖÄãÓ®ÁË");
					}else if(c.randint()==1){
						System.out.println("Õâ¾ÖÆ½¾Ö");
					}else{
						System.out.println("Õâ¾ÖÄãÊäÁË");
					}
					sum++;
					System.out.println("ÄãÄ¿Ç°µÄÊ¤ÂÊÊÇ"+count/sum*100+"%");
					break;
				case 2:
					if(c.randint() == 1){
						count++;
						System.out.println("Õâ¾ÖÄãÓ®ÁË");
					}else if(c.randint()==2){
						System.out.println("Õâ¾ÖÆ½¾Ö");
					}else{
						System.out.println("Õâ¾ÖÄãÊäÁË");
					}
					sum++;
					System.out.println("ÄãÄ¿Ç°µÄÊ¤ÂÊÊÇ"+count/sum*100+"%");
					break;

				}
			}else{
				System.out.println("Ê«ÈËÎÕ³Ö£¡");
			}
		}
	}
}


class Computer{
	public int randint(){
		return (int)(Math.random()*3);
	}
}