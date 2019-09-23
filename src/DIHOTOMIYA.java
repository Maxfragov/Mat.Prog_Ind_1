import java.text.DecimalFormat;

public class DIHOTOMIYA {
    double a, b, e, alp;

    DIHOTOMIYA(double a, double b, double e, double alp) {
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

        double a1, b1;
        String d, s1, s2;
        double r;
        double ser;
        double x1, x2, xx1, xx2;
        int k = 0;

        double q1 = 0;
        while ((b - a) > 2*e) {
            ser = (a + b) / 2;
            x1 = (ser - alp/2);
            x2 = (ser + alp/2);

            if (f(x1) < f(x2))
                this.b = x2;
            if (f(x1) > f(x2))
                this.a = x1;
            if (f(x1) == f(x2)){
                this.a = x1;
                this.b = x2;}


            k = k + 1;
            System.out.println("Середина = " + ser);
            System.out.println("Итерация № = " + k);
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
