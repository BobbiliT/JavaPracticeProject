package HierarchicalInheritance;

class age1{
	int i=30;
}
class age2 extends age1{
	int j=20;
}
class age3 extends age1{
	int k=10;
}
public class ByUsingInt {
public static void main(String[] args) {
	age3 a = new age3();
	System.out.println(a.k);
	System.out.println(a.i);
	age2 aa= new age2();
	System.out.println(aa.j);
	System.out.println(aa.i);
}
}
// hierarchical inheritance is the one of the inheritance which multiple child class inherit the properties and methods 
// of the same parent class 
//  Hierarchical inheritance not reduce the code length but it is also increase the code modular
