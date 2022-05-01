package domain;
import java.util.Scanner;
public class HelloWorld {

    public static void main(String[] args) {
        
        int ans = (int)((Math.random())*100) +1;
        String tmp;
        int userAns;
        int cnt=0;
        
        while(true){
            cnt++;
            System.out.printf("Type a number: ");
            Scanner scanner = new Scanner(System.in);
            tmp= scanner.nextLine();
            userAns=Integer.parseInt(tmp);
            System.out.printf("You tried : %d\n",cnt);
            
            
            if(ans == userAns){
                System.out.println("Correct !!");
                break;
            }
            
            else if (ans > userAns){
                System.out.printf("Type bigger number than %d\n",userAns);    
                
            }
            
            else if (ans < userAns){
                System.out.printf("Type smaller number than %d\n",userAns);    
                
            }
            
            System.out.println("");
        }
    }

}
