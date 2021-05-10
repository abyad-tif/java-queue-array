public class ArrayQueue implements Queue
{
    // Default length  of the array used to implement the Queue
    public static final int CAPACITY = 1000;
    
    private int capacity;  // Max Queue size
    private Object S[];  // Array used to implement the Queue
    private int tail = -1; //Index of the tail element of the Queue

    // Default Constructor
    public ArrayQueue()
    {
        this(CAPACITY);  // Default size
    }

    // Alternatif Contructor
    public ArrayQueue(int cap)
    {
        capacity = cap;
        S = new Object[capacity];
    }

    // Return number of elements in the queue
    public int size()
    {
        return(tail + 1);
    }

    // Return whether the queue is full or not
    public boolean isFull() 
    {
        return(size() == capacity);
    }

    // Return whether the queue is empty or not
    public boolean isEmpty()
    {
        return(tail < 0);
    }

    // Return the first element in the queue
    public Object peek() throws QueueEmptyException
    {
        if(isEmpty())
            throw new QueueEmptyException("Queue is empty");
        // Return antrian paling depan
        return S[0];
    }

    // Insert an element at the tail of the queue
    public void enqueue(Object obj) throws QueueFullException
    {
        if(isFull())
            throw new QueueFullException("Queue is full");
            // Masukkan antrian paling belakang
        tail = tail + 1;
        S[tail] = obj;
    }

    // Remove the first element from the queue
    public Object dequeue() throws QueueEmptyException
    {
        Object elem;
        if(isEmpty())
            throw new QueueEmptyException("NO MORE DEQUEUE! Queue is empty");
        // Keluarkan antrian paling depan
        elem = S[0];
        // Geser antrian ke depan
        for(int i = 0; i < tail; i++)
        {
            S[i] = S[i + 1];
        }
        tail--;
        return elem;
    }
}

