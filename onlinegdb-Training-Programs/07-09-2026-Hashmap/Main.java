import java.util.*;
/*
class programs{
    void p1(){
        HashMap<String,Integer> map1 = new HashMap<>();
	    HashMap<Float,Integer> map2 = new HashMap<>();
	    HashMap<Character,Integer> map3 = new HashMap<>();
	    map1.put("Apple" , 9900);
	    map2.put(12.59f , 3495);
	    map3.put('a' , 97);
	    System.out.println(map1);
	    System.out.println(map2);
	    System.out.println(map3);
    }
    void OcurenceOfCharecter_UsingHashmap(){
        HashMap<Character,Integer> map = new HashMap<>();
	    String str = "Helloo";
	    for(int i=0;i<str.length();i++){
	        int count=0;
	        for(int j=0;j<str.length();j++){
	            if(str.charAt(i) == str.charAt(j)){
	                count++;
	            }
	        }
	        map.put(str.charAt(i) , count);
	    }
	    System.out.println(map);
    }
    void ocurence2(){
        HashMap<Character,Integer> map = new HashMap<>();
	    Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int[] count = new int[26];
		for(int i=0;i<str.length();i++){
		    int val = str.charAt(i) - 97;
		    count[val]++;
		}
		System.out.println();
		for(int i=0;i<26;i++){
		    if(count[i] >0){
		    char val = (char)(i+97);
		    map.put(val , count[i]);
		    }
		}


	    System.out.println(map);
    }
}
*/
public class Main
{
	public static void main(String[] args) {
		HashMap<Character, Integer> map = new HashMap<>();
		String str = "Helloo";

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			if (map.containsKey(ch)) {
				int val = map.get(ch);
				map.put(ch, val + 1);
			} else {
				map.put(ch, 1);
			}
		}
		for(int i=0;i<str.length();i++){
		    System.out.println(str.charAt(i) + " = " + map.get(str.charAt(i)));
		    
		}
		
	}
}