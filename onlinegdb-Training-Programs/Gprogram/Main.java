class Program{
    void p1(){
        Scanner in = new Scanner(System.in);
	    int size = in.nextInt();
		int[] arr = new int[size];
		int target = 4;
		for(int i =0;i<arr.length; i++){
		    arr[i] = in.nextInt();
		}
		int count =0;
		for(int num : arr){
		    if(num == target){
		        System.out.print("Target Found");
		        break;
		    }
		    
		}
		
    }
    void p2(){
        int[] arr = {12,5,4,6,6,7,12,4,7,5,7};
	    
	    for(int i=0;i<arr.length;i++){
	        for(int j = i+1;j<arr.length-1;j++){
	           if(arr[i] !=arr[j] ){
	               continue;
	           }
	           System.out.print(arr[j] + " ");
	       }
	       
	   }
    }
    void p3(){
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
}
public class Main
{
    
	public static void main(String[] args) {
		
	}
}
