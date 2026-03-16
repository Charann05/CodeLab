import java.util.Scanner;

public class SlidingWindow {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the window size : ");
        int w = sc.nextInt();
        System.out.println("Enter the number of frames : ");
        int n = sc.nextInt();

        int ack = 0;
        int next = 0;

        while(ack<n){
            int sent = 0;
            while(sent<w && next<n){
                System.out.println("Frame "+(next+1)+" was sent");
                sent++;
                next++;
            }
            System.out.println("Enter the number of frames acknowledged : ");
            int a= sc.nextInt();
            ack += a;

            if(ack<n){
                System.out.println("Sliding window...");
            }
        }

        System.out.println("All frames sent successfully!");
        sc.close();
    }
    
}
