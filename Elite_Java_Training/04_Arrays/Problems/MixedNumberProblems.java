import java.util.*;
class Program{
    void p1(){
        int num = 12;
        int N_Square = 0;
        int R_Square = 0;
        
        int rev_num = 0; // 21
        int temp = num;  
        while (temp != 0) {
            int digit_num = temp % 10;
            rev_num = (rev_num * 10) + digit_num; // 0 * 10 + 2 = 2 // 2 * 10 + 1 = 21
            temp /= 10;
        }
        
        
        N_Square = num * num; // 144
        R_Square = rev_num * rev_num; // 441
        
        
        int temp_s  = R_Square;
        int R_Square_rev = 0;
        
        while(temp_s !=0){
            int digit_rev = temp_s %10;
            R_Square_rev = ( R_Square_rev* 10) + digit_rev;
            temp_s /=10;
        }
        //System.out.println(R_Square);
        if (N_Square == R_Square_rev) {
            System.out.println("It was Adam Number");
        } else {
            System.out.println("Not an Adam Number");
        }
    }
    void p2(){
        int[] arr = {2, 5, 3, 2, 8, 5, 2};
        for (int i = 0; i < arr.length; i++) {

            int found = 0;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    found++;
                    continue;
                }
            }
            if (found != 0) {
                System.out.println( arr[i] + " Occurrence: " + found);
            }
        }
    }
    void p3(){
        int num = 1538;
        int original = num;
        int length = 0;
        int sum = 0;

        while (num != 0) {
            length++;
            num /= 10;
        }

        num = original;

        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, length);
            num /= 10;
        }

        if (sum == original) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
    }
    void p4(){
        int n = 10;

        int num1 = 2;
        int num2 = 1;
        int temp = 0;

        for (int i = 2; i < n; i++) {

            temp = num1 + num2;
     System.out.println(temp);
            num1 = num2;
            num2 = temp;
            
        }

    }
    void p5(){
        int[] arr = {4,5,3,4,5,4};

for (int i = 0; i < arr.length - 1; i++) {
    for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] < arr[j]) {  
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
System.out.println(arr[1]);
    }
    void p6(){
        int[] arr = {4,5,3,4,5,6,6};
        for(int i=0;i<arr.length; i++){
            int found =1;
            for(int j=0;j<arr.length;j++){
                if(i!=j){
                    if(arr[i] == arr[j] && j>i){
                        //System.out.println(arr[i]);
                        found++;
                        
                    }else if(j<i && arr[i] == arr[j]){
                        break;
                    }
                }
            }
            System.out.println(found +" ocurence" + arr[i]);
        }
    }
    void p7(){
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        int[] arr_original = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            boolean duplicate = false;

       for (int j = 0; j < i; j++) {
         if (arr[i] == arr[j]) {
            duplicate = true;
            break;
        }
    }
    if (!duplicate) { // true
        arr_original[i] = arr[i];
    }
}
for(int i =0; i<arr.length; i++){
    System.out.print(" "+arr_original[i]);
}
    }
    void p8(){
        int[] arr = {19,2,3,7,1,0,5,11,16,17};
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }   
            }
            
        }
        int max =arr[0]; //0 //2
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(max < arr[i]){ // 0 < 0 0 < 1 // 1 < 2
                    max = arr[i];
                }
            }
        }
        System.out.println(max);
        
        
        
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(" "+arr[i]);
        // }
        // System.out.println("Minimum value = "+arr[0]);
        // System.out.println("Maximum value = "+arr[arr.length-2]);
    }
    void p9(){
        //int arr[] = new int[7];
        int[] arr = {5, 2, 8, 1, 9,5,2,8,9};
        for (int i = 0; i < arr.length-1; i++) {  // [5,2,8,1,9]  = 5  , 0-5 = 6 -1 = 5
             for (int j = i + 1; j < arr.length; j++) {
                  if (arr[i] < arr[j]) {  // 5 < 2  // 5 < 8 
                    int temp = arr[i]; // 5
                    arr[i] = arr[j];  //  [8,2,8,1,9]
                    arr[j] = temp; // [8,2,5,1,9]
        } 
    }
} 
for(int i = 0; i < arr.length; i++) {
    System.out.print(arr[i] + " ");
}
    }
    
    
    
    
    
}
public class Main{
    public static void main(String[] args) {
        Program obj = new Program();
        
        int n =5;
        for(int i=0;i<n;i++){
            
            for(int j=1;j<n+1;j++){
                //System.out.print(i + j+ " ");
                if(i==j){
                    continue;
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
