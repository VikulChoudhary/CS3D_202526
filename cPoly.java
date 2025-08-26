package Class1;

public class cPoly {
    cPoly(){
        System.out.println("B");
    }
    cPoly(int a){
        System.out.println(a);
    }
    public static void main(String[] args) {
        System.out.println("A");
        cPoly cc=new cPoly();
        cc.m1(5);
    }
    void m1(){
        System.out.println("C");
    }
    void m1(int a){
        System.out.println("B");
    }
    void m1(int a,String b){
        System.out.println("B");
    }

    public static void main() {
        System.out.println("Hello");
    }
}
