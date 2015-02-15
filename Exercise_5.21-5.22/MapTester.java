import java.util.HashMap;
/**
 * Write a description of class MapTester here.
 * 
 * @author Richard Shepard
 * @version 2.12.2015
 */
public class MapTester
{
    HashMap<String, String> phoneBook;

    /**
     * Constructor for objects of class MapTester
     */
    public MapTester()
    {
        phoneBook = new HashMap<String, String>();
    }
    
    public void enterNumber(String name, String number) {
        phoneBook.put(name, number);
    }

    public String lookupNumber(String name) {
        String val = phoneBook.get(name);
        return val;
    }
}
