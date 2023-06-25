import java.util.Random;
import java.util.*;
class guess extends number
{
  public static void Guess()
  {
      Random r=new Random();
      int num=r.nextInt(100);
      Scanner scan=new Scanner(System.in);
      System.out.println("A number is choosen between 0 to 100"+'\n'+"Guess the number in 5 tries");
      
      int trie=5;
      int i;
      for(i=0;i<trie;i++)
      {
          System.out.println("Guess a number");
          int guess=scan.nextInt();
          if(guess==num)
          {
              System.out.println("yes you hit the goal");
              break;
          }
          else if(num>guess&&i!=trie-1)
          {
              System.out.println("The number is greatre than"+guess);
          }
         else if(num<guess&&i!=trie-1)
          {
             System.out.println("the number is less than"+ guess); 
          }
          }
      if(i==trie)
      {
          System.out.println("your trieals are over");
          System.out.println("your random number is"+num);
      }
     
  }
}
  