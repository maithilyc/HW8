import java.util.*;  
class JavaExample{  
   public static void main(String args[]){  

	  ArrayList alist=new ArrayList<String>();  
      alist.add("Maithily");
      alist.add("Laya");
      alist.add("Victor");
      alist.add("Troy");
      alist.add("Ketryk");
      alist.add("Carlie");
  
      //displaying elements
      System.out.println(alist);
  
      //Adding "Steve" at the fourth position
      alist.add(3, "Happy");
  
      //displaying elements
      System.out.println(alist);
   }

private void add(int i, String string) {
	// TODO Auto-generated method stub
	
}  
}
