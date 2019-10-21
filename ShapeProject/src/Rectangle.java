public class Rectangle extends ShapeBasic{
   public static void main(String args[]){
      Rectangle obj = new Rectangle();
      obj.display();
     //obj.b=200;
      int lenght = obj.l;
      int breadth = obj.b;
      //
      obj.calculateArea();
  }
private int area  = l*b;;
  public void calculateArea(){
  System.out.println("The area of the rectangle is: " + this.area);
  }
}