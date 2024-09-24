public class VarParameterExercise{
	public static void main(String[] args){
		Methods my = new Methods();
		my.showScore("老王",50,78,89);
		my.showScore("胡辣汤",10,79,100);
		my.showScore("水煎包",6,6,6);
	}
}


class Methods{
	public void showScore(String name,double... score){
		double sum = 0;
		for(int i = 0;i<score.length;i++){
			sum+=score[i];
		}
		System.out.println(name+",你的总成绩是"+sum);
	}
}