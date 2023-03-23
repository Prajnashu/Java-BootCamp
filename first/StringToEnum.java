import java.util.Scanner;

public class StringToEnum {
    private enum Cities {
        DELHI("Capital"),
        BENGALURU("IT hub"),
        CHENNAI("Architecture, Beaches"),
        KOLKATA("City of Joy");

        private String description;

        Cities(String description) {
            this.description = description;
        }
    }

    public static void main(String[] args) {
        System.out.println("Available options: " + "\nDELHI " + "BENGALURU " + "CHENNAI " + "KOLKATA");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your string : ");
            String s = sc.nextLine();
            Cities city = Cities.valueOf(s);
            System.out.println(city);
        }
    }
}
