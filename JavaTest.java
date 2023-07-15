public class ImportantCncept {
  public static void main(String[] args) {
    Set<String> zpuidSet = new HashSet<>(Arrays.asList("34567654", "5467655342", "2435653"));
    Long[] userArray = zpuidSet.stream().map(Long::valueOf).toArray(Long[]::new);
    System.out.println("This is the result "+userArray);

    sumnum(5+9);
    sumnum(5+12322);
  }

  public void sumnum(int a, int b) {
    System.out.println("The sum is " + a+b);
  }
}
