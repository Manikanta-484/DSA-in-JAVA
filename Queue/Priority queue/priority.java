import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        // Create a priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements to the priority queue
        pq.add(3);
        pq.add(1);
        pq.add(2);

        // Print the priority queue
        System.out.println("Priority Queue: " + pq);

        // Remove elements from the priority queue
        while (!pq.isEmpty()) {
            System.out.println("Removed: " + pq.remove());
        }
    }
}
