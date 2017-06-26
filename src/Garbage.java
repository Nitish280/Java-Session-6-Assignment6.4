/*
 * Here we are creating a program to show how the unreferenced 
 * object are collected by the Garbage Collector.
 * Here we are created a class Garbage
 */
public class Garbage {
//here we are taking the main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Here we are 
		 Garbage s1=new Garbage();  
		 Garbage s2=new Garbage();  
		  s1=null;  
		  s2=null;  
		  System.gc();  

	}
	public void finalize(){
	System.out.println("object is garbage collected");
}
}
