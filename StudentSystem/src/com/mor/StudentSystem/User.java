package com.mor.StudentSystem;


public class User {
    private String name;
    private String password;
    private String id;
    private String Phone;

    public User() {
    }

    public User(String name, String password, String id, String Phone) {
        this.name = name;
        this.password = password;
        this.id = id;
        this.Phone = Phone;
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
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取
     * @return Phone
     */
    public String getPhone() {
        return Phone;
    }

    /**
     * 设置
     * @param Phone
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String toString() {
        return "User{name = " + name + ", password = " + password + ", id = " + id + ", Phone = " + Phone + "}";
    }
}
