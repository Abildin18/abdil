import java.util.Scanner;
public class Small {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] m = new int[count];
        for(int i =0;i<count ;i++){
            m[i] = sc.nextInt();
        }
        int min = m[0];
        int max = m[0];
        for(int i=1 ;i<count;i++){
            if(m[i]%2==0 && m[i]>0  && count>0 && count<=10000 && m[i]<min){
                min = m[i];

            }
            if(m[i]%2==0 && m[i]>0 && count>0 && count<=10000 && m[i]>max) {
               max = m[i];

            }


        }
        if(min<=0 || min%2!=0){
            min = -1;
        }
        if(max<=0 || max%2!=0){
            max = -1;
        }
        System.out.print(min+" ");
        System.out.println(max);







    }
}
