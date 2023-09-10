package game;

public class game_test {
    public static void main(String[] args) {
        Role r1= new Role("China", 100000000);
        Role r2 = new Role("America", 100);

        while(true)
        {
            r1.attack(r2);
            if(r2.getBlood() == 0)
            {
                System.out.println(r1.getName() + " K.O了 " + r2.getName());
                break;
            }
            r2.attack(r1);
            if(r1.getBlood() == 0)
            {
                System.out.println(r2.getName() + " K.O了 " + r1.getName());
                break;
            }

        }
    }


}
