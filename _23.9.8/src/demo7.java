public class demo7 {
    public class Test {
        public void main(String[] args) {
            A a = new A();

            class B implements InterA{

                @Override
                public void showA() {
                    System.out.println("创建对象使用a");
                }
            }

            B b = new B();
            a.methodA((b));
//            a.methodA(new InterA() {
//                @Override
//                public void showA() {
//                    System.out.println("使用A");
//                }
//            });

        }
    }


    //定义接口
    interface InterA {
        void showA();

    }

    public class A {
        public A() {
        }

        public void methodA(InterA a) {
            a.showA();
        }
    }
}
