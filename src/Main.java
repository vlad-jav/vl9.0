import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Привет мир! ");
        task1();
        task2();
        task3();
        task4();

    }

    private static void task4() {
        System.out.println(" Задача 4");
        int[] weight = {1, 2, 3};
        for (int i =0; i < weight.length;i++){
            if (weight[i]% 2 !=0){
                weight[i]+=1;
            }
        }
        System.out.println(Arrays.toString(weight));
    }

    private static void task3() {
        System.out.println(" Задача 3");
        int[] weight = {1, 2, 3};
        double[] weights = {1.57, 7.654, 9.986};
        char[] weights1 = {4,5,6 };
        for (int i = weight.length -1; i >= 0 ; i-- ){
            System.out.print(weight[i]);
            if (i!= 0){
                System.out.println(", ");
            }
        }
        System.out.println();
        for (int i = weights.length -1; i >= 0 ; i-- ){
            System.out.print(weights[i]);
            if (i!= 0){
                System.out.println(", ");
            }
        }
        System.out.println();

        for (int i = weights1.length -1; i >= 0 ; i-- ){
            System.out.print(weights1[i]);
            if (i!= 0){
                System.out.println(", ");
            }
        }
        System.out.println();

    }

    private static void task2() {
        System.out.println(" задача 2");
        int[] weight = {1, 2, 3};
        double[] weights = {1.57, 7.654, 9.986};
        char[] weights1 = {4,5,6 };
        for (int i = 0; i < weight.length; i++) {
            System.out.print(weight[i]);
            if (i != weight.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < weights.length; i++) {
            System.out.print(weights[i]);
            if (i != weights.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < weights1.length; i++) {
            System.out.print(weights1[i]);
            if (i != weights1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }






    private static void task1() {
        System.out.println(" задача 1");
        int [] weight = new int[3];
        weight[0]=1;
        weight[1]=2;
        weight[2]=3;

        double[]weights={1.57,7.654,9.986};

        char[] weights1 ={4,5,6};
        
        
    }
}