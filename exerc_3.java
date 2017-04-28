import java.util.Scanner;

/* Increment and decrement Operators*/

public class exerc_3 {
	public static void main(String args[]){
	
  int tuna = 5;
  int bass = 18;
  
//-----I can use the Increment operator in two ways:-------
  
/*1*/  

  ++tuna;
  System.out.println(tuna);
 
/*2*/ 
 
  System.out.println(++tuna);
  
//-----I can use the Decrement operator in two ways:-------
  
/*1*/  

  --tuna;
  System.out.println(tuna);
 
/*2*/ 
 
  System.out.println(--tuna);
  
//-------Incrementing by addin directly-----------

  tuna = tuna + 5;
  System.out.println(tuna);

  tuna += 5;
  System.out.println(tuna);

  
  }

}
