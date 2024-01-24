import java.util.Scanner;

public class Drobn {
    int ch, zn;

    Drobn() {
        zn = 1;
    }

    Drobn(int ch, int zn) {
        if (zn == 0) {
            System.out.println("Знаменатель не может быть равен нулю.");
            return;
        }
        if (ch < 0 && zn < 0){
            ch *= -1;
            zn *= -1;
        }
        else if (zn < 0){
            ch *= -1;
            zn *= -1;
        }
        this.ch = ch;
        this.zn = zn;
    }

    private static int gcd(int a, int b){
        int c = 1;
        if (a > b){
            int maxim = a;
            a = b;
            b = maxim;
        }
        while (a % b != 0){
            c = a % b;
            a = b;
            b = c;
        }
        return c;
    }
    private void razion(){
        int gcd1 = gcd(zn, ch);
        if (gcd1 < 0){
            gcd1 *= -1;
        }
        ch = ch / gcd1;
        zn = zn / gcd1;
    }

    private int get_ch(){
        this.razion();
        return this.ch;
    }

    private int get_zn(){
        this.razion();
        return this.zn;
    }

    private boolean pravilno(){
        if (this.ch >= this.zn){
            return false;
        }
        return true;
    }

    public String toString(){
        return (this.ch + "/" + this.zn);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        Drobn d1 = new Drobn(a, b);
        System.out.println(d1.toString());
        //System.out.println(d1.pravilno());
        //d1.razion();
        //System.out.println(d1.get_ch() + " " + d1.get_zn());
        //System.out.println(d1.ch + " " + d1.zn);
    }
}
