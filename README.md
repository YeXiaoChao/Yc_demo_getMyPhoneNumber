# GetMyPhoneNumber
【Android Demo】简单手机通讯录

Android 系统给我们提供了访问通讯录的接口，通过接口获取通讯录信息。
Adapter 与 View 的连接主要依靠 getView 这个方法返回我们需要的自定义 view。 
ListView 是 Android App 中一个最最最常用的控件了，所以如何让 ListView 流畅运行，获取良好的用户体验是非常重要的。
对 ListView 优化就是对 Adapter 中的 getView 方法进行优化。

 
核心内容：

1.获取手机通讯录
2.数据封装
3.创建 Adapter 
4.优化适配器

步骤：

1.新建项目，新建 GetNumber.class 类，用来获取通讯录中的信息
2.添加权限
3.新建 PhoneInfo.class 类作为通讯录信息封装类
4.编辑界面
5.自定义 ListView 的适配器类 MyAdapter.class 
6.编辑主界面代码，显示通讯录信息
