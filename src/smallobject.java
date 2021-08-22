import java.util.Date;

public class smallobject extends Date {
    public static void main(String[] args) {
       /* persion1 p = new persion1();
        System.out.println(p.getClass().getSuperclass().getName());*/
       /* new smallobject().c1();*/
         smallobject sma=new c();
         sma.c1();
    }
    void c(){
        System.out.println("this is smallobject.c()");
    }
    void c1(){
        System.out.println("this is smallobject.c1()");
    }
/*    public void c1(){
        System.out.println(super.getTime());
        System.out.println(this.getTime());
    }*/
}
    class c extends smallobject{

        void c1(){
            System.out.println(super.getClass().getName());//超类引用未生效，因为super只能调用父类的方法，所以对象运行时类是c.
            System.out.println(this.getClass().getSuperclass().getName());
        }
        void c() {
            System.out.println("this is c.c()");
        }
}


