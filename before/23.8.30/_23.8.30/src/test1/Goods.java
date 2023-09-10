package test1;

public class Goods {
    private String id;
    private String name;
    private double price;
    private int remind;


    public Goods() {
    }

    public Goods(String id, String name, double price, int remind) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.remind = remind;
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
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * 获取
     * @return remind
     */
    public int getRemind() {
        return remind;
    }

    /**
     * 设置
     * @param remind
     */
    public void setRemind(int remind) {
        this.remind = remind;
    }


}
