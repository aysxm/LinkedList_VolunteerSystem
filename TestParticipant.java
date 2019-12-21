import java.util.ListIterator;
import java.util.Scanner;

public class TestParticipant
{
    public static void main(String[] args)
    {
      Scanner s= new Scanner(System.in);
      int count=1,programme,enter,enter2;
      double household, totalmalay = 0.0,totaljapan = 0.0,totalpakistan = 0.0;
      String country,search,name,age,delete;
      LinkedList participantList = new LinkedList();
      LinkedList spoilList = new LinkedList();
      LinkedList tempList = new LinkedList();
      Queue toRemove = new Queue();
      
      do
      {
        System.out.println("Insert Participant name : ");
        name = s.next();
      
        System.out.println("Insert age of Participant : ");
        age = s.next();
      
        System.out.println("Insert Participant country  (malaysia/japan/pakistan) : ");
        country = s.next();
      
        System.out.println("Insert how many household : RM ");
        household = s.nextDouble();
      
        System.out.println("Insert Participant programme : (1- EDUCATION PROGRAMME || 2-FAMILY HEALTH PROGRAMME || 3- COMMUNITY SERVICE PROGRAMME)");
        programme = s.nextInt();
      
        System.out.println("Do you want to enter another participant? : (1= yes || 2= no)");
        enter = s.nextInt();

        Participant data=new Participant(name,age,country,household,programme);
        participantList.insertPersonDetail(data);

      }while(enter!=2);
      
      //list object
      Participant p;
      Object a;

      //display..Sorting all participant according to country (display all)
      System.out.print("List of participant by country :\n\n");
      int counters =0;
      a=participantList.getFirst();
      while(a!=null)
      {
          p=(Participant)a;
          if(!p.getCountry().equalsIgnoreCase("malaysia"))//with alphabet sort
          {
              System.out.println("|" + counters + "|\t" + a.toString());
          }
          else if(!p.getCountry().equalsIgnoreCase("japan"))
          {
              System.out.println("|" + counters + "|\t" + a.toString());
          }
          else
          {
              System.out.println("|" + counters + "|\t" + a.toString());
          }
          counters++;
          a=participantList.getNext();
          System.out.print("\n");
      }
      System.out.println("\n");

      //get household
      //count total participant from each country
      //calculate average participant according to country
      a = participantList.getFirst();
      int countmalay = 0, countjapan = 0, countpakistan = 0;
      while (a!= null)
      {
          p = (Participant)a;
          if(p.getCountry().equalsIgnoreCase("Malaysia"))
          {
              countmalay++;
              household=household+p.getHousehold()-p.getHousehold();
              totalmalay= household / countmalay;
            }
          else if(p.getCountry().equalsIgnoreCase("Japan"))
          {
              countjapan++;
              household=household+p.getHousehold()-p.getHousehold();
              totaljapan = household /  countjapan;
          }
          else if(p.getCountry().equalsIgnoreCase("Pakistan"))
          {   
              countpakistan++;
              household=household+p.getHousehold()-p.getHousehold();
              totalpakistan =   household /   countpakistan  ;
          }
          a= participantList.getNext();
      }
        
      System.out.println("Total participant from Malaysia :" + countmalay);
      System.out.println("Total participant from japan :" + countjapan);
      System.out.println("Total participant from Pakistan :" + countpakistan);
      int totalallparticipant = countmalay + countjapan +  countpakistan;
      System.out.println("Total all participant :" + totalallparticipant);
      System.out.println("\n");
      
      //min @ max highest participant according to country
      int highest = 0;
      int lowest = 0;
      String str = " ";
          if(highest< countmalay)
          {
              highest = countmalay;
          }
          else if(highest< countjapan)
          {
              highest = countjapan;
          }
           else if(highest< countpakistan)
          {
              highest = countpakistan;
          }
          //find lowest
          
          if(highest> countmalay)
          {
              lowest =countmalay;
          }
          else if(highest> countjapan)
          {
              lowest =countjapan;
          }
          else if(highest> countpakistan)
          {
              lowest = countpakistan;
          }
          else if (highest> countpakistan||highest> countjapan||highest> countmalay)
               System.out.println("no lowest");
      //output highest
      if(highest==countmalay)
         System.out.println("Highest total participant (country malaysia : ) "+ highest);
      if(highest==countjapan)
         System.out.println("Highest total participant (country japan : ) "+ highest);    
      if(highest==countpakistan)
         System.out.println("Highest total participant (country pakistan : ) "+ highest);
      System.out.println("\n");   
      //output lowest
      if(lowest==countmalay)
         System.out.println("lowest total participant (country malayisia : ) "+ lowest);
      if(lowest==countjapan)
         System.out.println("lowest total participant (country japan : ) "+ lowest);    
      if(lowest==countpakistan)
         System.out.println("lowest total participant (country pakistan : ) "+ lowest);
      System.out.println("\n");
      //output average
      System.out.println("Total average from Malaysia :" + totalmalay);
      System.out.println("Total average from japan :" + totaljapan);
      System.out.println("Total average from Pakistan :" + totalpakistan);
      System.out.println("\n");
      
      //find participant
   do
   {
      System.out.println(" do you want to search? 1 = yes/ 2 = no");
      enter=s.nextInt();
      if(enter==1)
      {
      System.out.println("what are you searching ? (name/country/age/household/programme)");
      search=s.next();
      if(search.equalsIgnoreCase("country"))
      {
            System.out.println("what country you are searching ? ");
            country=s.next();
            a = participantList.getFirst();
            while(a!=null)
            {
                p=(Participant)a;
                if(p.getCountry().equalsIgnoreCase(country))
                {
                    System.out.println("available :");
                    System.out.println(a.toString());
                }
                    a= participantList.getNext();
            }
            while(a!=null)
            {
                p=(Participant)a;
                if(!p.getCountry().equalsIgnoreCase(country))
                    System.out.println("not available");
                a= participantList.getNext();
            }
      }
      if(search.equalsIgnoreCase("name"))
      {
            System.out.println("what name you are searching ? ");
            name=s.next();
            a = participantList.getFirst();
            while(a!=null)
            {
                p=(Participant)a;
                if(p.getName().equalsIgnoreCase(name))
                {
                    System.out.println("available :");
                    System.out.println(a.toString());
                }
                    a= participantList.getNext();
            }
            while(a!=null)
            {
                p=(Participant)a;
                if(!p.getName().equalsIgnoreCase(name))
                    System.out.println("not available");
                a= participantList.getNext();
            }
      }
      if(search.equalsIgnoreCase("age"))
      {
            System.out.println("what age you are searching ? ");
            age=s.next();
            a = participantList.getFirst();
            while(a!=null)
            {
                p=(Participant)a;
                if(p.getAge().equalsIgnoreCase(age))
                {
                    System.out.println("available :");
                    System.out.println(a.toString());
                }

                    a= participantList.getNext();
            }
            while(a!=null)
            {
                p=(Participant)a;
                if(!p.getAge().equalsIgnoreCase(age))
                    System.out.println("not available");
                a= participantList.getNext();
            }
      }
      if(search.equalsIgnoreCase("programme"))
      {
            System.out.println("what programme you are searching ? (1- EDUCATION PROGRAMME || 2-FAMILY HEALTH PROGRAMME || 3- COMMUNITY SERVICE PROGRAMME)");
            programme=s.nextInt();
            a = participantList.getFirst();
            while(a!=null)
            {
                p=(Participant)a;
                if(p.getProgramme()==programme)
                {
                    System.out.println("available :");
                    System.out.println(a.toString());
                }
                
                    a= participantList.getNext();
            }
            while(a!=null)
            {
                p=(Participant)a;
                if(p.getProgramme()!=programme)
                    System.out.println("not available");
                a= participantList.getNext();
            }
      }
      if(search.equalsIgnoreCase("household"))
      {
            double minrange,maxrange;
            System.out.println("what is your minimum range?");
            minrange=s.nextDouble();
            System.out.println("what is your maximum range?");
            maxrange=s.nextDouble();
            System.out.println("\n");
            a = participantList.getFirst();
            while(a!=null)
            {
                p=(Participant)a;
                if((p.getHousehold()>=minrange)&&(p.getHousehold()<=maxrange))
                {
                    System.out.println("available :");
                    System.out.println(a.toString());
                }
                
                    a= participantList.getNext();
            }
            while(a!=null)
            {
                p=(Participant)a;
                if((p.getHousehold()!=minrange)&&(p.getHousehold()!=maxrange))
                {
                    System.out.println("not available :");
                    System.out.println(a.toString());
                }
                
                    a= participantList.getNext();
            }
      }
    }
    else if(enter==2)
        break;
    System.out.println("continue searching? 1 = yes/ 2 = no");
    enter2=s.nextInt();
  }while(enter2!=1);
  
  //delete and copy participant who not in the country list
  //queue happens
  a = participantList.getFirst();
  while(a!=null)
  {
    p=(Participant)a;
    if((!p.getCountry().equalsIgnoreCase("malaysia"))&&(!p.getCountry().equalsIgnoreCase("japan"))&&(!p.getCountry().equalsIgnoreCase("pakistan")))
    {
        toRemove.enqueue(p);
        spoilList.insertPersonDetail(p);
    }
    else
    {
        tempList.insertPersonDetail(p);
    }
    participantList.removeFromFront();
    a = participantList.getFirst();
  }
  
  a = tempList.getFirst();
  while(a!=null)
  {
      participantList.insertPersonDetail(a);
      tempList.removeFromFront();
      a = tempList.getFirst();
  }
  
  //update list of participant
  System.out.println("update list : ");
  a = participantList.getFirst();
  while(a!=null)
  {
      System.out.println(a.toString());   
      a = participantList.getNext();
  }
  System.out.println("\n");
  
  //show the detail of person that was remove from participantList
  System.out.println("person that was remove because it doesn't fulfill our requirement : ");
  a = spoilList.getFirst();
  while(a!=null)
  {
      System.out.println(a.toString());
      toRemove.dequeue();
      a = spoilList.getNext();
  }
 }
}
