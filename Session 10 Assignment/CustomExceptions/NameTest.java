package ds.CustomExceptions;
public class NameTest {
    public static void main(String[] args) {
        NameManager manager = new NameManager();
 
        try {
 
            Nameds nameds = manager.namematch("test");
 
        } catch (NameNotFoundException ex) {
            System.err.print(ex);
        }
    }
}