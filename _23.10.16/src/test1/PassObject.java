package test1;

public class PassObject {
    public PassObject() {
    }

    public void printAreas(Circle c, int times){
        System.out.println("Radius\tArea");
        for (int i = 1; i <= times; i++) {
            c.setRadius(i);
            System.out.print(c.getRadius() + "\t" + c.findAreas() + "\n");
        }
    }
}
