import java.util.Arrays;

public class Seven {
    public static void main(String[] args) {
        int[] m = {-23,-24,-26,-1,-2,-5,23,24,25,26,78,11,2,3,10,9,4,8,5,6,7,19,-6,39,36,-10};
        String v = "I am Abil and I developer I study java";
        System.out.println(array(m));
        task2(m);
        task3(m);
        task4(m);
        task5(m);
        task5_1(m);
        task6(v);
        task7();
    }
    static int array(int[] m ){
        for(int i = 0;i<m.length;i++){
            if (m[i]==707) {
                return i;

            }

        }
        return -1;
    }
    public static void task2(int[] m){
        int count = 0;
        int ch=0;

        for(int i =0;i<m.length;i++){
            if(m[i]%2==0) {
                count = count + m[i];
                ch++;
            }
        }
        System.out.println((double)count/ch);

    }
    public static void task3(int[] m){
        for(int i =0;i<m.length;i++){
            if(m[i]%2!=0 && m[i]<0){
                System.out.println(m[i]);
            }
        }
    }
    public static void task4(int[] m){
        for(int i =0;i<m.length;i++){
            for(int j =0;j<m.length;j++){
                if(m[i]+m[j]==13){
                    System.out.println(m[i]+" index " +i +" "+m[j]+" index "+j);
                }
            }
        }
    }
    public static void task5(int[] m){
        int c= 0;
        int res=0;
        int i1=-1;
        int i2=-1;
        for(int i=0;i<m.length-1;i++){
            int num1 =m[i];
            int num2 =m[i+1];
            if(num1<0){
                num1=num1*-1;
            }
            if(num2<0){
                num2=num2*-1;
            }
            c=num1-num2;
            if(c<0){
                c=c*-1;
            }
            if(c>res){
                res=c;
                i1=i;
                i2=i+1;
            }


        }
        System.out.println("Result : "+res+ " Index " + i1 +" "+i2);

    }
    public static void task5_1(int[] m){
        int res =0;
        for(int i =0;i<m.length-1;i++){
            for (int j = i+1; j < m.length; j++) {

                int c = m[i]-m[j];
                if(c<0){
                    c=c*-1;
                }
                if(c>res){
                    res=c;
                }
            }
        }

        System.out.println(res);

    }
    public static void task6(String v){
        char[] f = v.toCharArray();
        int count =1;
        for (int i = 0; i < f.length; i++) {
            if (f[i] == ' ') {
                count++;
            }
        }
        int[] slv = new int[count];
        int j =0;
        for (int i = 0;  i<f.length;i++) {
            if(f[i]==' '){
                j++;
            }
            if(f[i]!=' '){
                slv[j]++;
            }
        }
        System.out.println(Arrays.toString(slv));
    }
    public static void task6_1(String v){
        String[] slv =v.split(" ");
        for (int i = 0; i < slv.length; i++) {
            System.out.println(slv[i].length());
        }
    }
    public static void task7(){
        int[][] m = {
                {23,78,103,1,5},
                {50,10,2,200},
                {58,13,28,30,4},
                {65,61,63,78,11000},
                {8,9,7,4,6}
        };
        int max=0;
        for(int i =0;i<m.length;i++){
            for (int j = 0; j < m[i].length; j++) {
                if(m[i][j]>max){
                    max=m[i][j];
                }
            }
        }
        System.out.println(max);
    }



}
