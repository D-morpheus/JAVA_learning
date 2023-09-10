package test1;

public class Goods_test {
    public static void main(String[] args) {
        Goods[] arr = new Goods[3];

        Goods g1 = new Goods("001", "华为手机", 5999, 100);
        Goods g2 = new Goods("002", "保温杯", 227, 50);
        Goods g3 = new Goods("003", "枸杞", 12.7, 70);

        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;

        int sum = 0;

        for(int i = 0; i < arr.length; i++)
        {
            sum += arr[i].getPrice();
            //System.out.println(arr[i].getId() + ","+ arr[i].getName()+ ",价格"+arr[i].getPrice()+",剩余"+arr[i].getRemind());
        }

        int avg = sum / arr.length;
        double avg1 = sum*1.0 / arr.length;
        System.out.println(avg1);

    }
}
