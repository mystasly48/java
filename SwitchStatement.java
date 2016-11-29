public class SwitchStatement {
  public static void main(String[] args) {
    switch (args.length) {
      case 0:
        System.out.println("引数なし");
        break;
      case 1:
        System.out.println("引数１つ");
        break;
      case 2:
        System.out.println("引数２つ");
        break;
      default:
        System.out.println("引数たくさん");
        break;
    }
  }
}
