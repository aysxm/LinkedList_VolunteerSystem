

public class Participant
{
    private String name;
    private String age;
    private String country;
    private double household;
    private int programme;
    
    public Participant()
    {
        name=null;
        age=null;
        country=null;
        household=0.0;
        programme=0;
    }
    
    public Participant(String n,String a, String c,double h, int p)
    {
        name=n;
        age=a;
        country=c;
        household=h;
        programme=p;
    }
    
    public String getName(){return name;}
    public String getAge(){return age;}
    public String getCountry(){return country;}
    public double getHousehold(){return household;}
    public int getProgramme(){return programme;}
    
    
    public String toString()
    {
        return "\nName Participant:" + getName() + "\nAge:" + getAge() + "\nCountry:" + getCountry() + "\nTotal Household:" + getHousehold() + "\nType of programme:" + getProgramme();
    }
}
