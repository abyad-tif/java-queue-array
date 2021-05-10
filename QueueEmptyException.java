// Empty Queue Exception

public class QueueEmptyException extends RuntimeException
{
    public QueueEmptyException(String err)
    {
        super(err);
    }    
}
