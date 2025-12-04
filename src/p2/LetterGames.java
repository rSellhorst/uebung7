package p2;

public class LetterGames {
	static String keyString="FRANZ JAGT IM KOMPLETT VERWAHRLOSTEN TAXI QUER DURCH BAYERN!";
    static String word=("");
    static int[] a= {4,5,6};
   
   
    public void setWord(int[] a) {
    	for (int i=0; i<a.length-1;i++) {
			 word += keyString.charAt(a[i]); 
			
    	}
    }
    public void findCode(String s) {
    	a=new int [s.length()];
        for(int i=0; i<s.length();i++) {
    	  if(keyString.contains(s.charAt(i)+"")){
    		a[i]=keyString.indexOf(s.charAt(i));
    	   }else { 
    		System.out.println("Der char ist nicht übersetzbar");
    	}
       }
     }
}