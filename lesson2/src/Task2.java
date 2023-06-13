// 2) Реализуйте алгоритм сортировки пузырьком числового массива, 
// результат после каждой итерации запишите в лог-файл.

public class Task2 {

    public static void main(String[] args) {
        int arr[] = {9,3,2,5,1,7,6,4,8};
        int i = arr.length - 1;
        while(i >= 1)
        {
            int j = 0;
            while (j < i) {
                int temp;
                if(arr[j+1] < arr[j]) {temp = arr[j]; arr[j] = arr[j+1]; arr[j+1] = temp;}
                j++;
                }
            i--;
        }
        for(int k : arr){System.out.println(k);}
    }
}
