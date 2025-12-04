package h3;

public class Mensch {
	public String name="Max";
    public int gebJahr=2000;
    public int alter=9;
    public int aktuellesJahr=2025;    //Hilfvariable
    
  
   	   public void setname( String s) {
   		  name=s;
   	   
   	   }
   	   public void setGebJahr(int i) {   //2025>gebJahr>1000
   		   gebJahr=i;
   	   }
   	   public void setAlter() {
   		   alter=aktuellesJahr-gebJahr;
   	   }
   	   public String getName() {
   		   return name;
   	   }
   	   public int getGebJahr() {
   		   return gebJahr;
   	   }
   	   public int getAlter() {
   		   return alter;
   	   }
}


