# switch-case文

## switch-case

* 分岐処理の１つ
* 変数の値によって分岐ができる
* int型でないと扱えない

## 文法

```java
switch (int型の式) {
  case 1:
    // 処理
    break;
  case 2:
    // 処理
    break;
  case n:
    // 処理
    break;
  default:
    // 処理
    break;
}
```

## コード例

```java
public class Switch {
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
```