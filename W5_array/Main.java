
package W5_array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("array capacity: ");
        int capacity = input.nextInt();
        Queue<Integer> x = new Queue<Integer>(capacity);
        System.out.println("-----------------------------------");

        while (true) {
            System.out.println("1 - enqueue");
            System.out.println("2 - dequeue");
            System.out.println("4 - print");
            System.out.println("0 - exit");
            System.out.print("secim :");
            int a = input.nextInt();
            switch (a) {
                case 0:
                    return;
                case 1:
                    System.out.print("data: ");
                    int data = input.nextInt();
                    x.enqueue(data);
                    x.print();
                    break;
                case 2:
                    System.out.println("dequeu: " + x.dequeue());
                    x.print();
                    break;
                case 4:
                    x.print();
                    break;
                default:
                    System.out.println("invalid value");
                    break;
            }
            System.out.println("-------------------");
        }
    }
}
