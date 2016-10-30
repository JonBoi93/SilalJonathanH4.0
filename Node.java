public class Node
{
	// Kinds of data for the node
	private String data;
	private Node next;
	// constructor of Data
	public Node(String Data)
	{
		data = Data;
		next = null;
	}
	// Constructor of data, next
	public Node(String Data, Node Next)
	{
		data = Data;
		next = Next;
	}
	// Accesssors
	public String getData()
	{
		return data;
	}
	public Node getNext()
	{
		return next;
	}
	// Setters
	public void setData(String Data)
		{
			data = Data;
		}
	public void setNext(Node Next)
	{
		next = Next;
	}
		// Compare your data
		public int Compare(String Data)
		{
			return Data.compareTo(data);
		}
		public int Compare(Node Compared)
		{
			return Compared.getData().compareTo(data);
		}
	}



