//Êý×é¸³ÖµµÄ»úÖÆ
//»ù±¾Êý¾ÝÀàÐÍ¸³Öµ£¬Õâ¸öÖµ¾ÍÊÇ¾ßÌåµÄÊý¾Ý£¬¶øÇÒ»¥²»Ó°Ïì
//
//Êý×éÔÚÄ¬ÈÏÇé¿öÏÂÊÇÒýÓÃ´«µÝ£¬¸³µÄÖµÊÇµØÖ·¡£(ÖØµãÊÇ·ÖÎöÊý×éµÄÄÚ´æÍ¼)
public class ArrayAssign{
	public static void main(String[] args){
		int n1 = 10;
		int n2 = n1;

		n2 = 80;
		System.out.println("n1="+n1);
		System.out.println("n2="+n2);
		//ÎÒÃÇ¿ÉÒÔ¿´µ½n1²¢Ã»ÓÐÊÜµ½n2µÄÓ°Ïì£¬ÎÒÃÇ°ÑÕâÖÖ¸³ÖµµÄ·½Ê½³ÆÎªÖµ¿½±´;
		
		//Êý×éÀàÐÍ ÊÇÒýÓÃ´«µÝ£¬´«µÝµÄÊÇµØÖ·£¬ËùÒÔn2µÄ±ä»¯»áÓ°Ïìµ½n1µÄÖµ,¸³Öµ·½Ê½ÎªÒýÓÃ´«µÝ
		int[] arr1 = {1,2,3};
		int[] arr2 = arr1;//°Ñarr1µÄµØÖ·¸³¸øÁËarr2

		arr2[0] = 4;
		for(int i = 0;i < 3;i++){
			System.out.print(arr1[i]);
		}
		System.out.println();
		for(int i = 0;i < 3;i++){
			System.out.print(arr2[i]);
		}
		//���ô����ֳ�Ϊ��ַ����
		
	}
}