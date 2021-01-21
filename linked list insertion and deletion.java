public class linkedlist
{
Node head=null;
class Node
{
int data;
Node next;
Node(int d)
{
    data=d;
    next=null;
}






}
void push(int data)
{
Node o=new Node(data);
o.next=head;
head=o;
}
void jio(Node p,int d)
{
    Node obj=new Node(d);
    p.next=obj;
}
    
void print()
{
    Node tnode=head;
while(tnode!=null)
{
System.out.println(tnode.data);
tnode=tnode.next;
}
System.out.print(head.data);
}

void delete()
{
    Node pre=null;
Node t=head;
while(t!=null)
{
    if (t.data==3)
    {
    pre.next=t.next;
    break;
    }
    else
    {
    pre=t;
    }
    t=t.next;
}

}

public static void main(String g[])
{
linkedlist obj=new linkedlist();
obj.push(3);
obj.push(4);
obj.push(6);
obj.jio(obj.head.next.next,8);
obj.jio(obj.head.next.next.next,9);
obj.delete();
obj.print();
}
}