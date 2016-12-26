# ShoppingCartDemo
# 购物车分类、CheckBox折叠

https://github.com/songguoping/ShoppingCartDemo
http://www.apkbus.com/forum.php?mod=viewthread&tid=271324&extra=page%3D3%26filter%3Dsortid%26orderby%3Ddateline%26sortid%3D12

使用ExpandableListView实现的购物车，解决了EditText输入与焦点错乱问题，用二阶贝塞尔曲线实现购物车动画
![screen](https://github.com/836948082/ShoppingCart/blob/master/image/screen.gif)


加入第三方界面调试工具
SwissArmyKnife
android免root兼容所有版本ui调试工具

https://github.com/android-notes/SwissArmyKnife

使用方法
1.compile 'com.wanjian:sak:0.0.2'
2.在Application的onCreate()方法中加入 LayoutManager.init((Application) getApplicationContext()); (API >= 14)
3.启动app后会在屏幕左上角看到一个 android logo ，点击即可进入功能界面。