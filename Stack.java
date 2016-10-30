public class Stack{
 //First node
 private Node head;

 //Last node
 private Node tail;

 private int nodeCount;

 //Default Constructor - set NodeCount along with first and last (null)
 public Stack()

 {
  nodeCount = 0;
  head = null;
 }

 //Get the size of the list, and returns the interger size of the list
 public int size()
 {
  return nodeCount;
 }

 //Checks to see if the list is empty or not, returns boolean - empty = true
 public boolean isEmpty()
 {
  return (head != null);
 }

 //Prints the list forward from first
 public void printForward()
 {
  Node seek = head;
  while (seek != null)
  {
   System.out.println("  " + seek.getData());
   seek = seek.getNext();
  }
 }
 
public String peek()
 {
  if (head == null)
  return null;
  return head.getData();
 }
 public void push(String item)
 {
  Node newNode = new Node(item);
  if (head == null)
  {
  head = newNode;
  nodeCount++;
  }
  else
  {
   newNode.setNext(head);
   head = newNode;
   nodeCount++;
  }
 }
  public String pop()
  {
   if (head == null)
   {
    return null;
   }
   else
   {
    String present = head.getData();
    head = head.getNext();
    nodeCount--;
    return present;

   }
  }

}

