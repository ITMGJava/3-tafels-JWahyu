import java.util.Scanner;

public class JadeTafels {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Tafel van 8 als letterlijke println codes geschreven.

        System.out.println();
        System.out.println("Tafel van 8 d.m.v. letterlijke 'println' functies:");
        System.out.println();

        System.out.println("1 x 8 = 8");
        System.out.println("2 x 8 = 16");
        System.out.println("3 x 8 = 24");
        System.out.println("4 x 8 = 32");
        System.out.println("5 x 8 = 40");
        System.out.println("6 x 8 = 48");
        System.out.println("7 x 8 = 56");
        System.out.println("8 x 8 = 64");
        System.out.println("9 x 8 = 72");
        System.out.println("10 x 8 = 80");

        System.out.printf("%n―――――――――――――――――――――――――――%n");

        System.out.println();
        System.out.println("Tafel van 93 als variabel y:");
        System.out.println();

        int y = 93;

        System.out.println("1 x " + y + " = " + y);
        System.out.println("2 x " + y + " = " + y*2);
        System.out.println("3 x " + y + " = " + y*3);
        System.out.println("4 x " + y + " = " + y*4);
        System.out.println("5 x " + y + " = " + y*5);
        System.out.println("6 x " + y + " = " + y*6);
        System.out.println("7 x " + y + " = " + y*7);
        System.out.println("8 x " + y + " = " + y*8);
        System.out.println("9 x " + y + " = " + y*9);
        System.out.println("10 x " + y + " = " + y*10);

        System.out.printf("%n―――――――――――――――――――――――――――%n");

        // Tafel met van een  variabele input en een loop.
        System.out.printf("%nVoer een getal in en vervolgens krijg je een tafel van dat getal te zien. Dit is gemaakt d.m.v. een 'for' loop:%n");

        int c = input.nextInt();

        System.out.printf("%nTafel van %d als variabel c:%n", c);
        for (int d = 1; d <= 10; d++) {
            System.out.printf("%d x %d = %d%n", d, c, c*d);
        }

        System.out.printf("%nDat was het dan. Dank en tot ziens! :)%n");
    }
}
