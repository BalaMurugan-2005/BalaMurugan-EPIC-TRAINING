import java.util.*;
class Hi{
    void p1(){
        Scanner in = new Scanner(System.in);
	    long size = 5;
		long[] arr = {5,5,5,5,5};
		long[] sum_arr = new long[5];
		
		for(int i=0; i<arr.length;i++){
		    long sum =0;
		    long greater = 0;
		    long min = 0;
		    for(int j=0;j<arr.length;j++){
		        if(i == j) continue;
		        //System.out.print(" "+arr[j] );
		        sum +=arr[j];
		    }
		    sum_arr[i] = sum;
		    System.out.println(sum);
		}
		long max =sum_arr[0];
		long min =sum_arr[0];
	    
		for(int i = 0; i<arr.length; i++){
		    
		    if(max < sum_arr[i]){
		        max = sum_arr[i];
		    }
		    
		}
		for(int i=1;i<sum_arr.length;i++){
	        if(sum_arr[i] < min){
		        min = sum_arr[i];
		    }
	    }
		
		System.out.print(min+" ");
		System.out.print(max);
    }
    void p2(){
        int size = 0;
		int[] arr = {4,4,1,1,3};
		int max = arr[0];
	
		for(int i=0;i<arr.length-1;i++){
		    if(max < arr[i]){
		        max = arr[i];
		    }
		}
		int count =0;
		for(int num : arr){
		    if(num == max){
		    count++;
		    }
		}
		System.out.println(count);
    }
    void p3(){
        String time = "12:45:54PM";
	    
	    int reverse=0;
	    String num = time.substring(0,2);
	    //System.out.println(num);
	     int digit = Integer.parseInt(num);
	   //  if(time.)
	     //System.out.println(digit+12);
	     
	   String AM_or_PM = time.substring(8,10);
	   //System.out.println(AM_or_PM);
	   
	   if(AM_or_PM.equals("PM")){
	       if(digit == 12){
	           System.out.println(digit+":"+time.substring(3,8));
	           
	       }
	       else{
	       System.out.println(digit+12+":"+time.substring(3,8));
	       }
	   }
	   if(AM_or_PM.equals("AM")){
	       if(digit == 12){
	            System.out.println( Math.abs(digit-12)+"0:"+time.substring(3,8));
	       }
	       else if (digit < 12){
	           System.out.println(time.substring(0,8));
	       } 
	       else{
	       System.out.println( "0" + Math.abs(digit-12)+":"+time.substring(3,8));
	       }
	       
	   }
	    
    }
    void p4(){
        Scanner in= new Scanner(System.in);
        int[] a=new int[3];
        int[] b =new int[3];
        
        for(int i=0;i<a.length;i++){
            a[i] = in.nextInt();
            
        }
        for(int i=0;i<b.length;i++){
            b[i] =in.nextInt();
        }
        int alice =0;//1
        int bob =0;
        for(int i=0;i<a.length;i++){// 0
            //System.out.print(a[i]+ " " +b[i]);
            if(a[i]  > b[i]){ // 7 > 10
                alice += 1;
            }
            
            if(a[i] < b[i]){
                bob+=1;
            }
            
           
        }
        System.out.println(alice + " "+ bob);
    }
}
public class Main
{
	public static void main(String[] args) {
	   
	}
}
