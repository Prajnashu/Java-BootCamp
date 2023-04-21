package week4.Java8;

public class MyStream {
    // static int x = 0, o = 0;
    static String r = "";
    public static void main(String[] args) {
        
        // Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5, 6);
        // Optional<Integer> result = numbers.reduce((i, j) -> {return i*j;});
        // // (result.isPresent()) ? System.out.println(result.get()) : System.out.println("No result");

        // if(result.isPresent())
        //     System.out.println(result.get());

    //     String str = "Hell wrld";
    //     str.chars().mapToObj(c -> (char)c).forEach(c -> MyStream.incrementXO(c));
    //     if(x == o) {
    //         System.out.println(true);
    //     } else {
    //         System.out.println(false);
    //     }

        
    // }

    // public static void incrementXO(Character c) {
    //     if(c == 'x' || c == 'X')
    //         x++;
    //     if(c == 'o' || c == 'O')
    //         o++;
    // Random rand = new Random();
    // List<Integer> li = new ArrayList<>();
    // for(int i =0; i<30; i++) {
    //     li.add(rand.nextInt(2500, 6000));
    // }
    // li.forEach(System.out::println);
    int test = 9191;
    String result = test + "";
    //result.chars().mapToObj(c -> (char)c).map(c -> (int)c * (int)c).forEach(c -> r += c);
    result.chars().mapToObj(c -> (char)c).map(c -> Character.getNumericValue(c) * Character.getNumericValue(c)).forEach(c -> r += c);
    System.out.println(r);
    System.out.println(Integer.valueOf(r));
      }
}
