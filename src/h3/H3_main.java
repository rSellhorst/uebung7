package h3;

public class H3_main {
     
	
     public static void main(String[]args) {
      Mensch m=new Mensch();
      m.setAlter();
      
	  System.out.println(m.getName()+ " ist " + m.getGebJahr()+ " geboren und "+ m.getAlter()+" alt.");
	  
     }
}
