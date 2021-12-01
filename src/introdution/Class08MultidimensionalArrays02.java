package introdution;

public class Class08MultidimensionalArrays02 {
    public static void main(String[] args) {
        // ways to initialize
        int[][] numbers = new int[3][];
        int[] numbers1 = {1,2,3};
        int[] numbers2 = {45,1,2,56,8,10};

        // ways to fill the spaces
        numbers[0] = new int[]{0, 56};
        numbers[1] = numbers1;
        numbers[2] = numbers2;

        // another way to create and initialize
        int[][] myArray = {{1,2},{1,2,3},{1,2,3,4,5,6}};

        for (int[] baseArray :
                myArray) {
            System.out.println("\n--------");
            for (int num:
                 baseArray) {
                System.out.println(num);
            }
        }
    }
}
