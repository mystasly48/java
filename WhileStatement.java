public class WhileStatement {
  public static void Main() {
    while (true) {
      System.out.println("HAHAHA!");
    }
    
    String str = null;
    do {
      str = System.console().readline();
      System.out.println("Read: " + str);
    } while (str != "end")
  }
}
