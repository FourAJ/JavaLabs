import java.util.Arrays;


public class ArraySwap {
    public static void main(String[] args){
        int amountItems = 10;
        int k = 2;


        int [] Array = new int[amountItems];
        for(int i = 0; i < Array.length; i++ ){
            Array[i] = i;
        }


        int [] shiftArray = new int[amountItems + k];
        Arrays.fill(shiftArray, -1);


        String ArrayString = Arrays.toString(Array);
        System.out.printf("Default Array:\n%s\n", ArrayString);


        for(int i : Array){
            shiftArray[i+k] = Array[i];
            Array[i] = shiftArray[i];
        }


        String shiftArrayString = Arrays.toString(Array);
        System.out.printf("Shifted Array:\n%s\n", shiftArrayString);
    }
}


//                    Default Array:
//                    [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
//                    Shifted Array:
//                    [-1, -1, 0, 1, 2, 3, 4, 5, 6, 7]