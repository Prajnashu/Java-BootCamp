package week3.ThreadsPractice.q2;


public class TaskExecute{

    public static void main(String[] args) {

        //The run method contains the code to be executed by the task
        Runnable run = () -> {System.out.println("Task created");};
        
        //The start method will cause the run method to be executed in a separate thread.
        new Thread(run).start();
        System.out.println("Task executed");
    }


}
