
import java.util.LinkedList;
public class Queue
{
    protected LinkedList list;
    
    public Queue()
    {
        list = new LinkedList();
    }
    
    public int size()
    {
        return list.size();
    }
    
    public void enqueue(Object element)
    {
        list.addLast(element);
    }
    
    public Object dequeue()
    {
        return list.removeFirst();
    }
    
}