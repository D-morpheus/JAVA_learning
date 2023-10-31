package homework;

public class test {
    public static void main(String[] args) {
        Student s1 = new Student(17);
        Student s2 = new Student(18);
        Student s3 = new Student(19);

        DataSet ds = new DataSet();
        ds.add(s1);
        ds.add(s2);
        ds.add(s3);

        System.out.println(ds.getAverage());
        System.out.println(ds.getMaximum());

    }
}
