
/**
 * Generates your Star Wars name
 * 
 * @author Richard Shepard
 * @version 2.14.2015
 */
public class NameGenerator
{
    String firstName;
    String lastName;
    String maiden;
    String born;

    public NameGenerator(String firstName, String lastName, String maiden, String born) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.maiden = maiden;
        this.born = born;
    }

    public String generateStarWarsName() {
        String newFirst = "";
        String newLast = "";
        String newName = "";
        newFirst = lastName.substring(0,3).toLowerCase() + firstName.substring(0,2).toLowerCase();
        newLast = maiden.substring(0, 2).toLowerCase() + born.substring(0, 3).toLowerCase();
        newName = newFirst + " " + newLast;
        return newName;
        
    }
   
}

























