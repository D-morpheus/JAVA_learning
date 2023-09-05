package com.mor.demo3;

public class cook extends Person{
    public cook() {
    }

    public cook(String id, String name, int salary) {
        super(id, name, salary);
    }

    @Override
    public void work()
    {
        System.out.println("炒菜");
    }
}
