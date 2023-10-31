package homework;

public class Human implements GetNum{
    private int age;
    public Human(int age) {
        this.age = age;
    }

    public Human() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public double getNum() {
        return age;
    }
}
