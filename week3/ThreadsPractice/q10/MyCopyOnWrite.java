package week3.ThreadsPractice.q10;

// import java.util.ArrayList;
// import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class MyCopyOnWrite {
    
    public static void main(String[] args) throws InterruptedException {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        //List<Integer> list = new ArrayList<Integer>();
        
        // Add some elements to the list
        list.add(1);
        list.add(2);
        list.add(3);
        
        // Create a new thread that removes elements from the list
        Thread removerThread = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println(list);
                System.out.println("Removing element from list");
                list.remove(0);
            }
        });
        
        removerThread.start();
        
        // Wait for the remover thread to finish
        removerThread.join();
        
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        // Print the contents of the list
        System.out.println("List contents:");
        for (Integer i : list) {
            System.out.println(i);
            list.remove(i);
        }
    }
}
