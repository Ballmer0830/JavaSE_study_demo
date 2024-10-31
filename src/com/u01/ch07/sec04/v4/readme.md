这是一个简单的学生信息管理系统的案例。

v1版本是有问题的，新增一个学生信息之后，查询是查不到的。

出现问题的原因在于：
每次调用addStudent或listStudent方法，都会创建新的StudentService和StudentDao实例，
导致调用addStudent，学生信息会被添加到一个新的StudentDao实例的成员数组中，而查询信息又是从另一个新的StudentDao实例的空的成员数组中查询。
=======================
v2版本解决方案：
在StudentController中使用单个StudentService实例，在StudentService中使用单个StudentDao实例。
确保所有的新增和查询操作都是操作同一个StudentDao实例的成员数组
=======================
v3版本解决方案：
问题的根源是不同的功能操作了不同的数组，那确保数组唯一即可
所以只需要：StudentDao实例的成员数组加一个static即可
不管你什么操作，创建多少个实例，从源头限制死即可
=======================
v4版本解决方案：
实际上，这个方案是对v3的扩展
关注点还是在于如何从源头上保证数组的唯一
可以在StudentService中使用单个StudentDao实例，也就是声明一个StudentDao的成员变量，并且这个变量用static修饰