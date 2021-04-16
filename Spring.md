
# Spring 笔记
## Spring核心概念

### IoC
* Inversion of Control
* 控制反转
<br>

###  DI
* Dependency Injection
* 依赖注入
<br>

###  AOP
* Aspect Oriented Programming
* 面向切面编程

装配bean的三种方法
* 隐式的bean发现机制和自动装配
* 在Java中进行显示的配置
* 在XML中进行显示的配置


## 自动装配
### 组件扫描
* @Component：表示这个类需要在应用程序中被创建
* @componentScan: 自动发现应用程序中创建的类

### 自动装配
* @Autowired: 自动满足bean之间的依赖

### 定义配置类
* @Configuration: 表示当前累是一个配置类