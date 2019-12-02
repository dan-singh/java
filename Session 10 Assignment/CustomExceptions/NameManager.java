package ds.CustomExceptions;
public class NameManager {
 
    public Nameds namematch(String namestring) throws NameNotFoundException {
        if (namestring.equals("test")) {
            //throw new NameFoundException("Hey there! System could not find student with name " + namestring);
            return new Nameds();
            } 
        else {
            throw new NameNotFoundException("Hey there! System could not find student with name " + namestring);
        }
    }
}