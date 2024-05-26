package INTERVIEWPROGRAM19countoccuernceStringsingleletter;

public class countocceranceanother {
	public static void main(String[] args) {
		String s = "tejesh";
		int count=0;
		for(char ch :s.toCharArray()) {
			if(ch=='t') {
				count++;
			}
		}
		System.out.println("toal count occurence :"+count);
	}

}
