# IF��

## IF���Ƃ�

* ��������̌��ʂ����Ă��̌�̍s�������߂�

* ���򏈗�

* boolean�^�ŕԂ�

## ���@

```java
if (������) {
  // true �̏���
}
```

```java
if (������) {
  // true �̏���
} else {
 // false �̏���
}
```

```java
if (������) {
  // true �̏���
} else if (������) {
  // true �̏���
} else {
  // false �̏���
}
```

## �R�[�h��

�u���͂���v�u���͂Ȃ��v����������
```java
public class IF {
  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("���͂Ȃ�");
    } else {
      System.out.println("���͂���");
    }
  }
}
```

�l�X�g�i����q�j���g��������
```java
public class IF {
  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("���͂Ȃ�");
    } else {
      if (args.length % 2 == 0) {
        System.out.println("�����l");
      } else {
        System.out.println("��l");
      }
    }
  }
}
```
```