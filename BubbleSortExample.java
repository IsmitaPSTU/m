import java.util.Scanner;

public class BubbleSortExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elemnts: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
       
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //Display original array
        System.out.println("Originl Array:");
        printArray(arr);
        System.out.println();
        //Ascending Order
        bubbleSortAscending(arr.clone());
        //Descending Order
        bubbleSortDescending(arr.clone());
    }
    static void bubbleSortAscending(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted Array(Ascending):");
        printArray(arr);
        System.out.println();
    }
    //Buuble sort descending
    static void bubbleSortDescending(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted Array(Descending):");
        printArray(arr);
        System.out.println();
    }
    static void printArray(int[] arr){
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i<arr.length-1){
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
    
}