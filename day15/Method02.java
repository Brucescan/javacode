//��Ա�����ĺô�
public class Method02{
	public static void main(Strinng[] args){
		//ʹ�ô�ͳ����ȥ������ǵ�����
		int[][] map = {{0,0,1},{1,1,1},{1,1,3}};

		//����map����
		//��ͳ�Ľ����������ֱ�ӱ���
		// for(int i = 0;i<map.length;i++){
		// 	for(int j = 0;j<map[i].length;j++){
		// 		System.out.print(map[i][j]+" ");
		// 	}
		// 	System.out.println();
		// }

		//�������Ҫ���ٴα�������Ļ��ᷢ�ִ����ظ���̫��
		//������Ȼ���ǿ���ʹ�ô�ͳ����ȥ��������ǲ����ã�����������Ҫ�µļ�������Ա����
		
		//���˼·2������һ����MyTools��Ȼ��дһ����Ա����������һ����ά����
		MyTools tool = new MyTools();
		tool.printArr(map);
		tool.printArr(map);
		tool.printArr(map);
		tool.printArr(map);
		//��Ա�����ĺô���1������˴���ĸ����� 2�����Խ�ʵ�ֵ�ϸ�ڷ�װ������Ȼ�������û������е���
				

	}
}


class MyTools{
	public void printArr(int[][] map){
		for(int i = 0;i<map.length;i++){
			for(int j = 0;j<map[i].length;j++){
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
	}
}