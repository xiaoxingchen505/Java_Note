
# 别开玩笑了！只不过是一块破石头而已，看我用高达把它推回去！	ふざけるな!　たかが石ころ一つ、ガンダムで押し出してやる!要不是有你这般激进，人类也不会绝望至此！ν高达并不是虚有其表的！


## 用户输入

先创建扫描器，获取数据。记住要导包, alter + enter.
```java

import java.util.Scanner;

public class TestScanner{
    public static void main(String[] args){
        // 1.创建一个扫描器
        Scanner sc = new Scanner(System.in)


        // 2. 使用扫描器来获取用户输入的内容
        int a = sc.nextInt(); //获取到整数

        double d = sc.nextDouble(); // 小数

        String s = sc.nextLine() // 字符串
        //除此之外，还有很多的nextxxxx，可以试试。



        // 简单demo, 让用户输入两个数，a,b ，计算a+b的结果。
        Scanner sc = new scanner (System.in);
        System.out.println("请输入a和b:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("a+b =" + (a + b));
    }
}
```


## if,while,for语句语法
```java

if(money > price){
    System.out.println("买买买");
}

while( i<= 10){
    System.out.println('还我钱');
    i = i+1
}
```

###