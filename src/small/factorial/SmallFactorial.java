/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package small.factorial;
import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class SmallFactorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t>0)
        {
           int n=in.nextInt();
           int fact=1;
            for(int i=n;i>=1;i--)
            {
              fact=fact*i;
            }
         System.out.println(fact);
        }
    t--;
        
    }    
  }
    

