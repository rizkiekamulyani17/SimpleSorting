public class simpleshorting {
    private static void bubbleSort(int [] arr){
        int n = arr.length;
        int temp = 0;
        for(int i = 0;i<n;i++){
            for(int j =1;j<n;j++){
                if (arr[j - 1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] =arr[j];
                    arr[j]=temp;
                }
            }
        }

    }
    public static void main(String[] args) {
        int angka[]={5,6,1,0,2};
        System.out.println();
        bubbleSort(angka);
        System.out.println("Shorting");
        for(int i=0;i<angka.length;i++){
            System.out.print(angka [i] + " ");
        }

    }
}
