public class Human {
  private String name; // private = restricted access

  // Getter
  public String getName() {
    return name;
  }

  // Setter
  public void setName(String newName) {
    this.name = newName;
    System.out.println("I am inside setter" + this.name);
    
  }
  public static void main(String[] args)
  {
	  Human h1 = new Human();
	  h1.setName("Dhanjeet");
	  System.out.println("I am inside getter" + h1.getName());
  }
}