
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
* 首选Bean:
  * 使用首选bean @Primary(不推荐)
  * 只能定义一个 @Primary
* 使用限定符 @Qualifer("")
  * 在声明的时候和装配的时候分别使用 @Qualifier
* 使用限定符和bean id
  * 在声明的时候指定bean的id (默认的id是首写字母小写的类名)
  * 在装配的时候使用@Qualifier 
* 使用Java自带的@Resource(name="")，可以同时代替@Qualifier和@Autowired
### 定义配置类
* @Configuration: 表示当前类是一个配置类



## 使用单元测试

* 引入Spring单元测试模块
  * maven: junit、spring-test
  * @RunWith（SpringJUnit4ClassRunner.class）
* 加载配置类
  * @ContextConfiguration(classes=AppConfig.class)


##  @Autowired

* 用在构造函数上 (效率最高的)
  * 多个依赖的情况
* 用在成员变量上 (最方便的)
* 用在setter方法上
* 用在任意方法上


### required
* @Autowired(required = false)
* 表示注入的对象是可选的
  