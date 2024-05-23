package interfaceSample; 

public class ExampleInter implements Test { 
	 
	public static void printOne() { 
		System.out.println("Interface Testing"); 
	} 
 
	public static void main(String[] args) { 
		ExampleInter obj=new ExampleInter(); 
		obj.print(); 
		obj.display(); 
		printOne(); 
	} 
 
	@Override 
	public void print() { 
		System.out.println("Interface Example"); 
		 
		System.out.println("a="+a); 
	} 
 
	@Override 
	public void display() { 
		System.out.println("Interface Class"); 
	} 
 
}