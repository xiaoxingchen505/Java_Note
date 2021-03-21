# 見づけだぞ!　連邦の主力く!" "これで歴史は変わる!" "私に跪け!　神よ!

## 数据类型
一个Byte由8 bits组成

|类型|存储需求|取值范围|coment|
|-------|----------|---------|----------|
|int 整数 |32 bit，4 byte|-2147483648~2147483647|20亿左右|
|byte |8bit 1 byte| -128~127之间 |java程序中最小的数据单元|
|short 短整数|16 bit 2 byte|-32768~32767|-|
|long 长整数|64 bit 8 byte|-9223372036854775808~-9223372036854775807||
|double 双精度浮点数| 64 bit 8 byte|大约±1.79769313486231570E+308|有效数位 15位|
|float 单精度浮点数|32 bit 4 byte|大约±3.40282347E+38F|有效数位 6 ~7位|

<br>
其他数据类型：比如 字符 char是 16 bit 2byte，boolean是 8bit 1byte
<br>
<br>

### 数据量大小排序：
### byte < short < int < long < float < double

## 特殊字符的转义序列

|转义序列|名称|Unicode|
|-------|----------|---------|
|\b|退格|\u0008|
|\t|制表|\u0009|
|\n|换行|\u000a|
|\r|回车|\u000d|
|\\"|双引号|\u0008|
|\\'|单引号|\u0008|
| \\\\ |反斜杠|\u0008|

## 数据的转换

小数据类型 -> 大数据类型: 安全的，直接转化。
大数据类型 -> 小数据类型: 不一定安全，可能会出现问题。

强制转换：
```java
int a = (double) b
```

## 使用BigDecimal解决计算精度问题
类似float和double类型的数据，在加减乘除的时候，会有精度问题。可以用BigDecimal解决

```java
    public static void main(String[] args) {
	// write your code here

        BigDecimal a = new BigDecimal( 1);
        BigDecimal b = new BigDecimal( 1.1);
        a = a.setScale(2, BigDecimal.ROUND_HALF_UP);
        b = b.setScale(2, BigDecimal.ROUND_HALF_UP);
        System.out.println(a.subtract(b).doubleValue());
    }

```