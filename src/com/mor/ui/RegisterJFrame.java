package com.mor.ui;

import javax.swing.*;

public class RegisterJFrame extends JFrame {

    public RegisterJFrame(){
        this.setSize(488, 500);

        this.setTitle("拼图注册");//设置标题

        this.setAlwaysOnTop(true);//设置置顶

        this.setLocationRelativeTo(null);//设置居中

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//设置关闭模式

        this.setVisible(true);//使界面显示
    }
}
