package INTERVIEWPROGRAM19countoccuernceStringsingleletter;

public class countoccerence {
	public static void main(String[] args) {
		String s = "tejesh";
		int totalcount = s.length();
		int totalcount_afterremove = s.replace("e", "").length();
		int count = totalcount - totalcount_afterremove;
		System.out.println("count of occerance :" + count);
	}

}
