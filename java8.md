Java8 的几点
*********
* Stream 作为 Java 8 的一大亮点，它与 java.io 包里的 InputStream 和 OutputStream 是完全不同的概念。
   * 1.0-1.4 中的 java.lang.Thread
   * 5.0 中的 java.util.concurrent
   * 6.0 中的 Phasers 等
   * 7.0 中的 Fork/Join 框架
   * 8.0 中的 Lambda
* Java 8 中的 Stream 是对集合（Collection）对象功能的增强，它专注于对集合对象进行各种非常便利、高效的聚合操作（aggregate operation），或者大批量数据操作 (bulk data operation)。
* Stream 就如同一个迭代器（Iterator），单向，不可往复，数据只能遍历一次，遍历过一次后即用尽了，就好比流水从面前流过，一去不复返。
-----

![Stream原理](img001.png "Stream原理")

----
* 有多种方式生成 Stream Source：

* 从 Collection 和数组
   * Collection.stream()
    * Collection.parallelStream()
    * Arrays.stream(T array) or Stream.of()
* 从 BufferedReader
   * java.io.BufferedReader.lines()

* 构造流的几种常见方法
```java
// 1. Individual values
Stream stream = Stream.of("a", "b", "c");
// 2. Arrays
String [] strArray = new String[] {"a", "b", "c"};
stream = Stream.of(strArray);
stream = Arrays.stream(strArray);
// 3. Collections
List<String> list = Arrays.asList(strArray);
stream = list.stream();
```

* 流转换为其它数据结构
```java
// 1. Array
String[] strArray1 = stream.toArray(String[]::new);
// 2. Collection
List<String> list1 = stream.collect(Collectors.toList());
List<String> list2 = stream.collect(Collectors.toCollection(ArrayList::new));
Set set1 = stream.collect(Collectors.toSet());
Stack stack1 = stream.collect(Collectors.toCollection(Stack::new));
// 3. String
String str = stream.collect(Collectors.joining()).toString();
```
* filter
    * 挑出偶数
```java
//原来的写法
Integer[] sixNums = {1, 2, 3, 4, 5, 6};
List<Integer> result = new ArrayList<>();
for(int i=0;i<sixNums.length;i++){
    if(sixNums[i] %2 ==0){
        result.add(sixNums[i]);
    }
}
```
```java
Integer[] sixNums = {1, 2, 3, 4, 5, 6};
List<Integer> result = Stream.of(sixNums).filter(n -> n%2 == 0).collect(Collectors.toList();
```
* forEach

```java

// Pre-Java 8
for (Person p : people) {
 if (p.getGender() == Person.Sex.MALE) {
 System.out.println(p.getName());
 }
} 
// Java 8
people.stream()
 .filter(p -> p.getGender() == Person.Sex.MALE)
 .forEach(p -> System.out.println(p.getName()));
```


* 其实Lambda表达式的本质只是一个"语法糖",由编译器推断并帮你转换包装为常规的代码,因此你可以使用更少的代码来实现同样的功能。
* Lambda表达式的基本语法:
    * (parameters) -> expression
     * 或
     * (parameters) ->{ statements; }
     * -> 可以叫做“转到”
```java
// 1. 不需要参数,返回值为 5  
() -> 5  
  
// 2. 接收一个参数(数字类型),返回其2倍的值  
x -> 2 * x  
  
// 3. 接受2个参数(数字),并返回他们的差值  
(x, y) -> x – y  
  
// 4. 接收2个int型整数,返回他们的和  
(int x, int y) -> x + y  
  
// 5. 接受一个 string 对象,并在控制台打印,不返回任何值(看起来像是返回void)  
(String s) -> System.out.print(s)  

```

* 代码举例
```java
// pre-java8
String[] players = {"Rafael Nadal", "Novak Djokovic",   
    "Stanislas Wawrinka", "David Ferrer",  
    "Roger Federer", "Andy Murray",  
    "Tomas Berdych", "Juan Martin Del Potro",  
    "Richard Gasquet", "John Isner"};  
   
// 使用匿名内部类根据 name 排序 players  
Arrays.sort(players, new Comparator<String>() {  
    @Override  
    public int compare(String s1, String s2) {  
        return (s1.compareTo(s2));  
    }  
});  
```

```java
// java 8
    Arrays.sort(players, (s1, s2) -> (s1.compareTo(s2)));
```


* 代码再举例
```java
// Java 8之前：
new Thread(new Runnable() {
    @Override
    public void run() {
    System.out.println("Before Java8, too much code for too little to do");
    }
}).start();

//Java 8方式：
new Thread( () -> System.out.println("In Java8, Lambda expression rocks !!") ).start();
```
    * ()->时为无参，仅打印些东西
    
    
* Optional规避空指针异常
* 函数式接口
    * Predicate
    * Function
    * Consumer