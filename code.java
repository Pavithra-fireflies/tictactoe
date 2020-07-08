package tictactoe;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       String inp ="_________";
        int i;
        char c1 = (inp.charAt(0) == '_')?' ' :inp.charAt(0);
        char c2 = (inp.charAt(1) == '_')?' ' :inp.charAt(1);
        char c3 = (inp.charAt(2) == '_')?' ' :inp.charAt(2);
        char c4 = (inp.charAt(3) == '_')?' ' :inp.charAt(3);
        char c5 = (inp.charAt(4) == '_')?' ' :inp.charAt(4);
        char c6 = (inp.charAt(5) == '_')?' ' :inp.charAt(5);
        char c7 = (inp.charAt(6) == '_')?' ' :inp.charAt(6);
        char c8 = (inp.charAt(7) == '_')?' ' :inp.charAt(7);
        char c9 = (inp.charAt(8) == '_')?' ' :inp.charAt(8);
        System.out.println("---------");
        System.out.println("|       |");
        System.out.println("|       |");
        System.out.println("|       |");
        System.out.println("---------");
        int a = 0 , b = 0;
        String x,y;
        int k,g;
        int w=0;
        int q=0;
        while(w == 0 && q < 9) {
            System.out.print("Enter the coordinates: ");
           
            try
            {
                k = Integer.parseInt(sc.next());
                g = Integer.parseInt(sc.next());
              if (k <= 3 && g <= 3) {
                  int c = k;
                  int d = g;
                  if(c == 1 && d == 1) {
                      if (c7 == 'X' || c7 == 'O' ) {
                          System.out.println("This cell is occupied! Choose another one!");
                          a=0;
                          b=0;
                      }
                      else
                      {
                          if (q%2==0) {
                             c7 = 'X';
                          }
                          else{
                              c7 = 'O';
                          }
                         System.out.println("---------");
                         System.out.println("| "+c1+" "+c2+" "+c3+" |");
                         System.out.println("| "+c4+" "+c5+" "+c6+" |");
                         System.out.println("| "+c7+" "+c8+" "+c9+" |");
                         System.out.println("---------");
                          a=1;
                          b+=1;
                          q+=1;
                      }
                  }
                  else if(c == 1 && d == 2) {
                      if (c4 == 'X' || c4 == 'O' ) {
                          System.out.println("This cell is occupied! Choose another one!");
                          a=0;
                          b=0;
                      }
                      else
                      {
                          if (q%2==0) {
                          c4 = 'X';
                          }
                          else {
                              c4 = 'O';
                          }
                         System.out.println("---------");
                         System.out.println("| "+c1+" "+c2+" "+c3+" |");
                         System.out.println("| "+c4+" "+c5+" "+c6+" |");
                         System.out.println("| "+c7+" "+c8+" "+c9+" |");
                         System.out.println("---------");
                          a=1;
                          b=1;
                          q+=1;
                      }
                  }
                  else if(c == 1 && d == 3) {
                      if (c1 == 'X' || c1 == 'O' ) {
                          System.out.println("This cell is occupied! Choose another one!");
                          a=0;
                          b=0;
                      }
                      else
                      {
                        if (q%2==0) {
                          c1 = 'X';
                          }
                          else {
                              c1 = 'O';
                          }
                         System.out.println("---------");
                         System.out.println("| "+c1+" "+c2+" "+c3+" |");
                         System.out.println("| "+c4+" "+c5+" "+c6+" |");
                         System.out.println("| "+c7+" "+c8+" "+c9+" |");
                         System.out.println("---------");
                          a=1;
                          b=1;
                          q+=1;
                      }
                  }
                  else if(c == 2 && d == 1) {
                      if (c8 == 'X' || c8 == 'O' ) {
                          System.out.println("This cell is occupied! Choose another one!");
                          a=0;
                          b=0;
                      }
                      else
                      {
                          if (q%2==0) {
                          c8 = 'X';
                          }
                          else {
                              c8 = 'O';
                          }
                         System.out.println("---------");
                         System.out.println("| "+c1+" "+c2+" "+c3+" |");
                         System.out.println("| "+c4+" "+c5+" "+c6+" |");
                         System.out.println("| "+c7+" "+c8+" "+c9+" |");
                         System.out.println("---------");
                          a=1;
                          b=1;
                          q+=1;
                      }
                  }
                  else if(c == 2 && d == 2) {
                      if (c5 == 'X' || c5 == 'O' ) {
                          System.out.println("This cell is occupied! Choose another one!");
                          a=0;
                          b=0;
                      }
                      else
                      {
                          if (q%2==0) {
                          c5 = 'X';
                          }
                          else {
                              c5 = 'O';
                          }
                         System.out.println("---------");
                         System.out.println("| "+c1+" "+c2+" "+c3+" |");
                         System.out.println("| "+c4+" "+c5+" "+c6+" |");
                         System.out.println("| "+c7+" "+c8+" "+c9+" |");
                         System.out.println("---------");
                          a=1;
                          b=1;
                          q+=1;
                      }
                  }
                  else if(c == 2 && d == 3) {
                      if (c2 == 'X' || c2 == 'O' ) {
                          System.out.println("This cell is occupied! Choose another one!");
                          a=0;
                          b=0;
                      }
                      else
                      {
                         if (q%2==0) {
                          c2 = 'X';
                          }
                          else {
                              c2 = 'O';
                          }
                         System.out.println("---------");
                         System.out.println("| "+c1+" "+c2+" "+c3+" |");
                         System.out.println("| "+c4+" "+c5+" "+c6+" |");
                         System.out.println("| "+c7+" "+c8+" "+c9+" |");
                         System.out.println("---------");
                          a=1;
                          b=1;
                          q+=1;
                      }
                  }
                  else if(c == 3 && d == 1) {
                      if (c9 == 'X' || c9 == 'O' ) {
                          System.out.println("This cell is occupied! Choose another one!");
                          a=0;
                          b=0;
                      }
                      else
                      {
                          if (q%2==0) {
                          c9 = 'X';
                          }
                          else {
                              c9 = 'O';
                          }
                         System.out.println("---------");
                         System.out.println("| "+c1+" "+c2+" "+c3+" |");
                         System.out.println("| "+c4+" "+c5+" "+c6+" |");
                         System.out.println("| "+c7+" "+c8+" "+c9+" |");
                         System.out.println("---------");
                          a=1;
                          b=1;
                          q+=1;
                      }
                  }
                  else if(c == 3 && d == 2) {
                      if (c6 == 'X' || c6 == 'O' ) {
                          System.out.println("This cell is occupied! Choose another one!");
                          a=0;
                          b=0;
                      }
                      else
                      {
                          if (q%2==0) {
                          c6 = 'X';
                          }
                          else {
                              c6 = 'O';
                          }
                         System.out.println("---------");
                         System.out.println("| "+c1+" "+c2+" "+c3+" |");
                         System.out.println("| "+c4+" "+c5+" "+c6+" |");
                         System.out.println("| "+c7+" "+c8+" "+c9+" |");
                         System.out.println("---------");
                          a=1;
                          b=1;
                          q+=1;
                      }
                  }
                  else if(c == 3 && d == 3) {
                      if (c3 == 'X' || c3 == 'O' ) {
                          System.out.println("This cell is occupied! Choose another one!");
                          a=0;
                          b=0;
                      }
                      else
                      {
                          if (q%2==0) {
                          c3 = 'X';
                          }
                          else {
                              c3 = 'O';
                          }
                         System.out.println("---------");
                         System.out.println("| "+c1+" "+c2+" "+c3+" |");
                         System.out.println("| "+c4+" "+c5+" "+c6+" |");
                         System.out.println("| "+c7+" "+c8+" "+c9+" |");
                         System.out.println("---------");
                          a=1;
                          b=1;
                          q+=1;
                      }
                  }
                
                  if ((c1=='X' && c2=='X' && c3=='X')||(c4=='X' && c5=='X' && c6=='X')||(c7=='X' && c8=='X' && c9=='X')||(c1=='X' && c4=='X' && c7=='X')||(c2=='X' && c5=='X' && c8=='X')||(c3=='X' && c6=='X' && c9=='X')||(c1=='X' && c5=='X' && c9=='X')||(c3=='X' && c5=='X' && c7=='X')) {
                            
                            w=1;
                            break;
            
                 }
                   else if((c1=='O' && c2=='O' && c3=='O')||(c4=='O' && c5=='O' && c6=='O')||(c7=='O' && c8=='O' && c9=='O')||(c1=='O' && c4=='O' && c7=='O')||(c2=='O' && c5=='O' && c8=='O')||(c3=='O' && c6=='O' && c9=='O')||(c1=='O' && c5=='O' && c9=='O')||(c3=='O' && c5=='O' && c7=='O')) {
                     
                      w=2;
                      
                      break;
                 }
                 
                
                }
              else
              {
                  System.out.println("Coordinates should be from 1 to 3!");
              }
            }
            catch(Exception e)
            {
                System.out.println("You should enter numbers!");
                a=0;
                b=0;
            }
            
        }
        /**int xcnt=0,ocnt = 0;
        for (i = 0 ; i < 9; i++) {
            if (inp.charAt(i) == 'X'){
                xcnt+=1;
            }
            else if(inp.charAt(i) == 'O') {
                ocnt +=1;
            }
        }
        if(((inp.charAt(0)=='X' && inp.charAt(1)=='X' && inp.charAt(2)=='X')||(inp.charAt(3)=='X' && inp.charAt(4)=='X' && inp.charAt(5)=='X')||(inp.charAt(6)=='X' && inp.charAt(7)=='X' && inp.charAt(8)=='X')||(inp.charAt(0)=='X' && inp.charAt(3)=='X' && inp.charAt(6)=='X')||(inp.charAt(1)=='X' && inp.charAt(4)=='X' && inp.charAt(7)=='X')||(inp.charAt(2)=='X' && inp.charAt(5)=='X' && inp.charAt(8)=='X')||(inp.charAt(0)=='X' && inp.charAt(4)=='X' && inp.charAt(8)=='X')||(inp.charAt(2)=='X' && inp.charAt(4)=='X' && inp.charAt(6)=='X'))&&((inp.charAt(0)=='O' && inp.charAt(1)=='O' && inp.charAt(2)=='O')||(inp.charAt(3)=='O' && inp.charAt(4)=='O' && inp.charAt(5)=='O')||(inp.charAt(6)=='O' && inp.charAt(7)=='O' && inp.charAt(8)=='O')||(inp.charAt(0)=='O' && inp.charAt(3)=='O' && inp.charAt(6)=='O')||(inp.charAt(1)=='O' && inp.charAt(4)=='O' && inp.charAt(7)=='O')||(inp.charAt(2)=='O' && inp.charAt(5)=='O' && inp.charAt(8)=='O')||(inp.charAt(0)=='O' && inp.charAt(4)=='O' && inp.charAt(8)=='O')||(inp.charAt(2)=='O' && inp.charAt(4)=='O' && inp.charAt(6)=='O'))) {
            System.out.println("Impossible");
        }
        else if ((inp.charAt(0)=='X' && inp.charAt(1)=='X' && inp.charAt(2)=='X')||(inp.charAt(3)=='X' && inp.charAt(4)=='X' && inp.charAt(5)=='X')||(inp.charAt(6)=='X' && inp.charAt(7)=='X' && inp.charAt(8)=='X')||(inp.charAt(0)=='X' && inp.charAt(3)=='X' && inp.charAt(6)=='X')||(inp.charAt(1)=='X' && inp.charAt(4)=='X' && inp.charAt(7)=='X')||(inp.charAt(2)=='X' && inp.charAt(5)=='X' && inp.charAt(8)=='X')||(inp.charAt(0)=='X' && inp.charAt(4)=='X' && inp.charAt(8)=='X')||(inp.charAt(2)=='X' && inp.charAt(4)=='X' && inp.charAt(6)=='X')) {
            System.out.println("X wins");
        }
        else if((inp.charAt(0)=='O' && inp.charAt(1)=='O' && inp.charAt(2)=='O')||(inp.charAt(3)=='O' && inp.charAt(4)=='O' && inp.charAt(5)=='O')||(inp.charAt(6)=='O' && inp.charAt(7)=='O' && inp.charAt(8)=='O')||(inp.charAt(0)=='O' && inp.charAt(3)=='O' && inp.charAt(6)=='O')||(inp.charAt(1)=='O' && inp.charAt(4)=='O' && inp.charAt(7)=='O')||(inp.charAt(2)=='O' && inp.charAt(5)=='O' && inp.charAt(8)=='O')||(inp.charAt(0)=='O' && inp.charAt(4)=='O' && inp.charAt(8)=='O')||(inp.charAt(2)=='O' && inp.charAt(4)=='O' && inp.charAt(6)=='O')) {
            System.out.println("O wins");
        }
        else if(inp.charAt(0)!='_' && inp.charAt(1)!='_' && inp.charAt(2)!='_' && inp.charAt(3)!='_' && inp.charAt(4)!='_' && inp.charAt(5)!='_' && inp.charAt(6)!='_' && inp.charAt(7)!='_' && inp.charAt(8)!='_' ) {
            System.out.println("Draw");
        }
        else if(xcnt - ocnt >= 2 || ocnt - xcnt >=2) {
            System.out.println("Impossible");
        }
        else {
            System.out.println("Game not finished");
        }**/
        if ( w==1) {
            System.out.println("X wins");
        }
        else if(w==2) {
            System.out.println("O wins");
        }
        else {
            System.out.println("Draw");
        }

    }
}
