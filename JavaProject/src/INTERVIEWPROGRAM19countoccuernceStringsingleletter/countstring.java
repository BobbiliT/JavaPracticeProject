package INTERVIEWPROGRAM19countoccuernceStringsingleletter;

public class countstring {
	public static void main(String[] args) {
		String name = "bobbili tejeswara rao";
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) != ' ') { // ' ' -> its indicater if there is any blank space in the string then you
											// should put this symbol
				count++; // on the condition it will not count the space.
			}
		}
		System.out.println("total count string is :" + count);
	}

}
