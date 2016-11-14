# IF文

## IF文とは

* ある条件の結果を見てその後の行動を決める

* 分岐処理

* boolean型で返す

## 文法

```java
if (条件式) {
  // true の処理
}
```

```java
if (条件式) {
  // true の処理
} else {
 // false の処理
}
```

```java
if (条件式) {
  // true の処理
} else if (条件式) {
  // true の処理
} else {
  // false の処理
}
```

## コード例

「入力あり」「入力なし」を処理する
```java
public class IF {
  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("入力なし");
    } else {
      System.out.println("入力あり");
    }
  }
}
```

ネスト（入れ子）を使った分岐
```java
public class IF {
  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("入力なし");
    } else {
      if (args.length % 2 == 0) {
        System.out.println("偶数値");
      } else {
        System.out.println("奇数値");
      }
    }
  }
}
```
```