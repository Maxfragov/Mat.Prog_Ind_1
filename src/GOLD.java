import java.text.DecimalFormat;

import static java.lang.StrictMath.sqrt;

public class GOLD {
    double a, b, e, alp;

    GOLD(double a, double b, double e, double alp) {
        this.a = a;
        this.b = b;
        this.e = e;
        this.alp = alp;
    }

    double f(double x) {

        return x * x+4*x+5;
    }

    void p() {
        DecimalFormat df = new DecimalFormat("#.####");

        double a1, b1;
        String d, s1, s2;
        double r;
        double ser;
        double x1, x2, xx1, xx2;
        int k = 0;
        x1 = a+(1-(sqrt(5)-1)/2)*(b-a);
        x2 = a+(sqrt(5)-1)/2*(b-a);
        double q1 = 0;
        while ((b - a) > 2*e) {


            System.out.println("Итерация № = " + k);
            System.out.println("x1= " + x1);
            System.out.println("x2= " + x2);
            System.out.println("fx1= " + f(x1));
            System.out.println("fx2= " + f(x2));


            if (f(x1) <= f(x2)) {

                this.b = x2;
                x2=x1;
                x1=a+(1-(sqrt(5)-1)/2)*(b-a);
            }
            else
                {

                this.a = x1;
                x1=x2;
                x2=a+(sqrt(5)-1)/2*(b-a);              }




            k = k + 1;

            System.out.println("a= " + a);
            System.out.println("b= " + b);
        }
        double w = (a + b) / 2;
        d = df.format(w);
        r = Double.parseDouble(d.replace(",", "."));
        System.out.println("Точка миниммума = " + w);
        System.out.println("Минимум функции = " + f(w));

        System.out.println("Количество итераций = " + k);


    }
}
