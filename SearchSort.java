package search_sort;

//import java.util.ArrayList;
import java.util.Arrays;

public class SearychSort {

    private int[] numbers;
    private int size;
    private int index;
    private boolean sorted;

    public SearchSort(int size){
        this.size = size;
        this.numbers = new int[size];
    }

    public SearchSort(int[] numbers){
        this.size = numbers.length;
        this.index = this.size;
        this.numbers = numbers;
        this.sorted = false;
    }

    public int[] addToNumbers(int number){
        if (this.index == this.size){
            throw new IllegalArgumentException("Collection full");
        }
        sorted = false;
        this.numbers[index++] = number;

        return numbers;
    }

    public boolean isIn (int number){
        if (!sorted){
            bubbleSort();
        }

        int beg = 0;
        int end = numbers.length - 1;

        while (beg <= end){
            int mid = (beg + end) / 2;

            if (numbers[mid] == number){
                return true;
            }

            if (numbers[mid] < number){
                beg = mid + 1;

            }else end = mid - 1;
        }
        return false;
    }

    public int[] bubbleSort(){
        int n = numbers.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (numbers[j] > numbers[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
        sorted = true;

        return numbers;
    }

    public void getNumbers(){
        for (int i = 0; i < numbers.length; ++i) System.out.println(numbers[i]);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SearchSort that = (SearchSort) o;
        return Arrays.equals(numbers, that.numbers);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(numbers);
    }

    @Override
    public String toString() {
        return "SearchSort{" +
                "numbers=" + Arrays.toString(numbers) +
                '}';
    }

    public static void main(String[] args){
        //int[] array = {16, 320, 56, 334, 192, 1167, 78, 2, 23};

        SearchSort test = new SearchSort(9);
        test.addToNumbers(67);
        test.addToNumbers(2);
        test.addToNumbers(758);
        test.addToNumbers(54);
        test.addToNumbers(567);
        test.addToNumbers(556);
        test.addToNumbers(2381);
        test.addToNumbers(3);
        test.addToNumbers(283);
        //test.addToNumbers(1017);
        System.out.println(test.isIn(3));
        //test.bubbleSort();
        test.getNumbers();
    }


}
