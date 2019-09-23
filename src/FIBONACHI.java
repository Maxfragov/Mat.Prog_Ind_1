import java.text.DecimalFormat;
public class FIBONACHI
{
    double a, b, e, alp;

    FIBONACHI(double a, double b, double e, double alp) {
        this.a = a;
        this.b = b;
        this.e = e;
        this.alp = alp;
    }

    double f(double x) {
        return 2*x * x-12*x+19;
    }

    void p() {
        DecimalFormat df = new DecimalFormat("#.####");
        double[] fib = new double[101];

        double a1, b1;
        String d, s1, s2;
        double r;
        double ser;
        double x1, x2, xx1, xx2;
        int k = 0;
        int n;
        n=0;
        fib[0]=1;
        fib[1]=1;
        for (int i=1;i<100;i++) {
            fib[i+1]=fib[i-1]+fib[i];
        }
        for (int i=1;i<100;i++)
         if (((b-a)/(2*e)<=fib[i]) && ((b-a)/(2*e)>fib[i-1]))
             n=i;
        int n1=n;
        double q1 = 0;

        x1 = a+fib[n-2]*(b-a)/fib[n];
        x2 = a+fib[n-1]*(b-a)/fib[n];
        xx1=x1;
        xx2=x2;
        a1=a;
        b1=b;
        while ((b1 - a1) > 2*e){
            k = k + 1;
            System.out.println("Итерация № = " + k);
            System.out.println("x1= " + x1);
            System.out.println("x2= " + x2);
            System.out.println("fx1= " + f(x1));
            System.out.println("fx2= " + f(x2));
            if (f(x1) <= f(x2)){
                b1 = x2;
                x2=x1;
                x1=a1+b1-x2;}
            else {
                a1 = x1;
                x1=x2;
                x2=a1+b1-x1;

            }



            System.out.println("a= " + a1);
            System.out.println("b= " + b1);
        }
        double w = (a1 + b1) / 2;
        System.out.println("Точка миниммума = " + w);
        System.out.println("Минимум функции = " + f(w));

        System.out.println("Количество итераций = " + k);
        System.out.println(fib[n]);

    }
}
