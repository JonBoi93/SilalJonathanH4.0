public class linkedlists{
	//First node
	private Node head;

	//Last node
	private Node tail;

	//Node count
	private int nodeCount;
	{
		head = null;
		tail = null;
	}

	//Default Constructor - set NodeCount along with first and last (null)
	public linkedlists()

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

//Prints the list backward from last
public void printReverse()
{
	Node seek = tail;
	while (seek != null)
	{
		System.out.println(" " + seek.getData());
		seek = seek.getPrevious();
	}
}

//Iterates through the list to see if there is a node with the same text. Will only go as far as until the next node would be greater than what is sought
//Also string finds parameter data
//Will return whether its found or not
public boolean contains(String data)
{
	//set seek to the first node
	Node seek = head;
	//default to not found
	boolean found = false;
	//iterate through the list until found or break
	while (seek != null && !found)
	{
		//find the comparison indicator for seek to data
		int cmp = seek.getData().compareTo(data);
		if (cmp == 0)
		{
			found = true;
		}
		else if (cmp > 0)
			 {
				 break;
			 }
			 seek = seek.getNext();
		 }
		 return found;
	 }

	 //Seek for the data and if found, unlink retaining head and tail to previous and next
	 //String to find parameter data
	 public void remove(String data)
	 {
		 //set seek to first node
		 Node seek = head;
		 //default to not found
		 boolean found = false;
		 //iterate through the list until found or break
		 while (seek != null && !found)
		 {
			 //find the comparison indicator for seek to data
			 int cmp = seek.getData().compareTo(data);
			 if (cmp == 0)
			 {
				 found = true;
				 System.out.println("Found the node with value of " + data);
			 }
			 else if (cmp > 0)
			 {
				 break;
			 }
			 else
			 {
				 seek = seek.getNext();
			 }
		 }
		 if (found)
		 {
			 System.out.println("Removing the node");
			 Node nextNode = seek.getNext();
			 Node previousNode = seek.getPrevious();
			 //unlink seek from previous
			 if (previousNode == null)
			 {
				 //first node
				 head = nextNode;
			 }
			 else
			 {
				 //link our previous node to the following node
				 previousNode.setNext(nextNode);
			 }
			 //unlink seek from next
			 if (nextNode == null)
			 {
				 //last node
				 tail = previousNode;
			 }
			 else
			 {
				 //link our next node to the privous node
				 nextNode.setPrevious(previousNode);
			 }
			 //last unlink, should allow for garbage collecction
			 seek = null;
			 nodeCount--;
		 }
	 }

	 //Removes all entities from linked list
	 public void  removeAll()
	 {
		 //iteraate through all first nodes
		 while (head != null)
		 {
			 System.out.println("Removing node with data " + head.getData());
			 Node nextNode = head.getNext();
			 //Check to see if we are done, unlink the last
			 if (nextNode == null)
			 {
				 tail = null;
				 head = null;
			 }
			 else
			 {
				 nextNode.setPrevious(null);
			 }
			 head = nextNode;
		 }
	 }

	 //Add to the sorted list
	 //For the parameters will add data
	 public void add (String data)
	 {
		 //New node with data
		 Node newNode = new Node(data);
		 //Node to seek through the list
		 Node seek;
		 //Inserted indicator
		 boolean inserted = false;

	  	 //Check to make sure that this won't be the first node
		 if (head == null)
		 {
			 System.out.println( "Setting as first node" + data);
			 head = newNode;
			 tail = newNode;
		 }
		 else if (head.getData().compareTo(data) >=0)
		   {
			 System.out.println( "Setting as first node" + data);
			 //Should this be the first node, before the exisiting first node
			 newNode.setNext(head);
			 head.setPrevious(newNode);
			 head = newNode;
		 }
		 else
		 {
			 //Extra node to seek through the list
		 Node follower = head;
		 seek = head.getNext();
		 while (seek !=null && !inserted)
		 {
			 if (follower.getData().compareTo(data) <= 0 && seek.getData().compareTo(data) >= 0)
			 {
				 System.out.println( "Setting as middle node" + data);
				 follower.setNext(newNode);
				 newNode.setPrevious(follower);
				 newNode.setNext(seek);
				 seek.setPrevious(newNode);
				 inserted = true;
			 }
			 else
			 {
				 follower = seek;
				 seek = seek.getNext();
			 }
		 }
		 if (!inserted)
		 {
			 System.out.println( "Setting as last node" + data);
			 follower.setNext(newNode);
			 newNode.setPrevious(follower);
			 tail = newNode;
		 }

	 }
	 		 nodeCount++;
 }
}













