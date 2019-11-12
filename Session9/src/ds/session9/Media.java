package ds.session9;

public class Media{

	public void Media(String onlywhencalled) {
		// TODO Auto-generated constructor stub
		System.out.println("This is the Media Class and is parent of all Media child classes");
	}
	public void TypeMedia(String type)
	{
		System.out.println("This method is in class Media and is called by Child class" + type);
	}
	
	public void MainStreamResource(String resource)
	{
		System.out.println("This method is called from main class to highlight main Stream resource for public outreach which is : " + resource);
	}
	
	
}
