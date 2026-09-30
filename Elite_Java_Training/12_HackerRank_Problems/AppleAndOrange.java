import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        //Sam House Location Start -> s , end -> t
        int s = in.nextInt(); 
        int t = in.nextInt();
        
        // Location of Apple tree and orange tree !
        int a = in.nextInt();
        int b =in.nextInt();
        
        
        int size_ap = in.nextInt();
        int size_or = in.nextInt();
        
        int[] apples =  new int[size_ap];
        int[] oranges = new int[size_or];
        
        for(int i=0;i<size_ap;i++){
            apples[i] = in.nextInt();
        }
        for(int i=0;i<size_or;i++){
            oranges[i] = in.nextInt();
        }
        // int[] result_apple = new int[size_ap];
        // int[] result_orange = new int[size_or];
        
        // for(int i=0;i<size_ap;i++){
        //     result_apple[i] = a+apples[i];
        // }
        // for(int i=0;i<size_or;i++){
        //     result_orange[i] = b+oranges[i];
        // }
        
        
        int count_apples=0;
        int count_oranges =0;
        
        
        for(int i=0;i<size_ap;i++){
            int position = a+apples[i];
            if(position >=s && position <=t){
                count_apples++;
                
            }
        }
        for(int i=0;i<size_or;i++){
            int position =b+oranges[i];
            
            if(position >=s && position <=t){
                count_oranges++;
                
            }
        }
        
        System.out.println(count_apples);
        System.out.println(count_oranges);
    }
}
