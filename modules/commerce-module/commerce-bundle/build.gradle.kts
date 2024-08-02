plugins {
    id("io.github.electrolytej.static-bundle-plugin")
    alias(libs.plugins.kotlin.android)
}
apply(from = "${rootDir}/script/ui_tradition.gradle")
android {
    namespace = "com.electrolytej.commerce"
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.google.android.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.test.espresso.core)

//    // 登陆
//    implementation("com.alibaba.baichuan.sdk:alibclogin:5.0.0.13")
//    // applink
//    implementation("com.alibaba.baichuan.sdk:alibcapplink:5.0.0.13")
//    // 广告SDK
//    implementation("com.alibaba.baichuan.sdk:alibcad:5.0.0.13")
//    // 小程序
//    implementation("com.alibaba.baichuan.sdk:alibctriver:5.0.0.13")
//    // c++基础库（如果工程中没有接入该so包：libc++_shared.so，需要接入该sdk）
//    implementation("llvm.stl:cpp_shared:0.0.3@aar")
//    // 直播
//    implementation("com.alibaba.baichuan.sdk:alibctriver_live:5.0.0.13")
//    // webview容器
//    implementation("com.alibaba.baichuan.sdk:alibcwebview:5.0.0.13")
//    // 电商基础组件
//    implementation("com.alibaba.baichuan.sdk:alibctradecommon:5.0.0.13")
//    implementation("com.alibaba.baichuan.sdk:alibcnbtrade:5.0.0.13")
//    implementation("com.alibaba.baichuan.sdk:alibcprotocol:5.0.0.13")
//    // 辅助排查工具（可选）
//    implementation("com.alibaba.baichuan.sdk:alibctools:5.0.0.13")
//    // 安全保镖v5版本（根据实际情况，v5和v6版本选择其一）
//    implementation("com.taobao.android:securityguardaar3:5.0.0.9-v5@aar")
//    implementation("com.taobao.android:securitybodyaar3:5.0.0.9-v5@aar")
//    implementation("com.taobao.android:avmpaar3:5.0.0.9-v5@aar")
//    implementation("com.taobao.android:sgmiddletieraar3:5.0.0.9-v5@aar")
//    // 安全保镖v6版本
//    implementation("com.taobao.android:securityguardaar3:5.0.0.9-v6@aar")
//    implementation("com.taobao.android:securitybodyaar3:5.0.0.9-v6@aar")
//    implementation("com.taobao.android:sgmiddletieraar3:5.0.0.9-v6@aar")
//    implementation("com.alibaba:fastjson:1.1.71.android")
}