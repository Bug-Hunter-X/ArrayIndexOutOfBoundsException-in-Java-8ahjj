public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2;
        }
        //Now accessing valid indices. For example:
        System.out.println(arr[0]);//prints 0
        System.out.println(arr[4]);//prints 8
    }
}