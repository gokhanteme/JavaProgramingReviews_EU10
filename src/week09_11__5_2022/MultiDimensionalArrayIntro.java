package week09_11__5_2022;

public class MultiDimensionalArrayIntro {
    public static void main(String[] args) {

        int[] firstArray = {1, 2, 3};
        int[] secondArray = {4, 5, 6};
        int[] thirdArray = {7, 8, 9};

        int[][] twoDimenArray = {
                {1, 2, 3},//first array // 0
                {4, 5, 6},//second array // 1
                {7, 8, 9, 10},//third array // 2
        };

        int[][] array2D = {firstArray, secondArray, thirdArray};// we can use like this.

        System.out.println(twoDimenArray[0][1]); // in order to reach 2 first need to go to first array
        // index of array which is 0 then I need to og to  that element by using index of element which is 1


        System.out.println(twoDimenArray[2][2]);
        System.out.println("---------------------------------------");

        for (int i = 0; i < twoDimenArray.length; i++) {// in order to go to one by one array
            System.out.println(i + 1 + " .array ");
            for (int j = 0; j < twoDimenArray[i].length; j++) {// this is for finding element inside inner array
                System.out.println(twoDimenArray[i][j]);
            }
            System.out.println("====================");

            int[][][] array3D = {
                    {
                            {1, 2, 3},
                            {4, 5, 6}

                    },
                    {
                            {1, 2, 3},
                            {4, 5, 6}

                    }

            };
        }

    }
}