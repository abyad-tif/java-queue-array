// Testing the Queue

public class QueueTest 
{
    public static void main(String[] args) 
    {
        int N = 9;
        ArrayQueue aq = new ArrayQueue(N);
        System.out.println("ENQUEUE Operations");
        for(int i = 0; i < N; i++)
        {
            aq.enqueue("Orang-" + (i + 1));
            System.out.print("Masukkan ke antrian: " + "Orang-" + (i + 1));
            System.out.print("Yang paling depan: " + aq.peek());
            System.out.println("Jumlah antrian: " + aq.size());
        }
        
        System.out.println("\nDEQUEUE Operations");
        for(int i = 0; i < N; i++)
        {
            System.out.println("Yang paling depan: " + aq.peek());
            System.out.print("Yang dilayani: " + aq.dequeue());
            System.out.print("Jumlah antrian: " + aq.size());
        }
    }    
}
