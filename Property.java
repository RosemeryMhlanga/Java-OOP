
/**
 * Write a description of class Property here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public abstract class Property implements Propable
{
    private char typeproperty;
    private String name;
    private String contact;
    private int month;

    public Property()
    {}

    public Property(char typeproperty, String name, String contact,int month)
    {
         // SET YOUR ATTRIBUTE  
        setTypeProperty(typeproperty);
        setName(name);
        setContact(contact);
        setMonth(month);

    } 

    public char getTypeProperty()
    { 
        return typeproperty; 
    }

    public String getName()
    { 
        return name; 
    } 

    public String getContact()
    { 
        return contact ; 
    }

    public int getMonth()
    {
        return month;
    }

    public void setTypeProperty(char typeproperty )
    {
        this.typeproperty = typeproperty;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setContact(String contact)
    {
        this.contact= contact;
    }

    public void setMonth(int month)
    {
        this.month= month ;
    }
    
    public abstract double calcMonthRent();

    public String ToString()
    {
        String str = String.format("%-15s%-10s%-10s",name,contact,month);
        return str;
    }

}

