package game;

import java.util.Random;

public class Role {
    private String name;
    private int blood;


    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public Role() {
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return blood
     */
    public int getBlood() {
        return blood;
    }

    /**
     * 设置
     * @param blood
     */
    public void setBlood(int blood) {
        this.blood = blood;
    }

    //攻击方法
    public void attack(Role role)
    {
        Random r = new Random();
        int hurt = r.nextInt(20) + 1;//计算伤害

        int remind = role.getBlood() - hurt;//剩余血量

        role.setBlood(remind > 0 ? remind : 0);//设置血量

        System.out.println(this.name + "举起拳头，打了" + role.getName() + "一下，造成了"
        + hurt + "点伤害," + role.getName() + "剩余" + role.getBlood() + "点血");
    }

}
