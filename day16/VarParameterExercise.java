public class VarParameterExercise{
	public static void main(String[] args){
		Methods my = new Methods();
		my.showScore("����",50,78,89);
		my.showScore("������",10,79,100);
		my.showScore("ˮ���",6,6,6);
	}
}


class Methods{
	public void showScore(String name,double... score){
		double sum = 0;
		for(int i = 0;i<score.length;i++){
			sum+=score[i];
		}
		System.out.println(name+",����ܳɼ���"+sum);
	}
}