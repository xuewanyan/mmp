package cn.com.yitong.ares.xulie;

import java.util.ResourceBundle;

/** 读取资源文件ResourseBundle */
public class Demo2 {

    public static void main(String[] args) {
        // 读取资源文件的名称，但是没有后缀，资源文件保存在CLASSPATH中
        ResourceBundle resourceBundle = ResourceBundle.getBundle("co.com.yitong.ReadMe");
    }
}
