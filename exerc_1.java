import java.util.Scanner:
  class exerc_1{
    
    /*This tutorial we do a simple addition calculator using values that the user give to us*/
    
    public static void main (String args[]){
      
      Scanner entrada = new Scanner(System.in);

//---------------Variable declarations-------------
      
      double fnum, snum, answer;
      
//---------------Data processing-------------------
      
      System.out.println("Enter first num: ");
      fnum = entrada.nextDouble();
      
      System.out.println("Enter second num: ");
      snum = entrada.nextDouble();
      
      answer = fnum + snum;
      
//---------------Data output------------------------
      
      System.out.println(answer);
      
    }// main mode end
    
  }//program end
