import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        DIHOTOMIYA q=new DIHOTOMIYA(0,10,0.00005,0.00002);

        FIBONACHI w=new FIBONACHI(0,10,0.00000000005,0.2);

        GOLD r=new GOLD(-4,6,0.5,0.2);

        System.out.println("DIHOTOMIYA ");
        q.p();
        System.out.println("");
        System.out.println("FIBONACHI ");
        System.out.println("");
        w.p();

        System.out.println("GOLD ");
        System.out.println("");
        r.p();
    }

}
