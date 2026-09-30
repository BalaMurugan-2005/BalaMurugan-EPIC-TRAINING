import java.util.*;
class Program{
    
}
public class Main
{
	public static void main(String[] args) {
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
        System.out.println(bob+" "+alice);
	}
}
