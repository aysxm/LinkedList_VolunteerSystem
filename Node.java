
public class Node{
Object data;
Node next;

Node(Object obj){data=obj;}

Node(Object o,Node nextNode)
    {
        data = o;
        next = nextNode;
    }
}