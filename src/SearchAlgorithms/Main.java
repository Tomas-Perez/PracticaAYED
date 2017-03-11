package SearchAlgorithms;

public class Main {
    public static void main(String[] args){
        int [] array = {1,2,3,5,6,7,8};
        System.out.println(binarySearch(4,array));
        System.out.println(binarySearch(7,array));
        System.out.println(binarySearch(1,array));
        System.out.println(binarySearch(9,array));
    }

    public static boolean sequentialSearch(int k, int[] a){
        for(int i = 0; i < a.length; i++){
            if(k == a[i]) return true;
        }
        return false;
    }

    public static boolean binarySearch(int k, int[] a){
        int start = 0;
        int end = a.length-1;

        int middleIndex = (end+start)/2;
        while(k != a[middleIndex]) {
            if(start < end) {
                if (k < a[middleIndex]) {
                    end = middleIndex-1;
                    middleIndex = (end+start) / 2;
                } else {
                    start = middleIndex+1;
                    middleIndex = (end+start)/2 ;
                }
            }
            else return false;
        }
        return true;
    }
}
