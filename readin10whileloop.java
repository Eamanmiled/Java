import java.util.Scanner;

public class readin10whileloop {
     public static void main(String[] args) {
         Scanner inputs = new Scanner(System.in);
         int [] scores = new int[10];
         System.out.println("multiples of?");
         int multiple = inputs.nextInt();
         for (int i = 0; i < 10; i ++)
             scores[i] = (i + 1) * multiple;
         for (int i = 0; i < 10; i ++)
             System.out.println(scores[i]);
     }
}
