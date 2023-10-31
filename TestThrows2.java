package Javaprogram;
importjava.io.IOException;  
public class TestThrows2 {
	void m()IOException{  
		throw new IOException("device error");//checked exception  
		  }  
		void null() throws IOException{  
		main();  
		  }  
		void p(){  
		try{
		null();  
		   }
		catch(Exception e)
		{
		System.out.println("exception handled");
		}  
		}  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestThrows2 obj=new TestThrows2();  
		obj.p();  
		System.out.println("normal flow...");  

	}

}
