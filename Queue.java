public class Queue{
 //First node
 private Node head;

 //Last node
 private Node tail;

 private int nodeCount;

 //Default Constructor - set NodeCount along with first and last (null)
 public Queue()

 {
  nodeCount = 0;
  head = null;
  tail = null;
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
 public void enqueue(String item)
 {
  Node newNode = new Node(item);
  if (head == null)
  {
  head = newNode;
  tail = newNode;
  nodeCount++;
  }
  else
  {
   tail.setNext(newNode);
   tail = newNode;
   nodeCount++;
  }
 }
  public String dequeue()
  {
   if (head == null)
   {
    return null;
   }
   else
   {
    String present = head.getData();
    head = head.getNext();
    if (head == null)
     tail = null;
    nodeCount--;
    return present;

   }
  }

}
