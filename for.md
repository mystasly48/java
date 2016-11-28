# for文

## 1. for文とは
- 繰り返し処理の１つ
- 配列の最初の要素から最後の要素までを順番にする処理ときに使用

## 2. 文法
```java
for (変数宣言; 条件; 変数更新) {
  // 繰り返し処理
}
```

## 3. コード例
0 ~ 5 までを表示
```java
for (int i = 0; i <= 6; i++) {
  System.out.println(i);
}
```

条件を増やすことも可能
```java
for (int i = 0; i < 6; i++) {
  if (i >= 3) {
    break;
  }
  System.out.println(i);
}
```

無限ループ
```java
for (int i = 0;;i++) {
  // 無限に処理される
}
```

コマンドライン引数分ループして出力
```java
for (int i = 0; i < args.length; i++) {
  System.out.println(args[i]);
}
```

## 4. インクリメントとデクリメント
- インクリメント（increment)：　増加
 - 前置インクリメント：　`++変数`
 - 後置インクリメント：　`変数++`
- デクリメント（decrement）：　減少
 - 前置デクリメント：　`--変数`
 - 後置デクリメント：　`変数--`

```
i = 0;
++i;
i++;
--i;
i--;
```
