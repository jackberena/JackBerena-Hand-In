import java.util.Arrays;

class ArrayAppend {
    public static void main( String args[] ) {
        int[] arr = {10, 20, 30};
        System.out.println(Arrays.toString(arr));

        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = 40; // Assign 40 to the last element
        System.out.println(Arrays.toString(arr));

    }}
    class Array {
    public static void main (String args[]){
        int[] arr ={ 10, 20 ,30,};
        System.out.println(Arrays.toString(arr));

        arr = Arrays.copyOf(arr, arr.length -1);// deletes the end of an array
        System.out.println(Arrays.toString(arr));
    }
    }
    class Arr {public static void main (String args[]){
            Integer arr[] = {10,20,30, 40};
            int n = arr.length;
            int index = 3;
            System.out.println("Original Array: "+Arrays.toString(arr));
            Integer newArr[] = new Integer[n+1];
            int j = 0;

            for(int i = 0; i<newArr.length; i++) {
                if(i==index) {
                    newArr[i] = 35;
                }else {
                    newArr[i] = arr[j];
                    j++;
                }
            }
            newArr[index] = 35;

            System.out.println("Array after adding value: "+Arrays.toString(newArr));
        }
    }