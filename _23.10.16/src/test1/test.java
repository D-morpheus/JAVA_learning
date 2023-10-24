package test1;

import java.sql.SQLOutput;

public class test {
    public static void main(String[] args) {

        PassObject p = new PassObject();
        Circle c = new Circle(1);
        p.printAreas(c, 5);
    }
}
