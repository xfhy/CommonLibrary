# CommonLibrary

> 安卓中经常需要写重复的代码,特别是在项目初期,搭建的时候.于是我把这些常用的代码集中起来,放到Library中,需要的时候直接引入Library即可.

#### 引入方式

1. clone项目
2. 在app module的build.gradle中加入`implementation project(':Library')`

#### 项目功能

- 引入了一个好用的adapter  使用参考:https://github.com/CymChad/BaseRecyclerViewAdapterHelper
- Activity封装
- fragment懒加载
- MVP封装
- OkHttp简单封装
- Retrofit简单封装
- RxJava2线程切换封装
- 一些常用Utils
- 常用自定义View
- Button的常用shape
- loading 对话框
- 常用style

下面是Library中引入的三方库,都是比较常见的,如果不需要可以移除.

```gradle
//design
api "com.android.support:design:$versionsSupport"
api "com.android.support.constraint:constraint-layout:$versionConstraintLayout"

//anko
api "org.jetbrains.anko:anko:$anko_version"
//gson
api "com.google.code.gson:gson:$gson_version"

//OkHttp Retrofit
api "com.squareup.okhttp3:okhttp:$okhttp_version"
api "com.squareup.okhttp3:logging-interceptor:$okhttp_version"
api "com.squareup.retrofit2:retrofit:$versionsRetrofit"
api "com.squareup.retrofit2:converter-gson:$versionsRetrofit"
api "com.squareup.retrofit2:adapter-rxjava2:$versionsRetrofit"

//RxLifecycle
api "com.trello.rxlifecycle2:rxlifecycle-kotlin:$rx_lifecycle_version"
api "com.trello.rxlifecycle2:rxlifecycle-components:$rx_lifecycle_version"

//log
api "com.orhanobut:logger:$logger_version"

//权限
api "com.tbruyelle.rxpermissions2:rxpermissions:$rxpermissions_version"

api "com.android.support:cardview-v7:$versionsSupport"
api "com.android.support:recyclerview-v7:$versionsSupport"

//多dex配置
api "com.android.support:multidex:$multidex_version"

//RxKotlin
api "io.reactivex.rxjava2:rxkotlin:$versionsRxKotlin"
api "io.reactivex.rxjava2:rxandroid:$versionsRxAndroid"

//ARouter  路由
api "com.alibaba:arouter-api:$arouter_api_version"

implementation "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$kotlin_version"

//安卓官方 Room
api "android.arch.persistence.room:runtime:$room_version"
// use kapt for Kotlin
kapt "android.arch.persistence.room:compiler:$room_version"
// optional - RxJava support for Room
api "android.arch.persistence.room:rxjava2:$room_version"
// optional - Guava support for Room, including Optional and ListenableFuture
api "android.arch.persistence.room:guava:$room_version"

//屏幕适配 https://github.com/JessYanCoding/AndroidAutoSize
api "me.jessyan:autosize:$autosize"

//-------------------------其他常用------------------------------
//matisse 知乎图片选择
//api 'com.zhihu.android:matisse:0.5.0-beta3'

//CircleImageView  圆形图片
//api 'de.hdodenhof:circleimageview:2.2.0'

//动画
//api "com.airbnb.android:lottie:$lottieVersion"

//GSYVideoPlayer  视频播放器
//api 'com.shuyu:GSYVideoPlayer:2.1.1'

//Bugly 热修复+更新+异常上报  推荐
//api 'com.tencent.bugly:crashreport_upgrade:1.3.5'
```
