
/**
 * Write a description of class ResProperty here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ResProperty extends Property
{

    private char typeres;
    private int numroom;
    private int numbathroom;

    public  ResProperty()
    {}

    public  ResProperty(char typeproperty, String name, String contact,int month, char typeres,int numroom, int numbathroom)
    {
        super (typeproperty,name, contact, month);
        setTypeRes( typeres);
        setNumRoom( numroom);
        setNumBathRoom(numbathroom);
    }

    public char getTypeRes ()
    {
        return  typeres;

    }

    public int  getNumRoom()
    {
        return numroom;
    }

    public int getNumbathRoom()
    {
        return numbathroom ;
    }

    public void setTypeRes (char  typeres)
    {
        this.  typeres =  typeres;
    }

    public void setNumRoom( int numroom )
    {
        this.  numroom =numroom;
    }

    public void  setNumBathRoom(int numbathroom)
    {
        this.  numbathroom=numbathroom;
    }

    public double calcMonthRent()
    {
        double rent =0;
        if (typeres =='F')
        {
            rent =8000+  (500* numroom);
        }
        else if (typeres =='T')
        {
            rent = 15000+ ( 1000* numroom);
        } 
        else if (typeres =='H')
        {
            rent = 12000+ ( 800* numroom);
        } 
        return rent;

    }

    @Override 
    public String toString()
    {
        String str= String.format("%s%-10.2f",super.toString(), calcMonthRent());
        return str;
    }


    
}
