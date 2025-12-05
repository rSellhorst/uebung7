package h3;

public class H3_main {
     
	
     public static void main(String[]args) {
      Mensch mneu=new Mensch();
      mneu.setAlter();
      
	  System.out.println(mneu.getName()+ " ist " + mneu.getGebJahr()+ " geboren und "+ mneu.getAlter()+" alt.");
	  
     }
}
