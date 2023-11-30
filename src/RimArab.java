import java.util.Scanner;
public class RimArab {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        String printAge="";
        String[] unit ={"I","II","III","IV","V","VI","VII","VIII","IX","X"};
        String[] kel={"X","XL","L","XC","C","CD"};
        if(a>0 && a<10){
            printAge+=printAge+unit[a-1];
        }
        if(a>10 && a<40){
            int c=0;
            int b=a/10;
            while(c<b){
                printAge=printAge+unit[9];
                c++;
            }
            int d=a%10;
            printAge=printAge+unit[d-1];
        }
        if(a==40){
            printAge+="XL";
        }
        if(a>40 && a<50){
            int d = a%10;
            printAge=printAge+"XL"+unit[d-1];
        }
        if(a==50){
            printAge+="L";
        }
        if(a>50 && a<90){
            int c=0;
            int b=a/10;
            while(c<b-5){
                printAge=printAge+"X";
                c++;
            }
            printAge="L"+printAge;
            int d = a%10;
            printAge=printAge+unit[d-1];

        }
        if(a==90){
            printAge+="XC";
        }
        if(a>90 && a<100){
            int d = a%90;
            printAge="XC"+unit[d-1];
        }
        if(a==100){
            printAge+="C";
        }
        if(a>100 && a<400 && a%100<40){
            String d="";
            String e="";
            int c=0;
            int g=0;
            int h=0;
            int i = a/10;
            int b = a/100;
            while(i>9){
                i=i-10;
                g++;
            }
            while(h<g){
                e=e+"X";
                h++;
            }
            while(c<b){
                d=d+"C";
                c++;
            }
            if(a%10==0){
                printAge=printAge+d+e+unit[a%10];
            }
            else{
                printAge=printAge+d+e+unit[a%10-1];
            }

        }

        System.out.println(printAge);
    }
}
