package domain;
import java.util.Arrays;
public class HelloWorld {

    public static void main(String[] args) {
        
        System.out.println("Gacha!");
        
        int numList[]=new int[6];
        int rep=0;
        int maxIndex=0;
        int condition=1; // A val for checking number overlapping.
        while(rep<6){
            
            int num=(int)(Math.random()* 100 ); //get a random number.
            
            if(num <=45 && num >=1){ // check numer range.
                for(int i=0; i<maxIndex;i++){
                    if(numList[i] == num){ //check number overlap between array vals and number;
                        condition =0; // if there is a overlapping change condition.
                        break;
                
                    }
                }
                if(condition ==1){
                    numList[maxIndex]=num;
                    maxIndex++;
                    rep++;
                    condition =1;
                }
    
            }
        }
        
        System.out.println(Arrays.toString(numList));

    }
