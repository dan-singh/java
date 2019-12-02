package ds.CustomExceptions;

public class Nameds {

	public Nameds() {
		// TODO Auto-generated constructor stub
	}
	public void check(int n){

		try{
		int a = n/0;
		}
		catch(NumberFormatException ex){
			System.out.println("Number format exception occrure");
		}
		catch(Exception ex){
			System.out.println("Exception happened");
		}finally{
			System.out.println("completed");
		}

		System.out.println("Program Completed");

		}
}

