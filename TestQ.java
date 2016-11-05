public class TestQ
{
	public static void main(String args[])
		{
			System.out.println("ST------------------");
			StackTester();
			System.out.println("QT------------------");
			QueueTester();
			System.out.println("SQ------------------");
			StacktoQueue();
			System.out.println("QS------------------");
			QueuetoStack();
			System.out.println("SS------------------");
			StacktoStack();
		}
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
public static void DequeueAll(Queue q)
	{
		while (q.peek() != null)
		{
			System.out.println(q.dequeue());
		}
	}
	public static void StackStack(Stack s1, Stack s2)
		{
			while (s1.peek()!= null)
			{
				s2.push(s1.pop());
			}
		}

		public static void StacktoQueue()
		{
			Stack s = new Stack();
			Queue q = new Queue();
			s.push("John");
			s.push("Mike");
			s.push("Kevin");
			// Go from stack to queue
			while (s.peek() != null)
			{
				q.enqueue(s.pop());
			}
			//print out queue
			DequeueAll(q);
	}
	public static void QueuetoStack()

	{
			Stack s = new Stack();
			Stack s2 = new Stack();
			Queue q = new Queue();

			q.enqueue("John");
			q.enqueue("Mike");
			q.enqueue("Kevin");
			// Go from queue to stack
			while (q.peek() != null)
			{
				s.push(q.dequeue());
			}
			StackStack(s,s2);
			//print out queue
			PopStack(s2);
		}
		public static void StacktoStack()

		{
				Stack s = new Stack();
				Stack s2 = new Stack();


				s.push("John");
				s.push("Mike");
				s.push("Kevin");
				StackStack(s,s2);
				StackStack(s2,s);
				//print out queue
				PopStack(s);
	}
}