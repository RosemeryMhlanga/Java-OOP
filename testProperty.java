
/**
 * Write a description of class testProperty here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class testProperty
{
    public static void main(String[]args)
    {
        ArrayList<Propable> arrPro = new ArrayList<Propable>();

        FileClass file = new FileClass();

        file.readFromFile();

        arrPro = file.getArray();

        displayResidential(arrPro);
        displayBusiness(arrPro);

        file.writeTownHToFile();
    }

    public static void displayResidential(ArrayList<Propable> arrPro)
    {
        System.out.printf("Residence Property\n%-25s %-15s %-15s %-10s %-10s %-10s %-10s\n", "Name", "Cell Num", "Months", "Type", "Beds", "Baths", "Rent(pm)");

        for(int k = 0; k < arrPro.size(); k++)
        {
            if(arrPro.get(k) instanceof ResProperty)
            {
                if(arrPro.get(k) != null)
                {
                    System.out.printf("%s\n", (arrPro.get(k)).toString()); 
                }
            }
        }
    }
    
    public static void displayBusiness(ArrayList<Propable> arrPro)
    {
        System.out.printf("\nBusiness Property\n%-25s %-15s %-15s%-10s %-15s %-10s\n", "Name", "Cell Num", "Months", "Size", "Insurance", "Rent(pm)");
        
        
        for(int k = 0; k < arrPro.size(); k++)
        {
            if(arrPro.get(k) instanceof BussProperty)
            {
                if(arrPro.get(k) != null)
                {
                   System.out.printf("%s\n", (arrPro.get(k)).toString()); 
                }
            }
        }
    }
}
