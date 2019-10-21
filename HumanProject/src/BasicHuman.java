public class BasicHuman {
    
    
    public BasicHuman(String name,int age, int height){
        System.out.println("Name of human: "+ name);
        System.out.println("Age of human: "+ age);
        System.out.println("Height of human: "+ height);
        
    }
    public static void main(String[] args) {
        BasicHuman newHuman = new BasicHuman("Lincoln", 22, 5);
    }
}