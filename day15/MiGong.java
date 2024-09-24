public class MiGong{
	public static void main(String[] args){
		//1¡¢ÏÈ´´½¨ÃÔ¹¬£¬Ê¹ÓÃÒ»¸ö¶þÎ¬Êý×é
		//2¡¢¹æ¶¨mapÊý×é£¬0±íÊ¾¿ÉÒÔ×ß£¬1±íÊ¾Ç½(²»ÄÜ×ß)
		int[][] map = new int[8][7];
		//3¡¢ÉèÖÃËÄÖÜµÄÇ½
		for(int i = 0;i<7;i++){
			map[0][i] = 1;
			map[7][i] = 1;
		}
		for(int i = 0;i<8;i++){
			map[i][0] = 1;
			map[i][6] = 1;
		}
		map[3][1] = 1;
		map[3][2] = 1;

		//4¡¢Êä³öµ±Ç°µÄµØÍ¼½øÐÐ¼ì²é
		System.out.println("==========µ±Ç°µØÍ¼Çé¿ö==========");
		for(int i = 0;i<8;i++){
			for(int j = 0;j<7;j++){
				System.out.print(map[i][j]+"\t");
			}
			System.out.println();
		}
		//5¡¢Ð´×ßÃÔ¹¬Ëã·¨
		Tool t = new Tool();
		if(t.run(map,1,1)){
			System.out.println("¹§Ï²Äã");
		}else{
			System.out.println("ÄãÎÝÁË");
		}
		//ÕÒÂ·µÄÇé¿öÈçÏÂ¡£
		System.out.println("==========ÕÒÂ·ºóµØÍ¼Çé¿ö==========");
		for(int i = 0;i<8;i++){
			for(int j = 0;j<7;j++){
				System.out.print(map[i][j]+"\t");
			}
			System.out.println();
		}
	}
}


class Tool{
	//Ê¹ÓÃµÝ¹é»ØËÝµÄË¼ÏëÀ´½â¾öÀÏÊó³öÃÔ¹¬
	//1¡¢run·½·¨¾ÍÊÇ×¨ÃÅÀ´ÕÒÃÔ¹¬µÄÂ·¾¶µÄ
	//2¡¢Èç¹ûÕÒµ½ÁË¾Í·µ»Øtrue£¬Ã»ÓÐ¾Í·µ»Øfalse
	//3¡¢ÕâÀïµÄiÓëj±íÊ¾ÀÏÊóµ±Ç°µÄÎ»ÖÃ,³õÊ¼»¯µÄÎ»ÖÃÎª1,1
	//4¡¢µÝ¹éÍË³öµÄÌõ¼þ£¬ÎÒÃÇÏÈ¹æ¶¨
	//0 ±íÊ¾¿ÉÒÔ×ß 1±íÊ¾ÕÏ°­Îï 2±íÊ¾¿ÉÒÔ×ß£¬Óë0²»Í¬£¬±íÊ¾ÎÒÃÇ±ê¼Ç¹ýµÄ×ß¹ýµÄÂ· 3±íÊ¾ÎÒÃÇ×ß¹ýµ«ÊÇ×ß²»Í¨ËÀÂ·
	//6¡¢µ±map[6][5]==2Ê±£¬ËµÃ÷ÎÒÃÇµÄÂ·¾Í×ßÍ¨ÁË£¬·ñÔò¾Í¼ÌÐøÕÒ
	//7¡¢ÕÒÂ·µÄ²ßÂÔ£¬ÏÂ->ÓÒ->ÉÏ->×ó£¬ÕâÊÇÓÅÏÈ¼¶
	//8¡¢¿ÉÒÔ³¢ÊÔ×Ô¼º¸Ä±ä²ßÂÔÀ´½øÐÐÕÒÑ°¿´¿´Â·¾¶ÊÇ·ñÓÐ±ä»¯
	public boolean run(int[][] map,int i,int j){
		if(map[6][5]==2){//ÕÒµ½³ö¿ÚÁË
			return true;
		}else{
			if(map[i][j]==0){//µ±Ç°Õâ¸öÎ»ÖÃ0£¬ËµÃ÷¿ÉÒÔ×ß
				//ÎÒÃÇ¼Ù¶¨¿ÉÒÔ×ßÍ¨
				map[i][j]=2;
				//Ê¹ÓÃÕÒÂ·²ßÂÔÀ´²âÊÔ´ËÂ·ÄÜ²»ÄÜ×ßÍ¨
				if(run(map,i+1,j)){//ÏÂ
					return true;
				}else if(run(map,i,j+1)){//ÓÒ
					return true;
				}else if(run(map,i-1,j)){//ÉÏ
					return true;
				}else if(run(map,i,j-1)){//×ó
					return true;
				}else{//ËÄÖÖ¶¼²»ÐÐµÄ»°£¬ËµÃ÷¼Ù¶¨ÊÇ´íµÄ
					map[i][j] = 3;
					return false;
				}
			}else{//±íÊ¾   1,2,3  ËµÃ÷ÎÒÃÇÒÑ¾­²âÊÔ¹ýÁË£¬²»ÄÜÔÙÍùÇ°×ßÁË
				return false;
			}
		}
	}
}