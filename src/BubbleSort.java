
public class BubbleSort {

    static void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  //loop will continue until the sorting is done, array of each element
                 for(int j=1; j < n; j++){  //loop will continue until it's compare till all the index
                          if(arr[j-1] > arr[j]){  //compare 2 index if first index element is bigger than 2nd index element 
                                 //swap elements  
                                 temp = arr[j-1];  //if true then bigger element keep in temp
                                 arr[j-1] = arr[j];  // keep smaller element in first index position
                                 arr[j] = temp;  //bring the element of temp and add it to the 2nd index position
                         }     
                 }  
         }  
  
    }  
    public static void main(String[] args) {  
                int arr[] ={3,60,35,2,45,320,5};  
                 
                System.out.println("Array Before Bubble Sort");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
                System.out.println();  
                  
                bubbleSort(arr);//sorting array elements using bubble sort  
                 
                System.out.println("Array After Bubble Sort");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
   
        }  
}
