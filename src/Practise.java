import java.util.Arrays;
import java.util.Scanner;
public class Practise {
        public static void main(String[] args) {
            /**
             *    Дан массив из элементов нужно в данный массив добавить новый элемент
             * */
            String[] array = {"Маша","Даша","Саша","Паша","Абдиль"};


            System.out.println(Arrays.toString(getArray(array, "Айдана")));
            // ["Маша","Даша","Саша","Паша","Абдиль","Айдана"]
            System.out.println(Arrays.toString(deleteElementFromArray(array,"Паша")));
        }

        public static String[] getArray(String[] arrayLines, String element){
            String[] array = new String[arrayLines.length+1];
            // тут нужно решить задачу
            for (int i = 0; i < arrayLines.length; i++) {
                array[i]=arrayLines[i];

            }
            array[array.length-1]=element;
            arrayLines=array;

            return arrayLines;
        }
        public static String[] deleteElementFromArray(String[] arrayLines,String elementDelete){
            String[] array = new String[arrayLines.length-1];
            for (int i = 0; i < arrayLines.length; i++){
                //if(i>= array.length){
                //    break;
                //}
                if(arrayLines[i].equals(elementDelete)){
                   if(i+1<arrayLines.length) {
                       array[i] = arrayLines[i + 1];
                       i++;
                   }
                }
                else{
                    array[i]=arrayLines[i];
                }
            }
            arrayLines=array;
            return arrayLines;
        }

}
