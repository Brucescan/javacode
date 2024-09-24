public class HomeWork09{
	public static void main(String[] args){
		Music m = new Music("七里香","5:20");
		m.play();
		String[] str;
		str = m.getInfo();
		for(int i = 0;i<str.length;i++){
			System.out.println(str[i]+"\t");
		}
	}
}


class Music{
	String name;
	String times;
	public Music(String name,String times){
		this.name = name;
		this.times = times;
	}
	public void play(){
		System.out.println(this.name + "正在播放中。。。。" + "时长" + this.times);
	}
	public String[] getInfo(){
		String[] str = new String[2];
		str[0] = this.name;
		str[1] = this.times;
		return str;
	}
}