package homework;

public class Cat extends Pet {
    private int I_O = 1;//0为outside,1为inside

    public Cat(String pname, String oname, double wt) {
        super(pname, oname, wt);
    }

    @Override
    public double visit(int shots) {
        double sum = super.visit(shots);
        if (I_O == 0) {
            //外猫多打一针
            sum += 30;
            setTmpMoney(getTmpMoney() + 30);
        }
        setTmpMoney(getTmpMoney() + 20);
        return sum + 20;
    }

    public void goOutside() {
        I_O = 0;
    }

    public int getI_O() {
        return I_O;
    }

    public void setI_O(int i_O) {
        I_O = i_O;
    }
}


