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
 

