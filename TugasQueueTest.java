import java.util.Scanner;

public class QueueTest 
{
    public static void main(String[] args) 
    {
        ArrayQueue arqu = new ArrayQueue(5);
        Scanner scan = new Scanner(System.in);
        System.out.print("Jumlah orang yang mau antri: ");  
        int n = scan.nextInt();
        int urutanKe = 1;
        
        while(n >= 5)
        {
            for(int i = 0; i < 5; i++)
            {
                arqu.enqueue("Orang-" + urutanKe);
                System.out.print("+ Masuk ke antrian: Orang-" + urutanKe++);
                System.out.print("Yang paling depan: " + arqu.peek());
                System.out.println("Masuk ke antrian: Orang-" + arqu.size());
            }
            for(int i = 0; i < 5; i++)
            {
                System.out.print("- Yang dilayani: " + arqu.dequeue());
                System.out.println("Jumlah antrian: " + arqu.size());
            }
            n = n - 5;
        }
        
        for(int i = 0; i < n; i++)
        {
            arqu.enqueue("Orang-" + urutanKe);
            System.out.print("+ Masuk ke antrian: Orang-" + urutanKe++);
            System.out.print("Yang paling depan: " + arqu.peek());
            System.out.println("Masuk ke antrian: Orang-" + arqu.size());
        }
        for(int i = 0; i < n; i++)
        {
            System.out.print("- Yang dilayani: " + arqu.dequeue());
            System.out.println("Jumlah antrian: " + arqu.size());
        }
        
    }    
}
