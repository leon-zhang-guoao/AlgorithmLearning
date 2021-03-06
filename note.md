-----数据结构--------------------
数据结构 由 连续结构(数组)和跳转结构（链表）组成
数组： 便于寻址（取值） 增删不便
链表： 便于增删 不便于寻址（取值）
程序 = 数据结构 + 算法

求任意数组的 n 到 j 位数的he
俩种方法
1. 二维表  缺点：得出表比较复杂而且占资源  优点 ： 在数组长度不长但 计算量超大的情况下 比较适用
2. 前缀和  缺点：计算量超大的情况下没二维表效率高  优点 简单
---基础排序---------
1.选择排序
  从第一位开始和后一位比 大或小于则交换
2.冒泡排序
  i和i+1比，如果大或小于 则交换 这样保证了从末尾开始有序 就是每次循坏的次数会减一
3.插入排序
  和冒泡排序 相反 是从开头保证有序
---二分法-------------
l 左边界 r右边界 （前提有序）
mid = （l+r）/2
等于就返回
num的值大于index mid的值 说明 mid 左边不要 l =mid+1 继续查找 
num值小于 mid的值 右边不要 r = mid -1 继续查找 
知道 左边界 超过或等于右 就是  l>=r时 while 循环结束
2.找局部最小值也可以用二分法，前提是相邻的值不等 
---随机数------------
可以用随机数生成 测试数据 从而 写出对数器
1 题目 函数 f 是 0 ，1 生成器 但是不是等概率 求 等概率生成0 1
  解 do { num = f } while(num == f) 
  11 00 的概率不要 只要 01 和 10的概率 新函数就是等概率的

2 f是 l 到 r 的等概率 生成器 求 n 到 x 的等概率函数
  解 先把 lr 变成 等概率的 0 1 发生器  
  代码详解 见 Radmo类
  由 题干函数 生成 0 1 等概率 发生函数  f2
  利用 f2 生成 二进制的  0到 s的等概率发生器 f3
  再利用f3 把不是 n到x范围的数 重做 即可得到 n到x的等概率函数
   
  

  

---常数和时间复杂度------
常数操作就是和 数据量无关的 比如 加减乘除 和 在数组里取值
常数操作的时间复杂度是 O(1) [O(1)不是一个固定的值比如java中 list和arraylist取值操作都是O(1)
但是 由于 arraylist有扩容的动作 所以 arraylist的O(1)是比list的O(1)要大的，时间复杂度只是相对于
该算法本身
]
时间复杂度一般只在意 公式的最高阶 不管系数和常量 因为在巨量的数据下 ，只有最高阶会影响结果

常量阶	O(1)
对数阶	O(logn)
线性阶	O(n)
线性对数阶	O(nlogn)
n方阶	O(nⁿ)
指数阶	O(2ⁿ)
阶乘阶	O(n!)

---位图--------
用一个long[]来表示一组数据，long[1]时，用64位来表示64个数，哪一位有数就标1
64 >> 6 等于 64/64
 ->>1 等于 /2  >>2 = /2  >>3 == /8 >>4 = /16 >>5 =/32 >>6 = /64
 int a % 64 = a & 63
  ---- 2进制 加减乘除
  ^ 异或 ：不同为1 相同为0   俩个数 ^ 等于 无进位相加
  俩个数 于 完 往左移动一位就是 进位信息  a & b  << 1 
  加法 等于 用 a = a ^ b   b = a & b << 1  一直 ^ 到 进位信息没了
  减法 等于 a + b的相反数  ~b
