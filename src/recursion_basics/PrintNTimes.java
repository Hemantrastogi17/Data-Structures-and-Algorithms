package recursion_basics;

public class PrintNTimes {
    static void f(int i, int n) {
        if (i >n) {
            return;
        }
        System.out.println(i);
        f(i+1,n);
    }

    static void printName(int i, int n){
        if(i>n){
            return;
        }
        System.out.println("Hemant");
        printName(i+1,n);
    }

    static void printBack(int n){
        if(n<1){
            return;
        }
        System.out.println(n);
         printBack(n-1);
    }

    static int sumOfN(int n){
        if(n<1){
            return 0;
        }
       return n+sumOfN(n-1);
    }

    static int factorial(int n){
        if(n<1){
            return 1;
        }
        return n*factorial(n-1);
    }
    static int[] reverseArray(int i,int [] arr, int l){
        if(i>=l/2)
            return arr;
        int temp = arr[i];
        arr[i] = arr[l-i-1];
        arr[l-i-1] = temp;
        return reverseArray(i+1,arr,l);
    }
    public static void main(String[] args) {
        int n = 6;
        int i=1;
//        f(i,n);
//        printName (1,6);
//        printBack(6);
//        System.out.println(sumOfN(n));
//        System.out.println(factorial(n));
        int [] arr = {1,2,3,4,5,6,7,8};
        int [] nArr = (reverseArray(0, arr ,arr.length));
        for(int ele: nArr)
            System.out.print(ele+" ");

    }
}
