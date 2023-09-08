public class Test {
    public static void main(String[] args) {
        B b = new B(new InterB() {
            @java.lang.Override
            public void showB() {
                System.out.println("匿名内部类调用");
            }
        });

        b.methodB();


    }
}

//定义一个接口
interface InterB {
    void showB();
}

//目标：调用成员方法methodB
class B {
    InterB b;
    public B(InterB b){
        this.b = b;
    }
    public void methodB(){
        b.showB();
    }
}