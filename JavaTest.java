import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class JavaTest {
  public static void main(String[] args) {
    Set<String> zpuidSet = new HashSet<>(Arrays.asList("34567654", "5467655342", "2435653"));
    Long[] userArray = zpuidSet.stream().map(Long::valueOf).toArray(Long[]::new);
    System.out.println("This is the result "+userArray);
    sumnum(5, 122);

    System.out.println("Hi to Github using git");
    System.out.println("2. Hi to Github using git");
  }

  public static void sumnum(int a, int b) {
    System.out.println("The sum is " + (a+b));
  }
}
