import java.util.Scanner;
public class projectTestTicTacToe
{
   public static void main (String [] args)
   {
   
      char a= identifyPlayer(2);
      
      System.out.println(a);
      
      a=identifyPlayer(5);
      
      System.out.println(a);
      
      System.out.println();
      
      
      playerSquare('X');
              
      playerSquare('O');
         
     System.out.println();

      
      getRowCol(3);
      
      getRowCol(7);
     
    }
    
    
   ////////////// creating new methods...................................................................
   
   public static char identifyPlayer(int i)
   {
          char player = ' ';                                                                                         
         if (i % 2 == 0)
                player = 'X';
            else
                player = 'O';
           
        return player;
   }
   public static void playerSquare(char p)
   {
            if (p == 'X')
                System.out.println("X - Which square? [1-9] ");
            else
                System.out.println("O - Which square? [1-9] ");
   }
   public static void getRowCol(int n)
   {
      int rem = n % 3;
        int r, c;
        if (rem == 0)
        {
            c = 2;
            r = n/3 - 1;
        }
        else if (rem == 2)
        {
            c = 1;
            r = n/3;
        }
        else
        {
            c = 0;
            r = n/3;
        }
        
        System.out.println("Row: " + r);
        
        System.out.println("Column: " + c);
   }
}