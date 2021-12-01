package introdution;

public class Class08MultidimensionalArrays01 {
    public static void main(String[] args) {
        int[][] numbers = new int[3][3];
        numbers[0][0] = 1;
        numbers[0][1] = 2;
        numbers[0][2] = 3;
        numbers[1][0] = 4;
        numbers[1][1] = 5;
        numbers[1][2] = 6;

//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = 0; j < numbers[i].length; j++) {
//                System.out.println(numbers[i][j]);
//            }
//        }

        for (int[] baseArray: numbers) {
                for (int index: baseArray) {
                    System.out.println(index);
                }
        }

    }
}
