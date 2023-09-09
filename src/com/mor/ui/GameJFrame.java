package com.mor.ui;

import javax.swing.*;
import java.util.Random;

public class GameJFrame extends JFrame {
    int[][] data = new int[4][4];

    public GameJFrame(){
        //初始化界面
        initJFram();
        //初始化菜单
        initJmenuBar();
        //初始化数据（打乱）
        initData();
        //初始化图片
        initImage();
        //使界面显示
        this.setVisible(true);
    }

    private void initData() {
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        Random r = new Random();
        for (int i = 0; i < nums.length; i++) {
            int index = r.nextInt(nums.length);
            int tmp = nums[i];
            nums[i] = nums[index];
            nums[index] = tmp;
        }

        for (int i = 0; i < nums.length; i++) {
            data[i / 4][i % 4] = nums[i];
        }
    }

    //初始化图片
    private void initImage() {

        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                int num = data[j][i];
                //创建管理容器
                JLabel jLabel = new JLabel(new ImageIcon("D:\\computer learning\\code\\java_learning\\PUZZLE_GAME\\image\\animal\\animal3\\"+num+".jpg"));
                //指定图片位置
                jLabel.setBounds(i * 105, j * 105, 105, 105);
                //把容器添加到界面中
                this.getContentPane().add(jLabel);
            }
        }
    }

    private void initJmenuBar() {
        //初始化菜单
        JMenuBar JMenuBar = new JMenuBar();
        JMenu functionJMeun = new JMenu("功能");
        JMenu aboutJMeun = new JMenu("关于我们");

        JMenuItem replayItem = new JMenuItem("重新游戏");
        JMenuItem reLoginItem = new JMenuItem("重新登录");
        JMenuItem closeItem = new JMenuItem("关闭游戏");

        JMenuItem accountItem = new JMenuItem("公众号");

        functionJMeun.add(replayItem);
        functionJMeun.add(reLoginItem);
        functionJMeun.add(closeItem);

        aboutJMeun.add(accountItem);

        JMenuBar.add(functionJMeun);
        JMenuBar.add(aboutJMeun);

        this.setJMenuBar(JMenuBar);
    }

    private void initJFram() {
        //设置界面宽高
        this.setSize(603, 680);
        //设置标题
        this.setTitle("拼图小游戏");
        //设置置顶
        this.setAlwaysOnTop(true);
        //设置居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消默认居中放置
        this.setLayout(null);
    }

}
