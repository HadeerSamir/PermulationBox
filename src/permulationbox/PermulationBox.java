
package permulationbox;

import java.util.Scanner;


public class PermulationBox {
 
    
    public static void permulationTable(int[]permulationTable,String formatedInput){
        
        String output = "";
       
        for(int i=0;i<permulationTable.length;i++){
            output+=formatedInput.charAt(permulationTable[i]-1);
        }
        
        String hexaOutput="";
      
        
          for(int i=0;i<output.length();i=i+4){
              
           String tmp=output.substring(i, i+4);
               
           int decimal = Integer.parseInt(tmp, 2);
           hexaOutput = hexaOutput+ Integer.toHexString(decimal);
        
  }
        System.out.println(hexaOutput.toUpperCase());    
                 
    }

   
    public static void main(String[] args) {
   
        
        
        
        Scanner scan=new Scanner (System.in);
        int permulationBoxSize=scan.nextInt();
        
        int []permulationTable=new int[permulationBoxSize];
        
        for(int i=0;i<permulationBoxSize;i++){
            int decimalValue=Integer.parseInt(scan.next());
            permulationTable[i]=decimalValue;  //decimalNumbersOfPermulationTable
        }

    
        int sizeOfTheInput=scan.nextInt();
        String input=scan.next();
        
       String formatedInput="";
       String binary="";
      for(int i=0;i<input.length();i++){
          switch(input.charAt(i)){
              
              
            case '0':
            binary="0000";
            break;
            
            case '1':
            binary="0001";
            break;
            
            case '2':
            binary="0010";
            break;
            
            case '3':
            binary="0011";
            break;
            
            case '4':
            binary="0100";
            break;
            
            case '5':
            binary="0101";
            break;
            
            case '6':
            binary="0110";
            break;
            
            case '7':
            binary="0111";
            break;
            
            case '8':
            binary="1000";
            break;
            
            case '9':
            binary="1001";
            break;
            
            case 'A':
            binary="1010";
            break;
            
            case 'B':
            binary="1011";
            break;
            
            case 'C':
            binary="1100";
            break;
            
            case 'D':
            binary="1101";
            break;
            
            case 'E':
            binary="1100";
            break;
            
            case 'F':
            binary="1111";
            break;
              
          }
          formatedInput+=binary;
      }
        permulationTable(permulationTable,formatedInput);
        
        
      
    }
    
}

