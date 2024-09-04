package _SpecificInterviewPrograms;

public class StackOverFlowError_Exception {

	public static void main(String[] args) {
		new StackOverFlowError_Exception().add(1);
	}
	public void add(int i) {
		System.out.println(i);
		i++;
		add(i);
	}
}
