package MethodOverriding;

class bank{
	int getrateofinterst() {
		return 0;
	}
}
class sbi extends bank{
	int getrateofinterst() {
		return 4;
	}
}
class icici extends bank{
	int getrateofinterst() {
		return 6;
	}
}
class axis extends bank{
	int getrateofinterst() {
		return 8;
	}
}
class idfc extends bank{
	int getrateofinterst() {
		return 9;
	}
}
public class BankInterest {
public static void main(String[] args) {
	idfc f = new idfc();
	System.out.println("Rate of Interest to IDFC bank : "+f.getrateofinterst()+"%");
	axis a = new axis();
	System.out.println("Rate of Interest to AXIS bank : "+a.getrateofinterst()+"%");
	icici i = new icici();
	System.out.println("Rate of Interest to ICICI bank : "+i.getrateofinterst()+"%");
	sbi s = new sbi();
	System.out.println("Rate of Interest to SBI bank : "+s.getrateofinterst()+"%");
}
}
