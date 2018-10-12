package tp5.ej7;

public class Classes {
    static class A{
        int m1(){
            return m3();
        }

        int m2(){
            return 10;
        }

        int m3(){
            return 5;
        }

        int m4(){
            return m4();
        }
    }

    static class B extends A{
        int m1(){
            return 8;
        }

        int m2(){
            return super.m1();
        }

        int m4(){
            return 20;
        }

        int m5(){
            return m3();
        }

        int m7(){
            return m4();
        }
    }

    static class C extends B{
        int m1(){
            return super.m1();
        }

        int m2(){
            return m6();
        }

        int m6(){
            return 3;
        }
    }

    static class D extends B{
        int m1(){
            return super.m3();
        }

        int m3(){
            return m4();
        }

        int m5(){
            return 2;
        }
    }

    public static void main(String args[]){
        /*A a = new A();
        System.out.println(a.m1());
        System.out.println(a.m2());
        System.out.println(a.m3());
        System.out.println(a.m4());
        //System.out.println(a.m5());
        //System.out.println(a.m6());
        //System.out.println(a.m7());
        B b = new B();
        System.out.println(b.m1());
        System.out.println(b.m2());
        System.out.println(b.m3());
        System.out.println(b.m4());
        System.out.println(b.m5());
        //System.out.println(b.m6());
        System.out.println(b.m7());
        C c = new C();
        System.out.println(c.m1());
        System.out.println(c.m2());
        System.out.println(c.m3());
        System.out.println(c.m4());
        System.out.println(c.m5());
        System.out.println(c.m6());
        System.out.println(c.m7());
        */D d = new D();
        System.out.println(d.m1());
        System.out.println(d.m2());
        System.out.println(d.m3());
        System.out.println(d.m4());
        System.out.println(d.m5());
        //System.out.println(d.m6());
        System.out.println(d.m7());
    }
}
