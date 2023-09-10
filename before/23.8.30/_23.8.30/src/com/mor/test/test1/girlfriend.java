package com.mor.test.test1;


public class girlfriend {
    private String name;
    private double height;
    private double weight;

    public girlfriend() {
    }

    public girlfriend(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }


    /**
     * 获取
     * @return height
     */
    public double getHeight() {
        return height;
    }

    /**
     * 设置
     * @param height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * 获取
     * @return weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * 设置
     * @param weight
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void wash()
    {
        System.out.println("女朋友帮我洗衣服");
    }
    public void cook()
    {
        System.out.println("女朋友帮我做饭");
    }
    public void show()
    {
        System.out.println("我女友叫" + name + "身高" + height + "体重" +  weight);
    }


}
