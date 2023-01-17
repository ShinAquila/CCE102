
import java.util.Scanner;

public class arrayyyy {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter num");
        int num = scan.nextInt();
        int sum = 0;

        System.out.println("");
        scan.close();

        int[] arrayBoi = new int[num];

        for(int i=1; i<=num; i++){
            arrayBoi[i] = i;
            System.out.println(i);
        }

        for(int newNum : arrayBoi){
            sum = sum+newNum;   
        }
        
        System.out.println("Total: "+sum);
        System.exit(0);
    }
}
