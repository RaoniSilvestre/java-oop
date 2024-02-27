import java.util.Vector;
import java.util.ArrayList;
import java.util.Stack;


public class Main {
  public static void main(String[] args) {
    String palavra = "anaaaaaaaa";
    
    int j = palavra.length() - 1;
    int k = 0;
    for(int i = 0; i < palavra.length()-1; i++){
      
      if( palavra.charAt(i) == palavra.charAt(j) ){
        
        j--;
      } else { k = 1; }

    }
    if (k == 0) {System.out.println("Palindrome!!");} else {System.out.println("Not a palindrome!!");}

   }    


  public static void imprimirCarrin(String[] carrinho, int tam){
    if(10 == tam){
      System.out.println(carrinho[tam]);
      imprimirCarrin(carrinho, tam + 1);
    }
  } 
  
  public static void carrinhoDeCompras(){
    String[] carrinho = new String[10];
  
  carrinho[0] = "Banana";
  carrinho[1] = "Maça";
  
  for(int i = 2; i < 10; i++){
    carrinho[i] = "Coca Cola 2.5L";
  }
  imprimirCarrin(carrinho, 0);

  }

  public static void VetorExercicio1() {
	  Vector<Integer> v1 = new Vector<>();
	  Vector<Integer> v2 = new Vector<>();

	  v1.add(1);
	  v1.add(3);
	  v1.add(5);

	  v2.add(2);
	  v2.add(4);
	  v2.add(6);

	  Integer result = 0;

	  for(Integer i = 0; i < 3; i++) {
		  result += (v1.get(i) * v2.get(i));	
	  }
	  System.out.println(result);	
  }
}



