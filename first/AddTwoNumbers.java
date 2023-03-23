public class AddTwoNumbers {
    public static void main(String[] args) {
        if(args.length == 2) {
            int sum = 0;
            for(String val: args) {
                try {
                    sum += Integer.parseInt(val);
                } catch (Exception e) {
                    // TODO: handle exception
                    System.out.println(e);
                    return;
                }
                
            }
            System.out.println(sum);
        } else {
            System.out.println("Invalid number of inputs given");
        }
    }
}
