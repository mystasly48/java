# while 文

## while
「継続条件」部分を持った繰り返し処理のこと。

条件を満たす間、同じ処理を繰り返す。

## 文法

### 前置判定
継続条件が繰り返し処理の前に記述される。

#### 構文
```java
while (条件) {
  // 繰り返し処理
}
```

### 後置判定
継続判定が繰り返し処理の後に記述される。s

#### 構文
```java
do {
  // 繰り返し処理
} while (条件)
```

## サンプルコード

### コマンドライン引数の値を逆順に表示する
```java
int i = args.length - 1;
while (i >= 0) {
  System.out.println(args[i]);
  i--;
}
```

### 入力された値を取得して表示する
```java
static final String END = "end";
String str = null;
do {
  str = System.console().readline();
  System.out.println("Read: " + str);
} while (!END.equalsIgnoreCase(str))
```

*いやほんま、**クソサンプル**のご提示ありがとうございますですわ、ほんま。*
