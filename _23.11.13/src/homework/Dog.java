package homework;

public class Dog extends Pet{
    private String size;
    public Dog(String pname, String oname, double wt, String size) {
        super(pname, oname, wt);
        this.size = size;
    }

    @Override
    public double visit(int shots) {
        double sum = super.visit(shots);
        if(size.equals("medium"))
        {
            sum += 2.5*shots;
            setTmpMoney(getTmpMoney() + 2.5*shots);
        }
        if(size.equals("large"))
        {
            sum += 5*shots;
            setTmpMoney(getTmpMoney() + 5*shots);
        }
        setTmpMoney(getTmpMoney() + 15);
        return sum + 15;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
