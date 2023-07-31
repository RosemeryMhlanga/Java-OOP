

/**
 * Write a description of class ResProperty here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BussProperty extends Property
{

    private int size;

    public BussProperty()
    {}

    public  BussProperty(char typeproperty, String name, String contact,int month,  int size)
    {
        super (typeproperty,name,contact, month);
        setSize(size);
    }

    public int getSize ()
    {
        return size;

    }

    public void setSize (int size)
    {
        this. size =  size;
    }

    
    public double calcMonthRent()
    {
        double rent =0;

        rent = size *250;
        return rent;

    }
    public double calcMonthInsurance()
    {
        double insurance  =0;

        insurance = calcMonthRent() *0.10;
        return insurance;

    }
    
    @Override 
    public String toString()
    {
        String str= String.format("%s%-10.2f%-10.2f",super.toString(),calcMonthRent(), calcMonthInsurance());
        return str;
    }


    
}

