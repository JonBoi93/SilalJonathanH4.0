public class TestQ
{
	public static void StackTester()
	{
		Stack s = new Stack();
	    s.push("John");
		s.push("Mike");
		s.push("Kevin");
		PopStack(s);
	}
	public static void PopStack(Stack s)
	{
		while (s.peek() != null)
		{
			System.out.println(s.pop());
		}
	}
public static void QueueTester()
{
	Queue q = new Queue();
    q.enqueue("John");
	q.enqueue("Mike");
	q.enqueue("Kevin");
	DequeueAll(q);
}

}