
public class CallChain {

    private static void A() {
        System.out.println("entering method A");
        B();
        System.out.println("exiting method A");
    }
    
    private static void B() {
        System.out.println("entering method B");
        try {
            C();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array abuse detected!");
        }
        System.out.println("exiting method B");
    }
    
    private static void C() {
        System.out.println("entering method C");
        D();
        System.out.println("exiting method C");
    }
    
    private static void D() {
        System.out.println("entering method D");
        E();
        System.out.println("exiting method D");
    }
    
    private static void E() {
        System.out.println("entering method E");
        int[] a = {};
        a[0] = 5;
        System.out.println("exiting method E");
    }
    
    public static void main(String[] args) {
        A();
    }
}
