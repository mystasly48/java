# 継承クラス

## 継承

継承とは：あるクラスを元に新しいクラスを作ること

extends:能力を伸ばす、拡張する

e.g. パン+チョコ=チョコパン

## 抽象

抽象とは：クラス定義の中に「メソッド定義」がある。しかし、「メソッド処理」がないクラスのこと。

抽象クラスは、インスタンス化できない

override: 上書きする

super: 子インスタンスから内包する親インスタンスのすべてにアクセスしたいときに使う

return: 戻り値の指定

## コード

```java
public class FirstJavaA {
  public FirstJavaA() {
    System.out.println("親クラス");
  }

  public String getA() {
    return "子クラス1";
  }

  public String getB() {
    return "子クラス2";
  }
}
```

```java
public class FirstJavaB extends FirstJavaA {
  public FirstJavaB() {
    super();
  }

  public static void main(String[] args) {
    FirstJavaB AAA = new FirstJavaB();
    System.out.println(AAA.getA());
    System.out.println(AAA.getB());
  }
}
```
