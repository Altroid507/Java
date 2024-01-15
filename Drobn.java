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
        this.ch = ch;
        this.zn = zn;
    }

    private static int gcd(int a, int b){
        int c;
        while (a % b != 0){
            c = a % b;
            a = b;
            b = c;
        }
        return c;
    }
    private void razion(){
        int gcd1 = gcd(ch, zn);
        ch = ch / gcd1;
        zn = zn / gcd1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        Drobn d1 = new Drobn(a, b);
        d1.razion();
        System.out.println(d1.ch + " " + d1.zn);
    }
}
