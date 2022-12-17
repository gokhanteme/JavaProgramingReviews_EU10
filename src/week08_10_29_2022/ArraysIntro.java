package week08_10_29_2022;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        // if we know the elements of the array
        int[]arrayName ={1,2,3,4,5,6,};

        //if we don't know the elements

        int[] array = new int[10];
        array[0]=10;
        array[1]=10;
        array[2]=10;
        array[3]=10;
        array[4]=10;
        array[5]=10;
        array[6]=10;
        array[7]=10;
        array[8]=10;
        array[9]=10;

        System.out.println(Arrays.toString(array));

        char[] letters = {'B', 'S', 'D', 'Y'};
        System.out.println(letters[0]);
        System.out.println(letters[2]);
        // sort method is sorting lements to smaller to bigger

        int [] numbers = {2,3,1,10,5};
        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));

        System.out.println("----------------------------------------------");



        int [] array3 ={1,2,3,};
        int [] array4 = {2,1,3};

        System.out.println(Arrays.equals(array3,array4));
    Arrays.sort(array4);

        System.out.println(Arrays.equals(array3,array4));
    }
}
