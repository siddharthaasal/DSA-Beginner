package SearchingAndSorting;

class BubbleSort{
    public static void bubbleSort(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,1,4,5,2};
        bubbleSort(arr);
        print(arr);
    }
}