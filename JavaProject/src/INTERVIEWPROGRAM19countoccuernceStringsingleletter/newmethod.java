package INTERVIEWPROGRAM19countoccuernceStringsingleletter;

public class newmethod {
public static void main(String[] args) {
	String s ="tejesh";
	int count=0;
	for(char ch : s.toCharArray()) {
		if(ch == 'e') {
			count++;
		}
	}
	System.out.println("count of occurence :"+count); 
}
}
