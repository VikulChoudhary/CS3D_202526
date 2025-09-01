package Interface;
interface Inter1{
    //if 1 method is there it is call functional interface
    int x=112;
    void method1();
//    void method2();

}
interface Inter2{
    int x=114;
    void method3();

}

public class test1 implements Inter1,Inter2{
    public static void main(String[] args) {
        System.out.println("Main Entry Point");
        System.out.println(Inter1.x);
        int x=113;
        System.out.println(x);
    }
    public void method1(){
        System.out.println("This is my method1");
    }
    public void method3(){
        System.out.println("This is my method1");
    }
}
