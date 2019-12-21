
public class LinkedList{ 
    
private Node head,last,current;

public LinkedList()
{
    head=last=current=null;
}

public boolean isEmpty()
{
    return head==null;
}

//method 1 : insert person details refer as insertAtFront()
public void insertPersonDetail(Object elem)
{
    if(isEmpty())
       head=last=new Node(elem);
    else
      {
       head=new Node(elem,head);
      }
}

//get first
public Object getFirst() 
{
    if(isEmpty())
    {
        return null;
    }
    else
    {
        current=head;
        return head.data;
    }
} 

//get next
 public Object getNext() 
    {    
        if (current == last) 
            return null; 
        else 
        { 
            current = current.next; 
            return current.data; 
        }                
    } 

//method 2 delete participant
public Object removeFromFront() 
{    
        Object removeItem = null; 
        if (isEmpty()) 
        {    
            return removeItem; 
        } 
        removeItem = head.data; 
        if ( head == last) 
        {    
            head = null; 
            last = null; 
        } 
        else 
            head = head.next; 
        return removeItem;
} 
}