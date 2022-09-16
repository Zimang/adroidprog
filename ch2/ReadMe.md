# 实现一个MainActivity

1. 创建一个EmptyActivity
2. 创建一个Layout Resource File
   - 实现各种组件
     - "@+id/button_14"
3. 注册<activity>
   - <intent-filter>
     - action:Main
     - category:Launcher



# Toast组件

1. 在layout res中实现组件后，创建Button对象

2. 注册clickListener

3. 实现onclick

   - ```java
     Toast.makeText(FirstActivity.this,"你点击了BUTOON1",Toast.LENGTH_SHORT)
         .show();
     ```
     
- 上下文，msg，显示时常



