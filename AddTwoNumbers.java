public class AddTwoNumbers {
    public static void main(String[] args) {
        if(args.length == 2) {
            int sum = 0;
            for(String val: args) {
                sum += Integer.parseInt(val);
            }
            System.out.println(sum);
        } else {
            System.out.println("Invalid number of inputs given");
        }
    }
}
