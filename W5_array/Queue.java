package W5_array;

public class Queue<Bisi> {

    Bisi[] q;
    int capacity;
    int head = -1;
    int tail = -1;
    int size = 0;

    public Queue(int x) {
        capacity = x;
        q = (Bisi[]) new Object[capacity];
    }

    public void enqueue(Bisi x) {
        if (isFull()) {
            System.out.println("-- FULL --");
            return;
        }
        size++;
        if (head == -1) {
            head = 0;
            tail = 0;
            q[head] = x;
        } else {
            if (tail == capacity - 1) {
                tail = 0;
                q[tail] = x;
                return;
            }
            q[++tail] = x;
        }
    }

    public Bisi dequeue() {
        if (isEmpty()) {
            System.out.println("-- empty --");
            return null;
        }
        size--;
        Bisi a = q[head];
        q[head] = null;
        head++;
        if (head == capacity) {
            head = 0;
        }
        return a;
    }

    public boolean isFull() {
        return (capacity == size);
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public void print() {
        System.out.println("--------------------------------");
        int a = 0;
        while (a < capacity) {
            if (head == a) {
                System.out.print(a + ": " + q[a] + "(head),     ");
            } else if (tail == a) {
                System.out.print(a + ": " + q[a] + "(tail),     ");
            } else {
                System.out.print(a + ": " + q[a] + ",     ");
            }
            a++;
        }
        System.out.println("");
        System.out.println("--------------------------------");
    }

}
