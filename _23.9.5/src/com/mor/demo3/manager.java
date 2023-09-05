package com.mor.demo3;

public class manager extends Person{
    private int bones;

    public manager() {
    }

    public manager(String id, String name, int salary, int bones){
        super(id, name, salary);
        this.bones = bones;
    }

    public int getBones() {
        return bones;
    }

    public void setBones(int bones) {
        this.bones = bones;
    }

    @Override
    public void work()
    {
        System.out.println("管理其他人");
    }
}
