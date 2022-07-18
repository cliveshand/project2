public class Main2 {
  int x;

  // Constructor with a parameter
  public Main2(int x) {
    this.x = x;
  }

  // Call the constructor
  public static void main(String[] args) {
    Main2 myObj = new Main2(5);
    System.out.println("Value of x = " + myObj.x);
  }
}
