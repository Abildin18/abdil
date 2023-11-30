package warcraft_v_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Igra varcraft nachalas!");
        boolean gameActive = true;
        do {
            System.out.println("                          1)  Single player");
            System.out.println("                          2)  Battlenet");
            System.out.println("                          3)  Local area network");
            System.out.println("                          4)  Options");
            System.out.println("                          5)  Credits");
            System.out.println("                          6)  Quit");
            System.out.println("Choose your method: ");
            int a = sc.nextInt();
            if (a == 1 ) {
                System.out.println("Vy voshli v singlr igru!");
                System.out.println("Choose which would you be: ");
                System.out.println("1)Lyudi");
                System.out.println("2)Orki");
                System.out.println("3)Elfy");
                System.out.println("4)Nezhit");
                int b = sc.nextInt();
                if(b==1){
                    System.out.println("Ty chelovek");
                }
                if(b==2){
                    System.out.println("Ty ork");
                }
                if(b==3){
                    System.out.println("Ty elf");
                }
                if(b==4){
                    System.out.println("Ty nezhit");
                }
                if(b>6 || b<1){
                    System.out.println("Error");
                }

            }
            if (a == 2 ) {
                System.out.println("Vy voshli v batlnet");
            }
            if (a == 3) {
                System.out.println("Vy voshli v local network");
            }
            if (a == 4) {
                System.out.println("Vy voshli v optsii");
            }
            if (a == 5) {
                System.out.println("Vy voshli v credity");
            }
            if (a == 6) {
                System.out.println("Vy vyshli iz igry");
                gameActive=false;
            }
            if(a < 1 || a > 6){
                System.err.println("ERROR");
            }
        }while(gameActive);
        System.out.println("Igra warcraft zakonchilas!");
    }
}