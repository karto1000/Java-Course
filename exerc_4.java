import java.util.Scanner;

  public class exerc_4{
  
  /* In this exercise we are working with de Switch Statement*/
  
    public static void main (String args[]){
      Scanner entrada = new Scanner(System.in);
      
//---------------Variables DEclaration--------------      
      int age;

//--------------Data imput--------------------------      
      
      System.out.println("Enter an integrer: ");
      age = entrada.nextInt();
      
//---------------Data processing--------------------      
      switch(age){
        case 1:
          System.out.println("You can fly");
          break;
        case 2:
          System.out.println("You can talk");
          break;
        case 3: 
          System.out.println("You can get trouble");
          break;
        default:
          System.out.println("I don't know how old you are");
     
      
      } 
    
    }
  
  }
