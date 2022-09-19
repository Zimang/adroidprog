[TOC]



# 活动

## 实现一个MainActivity

1. 创建一个EmptyActivity
2. 创建一个Layout Resource File
   - 实现各种组件
     - "@+id/button_14"
3. 注册<activity>
   - <intent-filter>
     - action:Main
     - category:Launcher

#### 一个问题：LinearLayout与androidx.constraintlayout.widget.ConstraintLayoutd（默认）的转换

LinearLayout必须是android:orientation="vertical"的



### Button组件

1. res配置Button

2. onCreate 绑定

   ```java
           Button but2=(Button) findViewById(R.id.button_2);
           but2.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent it2=new Intent(SecondLayoutActivity.this,FirstActivity.class);
                   startActivity(it2);
               }
   ```

   



### Toast组件

1. 在layout res中实现组件后，创建Button对象

2. 注册clickListener

3. 实现onclick

   - ```java
     Toast.makeText(FirstActivity.this,"你点击了BUTOON1",Toast.LENGTH_SHORT)
         .show();
     ```
     
- 上下文，msg，显示时常



### Activity的Menu

1. 创建menu res
   1. 添加item(id,title)
2. 创建menu
3. 创建item selected活动



## Intent使用

### 显示使用intent(上下文，跳转活动)

```java
Intent itent = new intent("上下文","跳转活动");
startActivity(itent);
```

### 隐式以及更多隐式(actegory,action)

1. 在manifest中设置itent的action(只能有一个)，category(可以有很多)
2. 在intent的构造函数中添加action,使用方法addCategory

#### 使用其他程序(data)-打开网页

```java
            public void onClick(View view) {
                Intent it=new Intent(Intent.ACTION_VIEW);
                it.setData(Uri.parse("http://www.baidu.com"));
                startActivity(it);
            }
```

#####  `<data>`标签

这个标签有毒

```xml
        <activity
            android:name=".ThirdActivity"
            android:exported="true">
            <intent-filter>
                <action android:name="android.intent.action.VIEW"/>
                <category android:name="android.intent.category.DEFAULT"/>
                <category android:name="android.intent.category.BROWSABLE"/>
                <data android:scheme="http"/>
            </intent-filter>
        </activity>
```

这个data实际上把activity 3设置为了打开网页的方法，但事实上他不能打开。

data较category更为严格的将activity的用途缩小



### intent传值

#### 传向跳转页面

起点

```java
String data="我操你妈";
Intent it=new Intent(FirstActivity.this,SecondLayoutActivity.class);
it.putExtra("key1",data);
startActivity(it);
```

终点

```java
Intent it =getIntent();
String data=it.getStringExtra("key1");
Log.d("Sec",data);
```



#### 返回上一个活动数据

