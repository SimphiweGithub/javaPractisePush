
package javaapplication40;


public class JavaApplication40 {

   
    public static void main(String[] args) {
      booleanReturn();
      StringReturn();
      assertFalseEquals();  
    }
    
    public static boolean booleanReturn(){
    boolean decider = true;
    return decider;
    }

    public static String StringReturn() {
        String chosenString = "Name";
        return chosenString;
    }
   public static int assertFalseEquals(){
    int x = 5;
    return x;
    }
    
}
