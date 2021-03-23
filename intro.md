
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

        // 还可以用 boolean hasNext() 来判断是否还有其他的单词输入

        System.out.println("a+b =" + (a + b));
    }
}
```


## if,while,for,do while语句语法
```java

if(money > price){
    System.out.println("买买买");
}

while( i<= 10){
    System.out.println('还我钱');
    i = i+1
}

for (int i=10; int>0; i--){


}

do {
    i++
}
while (i<10)
```
<br>
<br>

## switch 
```java
switch (n){

    case 1:
        // 可以加任意内容
        break;
    case 2:
        break;
    default:
        break;
}
```

<br>
<br>

## 逻辑运算符
|符号|comment|
|-----|----|
|&& |并且,左右两端同时为真，最后结果才能是真.
|\|\| |或者,左右两端有一个是真，结果就是真.
|! |非，非真即为假，非假为真

<br>
<br>


## PrintWriter 基于字符的输出流,可以输出字符或字符串整型等数据。输出的目标可以是磁盘文件、其他输出流。
```java
PrintWriter wr = response.getWriter();

// 1. print方法可以将各种类型的数据转换成字符串的形式输出。
wr.print(100);

// 2. 重载的write方法只能输出字符、字符数组、字符串等与字符相关的数据。
wr.write("上次访问的时候 : "+100);   


// 注: scanner里的文件地址要加上Path.of("myfile.txt")，还要在类边上加上throw IOException
PrintWriter out = new PrintWriter("myfile.txt", StandardCharsets.UTF_8)
```


