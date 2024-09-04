package _SpecificInterviewPrograms;

public class upperandlower {
public static void main(String[] args) {
	String s = "Wel Come To Java Progarm";
	s=s.replace(" ", "");
	int upper=0;
	int lower=0;
	for(int i=0; i<s.length(); i++) {
		char ch=s.charAt(i);
		if(ch>=65&&ch<=95) {
			upper++;
		}
		else {
			lower++;
		}
	}
	System.out.println(upper);
	System.out.println(lower);
}
}
