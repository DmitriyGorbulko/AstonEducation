package module.fifth.strategy;

public class Main {
    public static void main(String[] args) {
        int[] array = {2,32,453,2,1,0,3,5,2,4};
        print(array);


        ArraySorted bubbleSorted = new ArraySorted(new BubbleSort());;
        print(bubbleSorted.sort(array));

        ArraySorted mergeSorted = new ArraySorted(new MergeSort());;
        print(mergeSorted.sort(array));
    }

    public static void print(int[] array){
        for (int i = 0; i < array.length - 1; i++){
            System.out.print(array[i]);
            System.out.print(" ");
        }
        System.out.println("");
    }
}
