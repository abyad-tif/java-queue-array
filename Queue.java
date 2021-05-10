// Queue Interface

public interface Queue 
{
    // Returns the number of items currently in the queue
    public int size();

    // Return whether the queue is full or not
    public boolean isFull();

    // Returns whether the queue is empty or not
    public boolean isEmpty();

    // Return the front item from the queue without popping it
    public Object peek() throws QueueEmptyException;

    // Adds the given item to the rear og the queue
    public void enqueue(Object element) throws QueueFullException;

    // Removes the front item from the queue and returns it
    public Object dequeue() throws QueueEmptyException;

}