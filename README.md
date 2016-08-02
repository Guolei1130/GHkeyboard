# GHkeyboard
点击页面空白 回收键盘

欢迎star，

#### 用法：

由于Jcenter还在审核当中，所以现在只给出笨办法，

##### 1.笨办法
将library下的GH.java复制到你自己的项目里面。

在需要的Activity或者Fragment里面添加。
 ```
 GH.init(this);
 ```
 
#### 原理
* 原理很简单，只是给DecorView设置TouchListener，隐藏键盘，并返回false。
* 注意。这里所指的空白处是指除可以获取焦点之外的其他地方。
