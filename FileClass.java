
/**
 * Write a description of class FileClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import java.util.ArrayList;
public class FileClass
{
    ArrayList<Propable> arrPro = new ArrayList<Propable>();

    int count = 0;

    public void readFromFile()
    {
        try
        {
            Scanner sc = new Scanner(new FileReader("properties.txt" ));

            while (sc.hasNext())
            {
                String line = sc.nextLine();
                String [] info = line.split("#");

                char typeproperty = info[0].charAt(0);
                String name = info[1];
                String contact = info[2];
                int month = Integer.parseInt(info[3]);

                if(typeproperty == 'R')
                {
                    char typeres = info[4].charAt(0);
                    int numroom = Integer.parseInt(info[5]);
                    int numbathroom = Integer.parseInt(info[6]);
                    arrPro.add(new ResProperty(typeproperty, name, contact, month, typeres, numroom, numbathroom));
                }
                else
                {
                    int size = Integer.parseInt(info[4]);
                    arrPro.add(new BussProperty(typeproperty, name, contact, month, size));
                }
                count++;
            }
            sc.close();   

        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error reading file");
        }
    }

    public ArrayList<Propable> getArray()
    {
        return arrPro;
    }

    public int getCount()
    {
        return count;
    }

    public void writeTownHToFile()
    {
        try
        {
            PrintWriter file = new PrintWriter(new FileWriter("townhouses.txt" ));

            for ( int k = 0; k < count; k++)
            {
                if(arrPro.get(k) instanceof ResProperty)
                {
                    if(((ResProperty)arrPro.get(k)).getTypeRes() == 'T')
                    {
                        String output = String.format("%-15s%-15sR%-15.2f",((Property)arrPro.get(k)).getName(),((Property)arrPro.get(k)).getContact(),arrPro.get(k).calcMonthRent());
                        file.println(output);
                    }
                }
            }
            file.close();
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error writing to the file");
        }
    }

}

