/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam;

/**
 *
 * @author Guest
 */
public class ExamTest {
    
     public static void main(String[] args) {
        // TODO code application logic here
        String name="Sharon";
        double height=1.0;
        double weight=60.5;
        
        
         for (double count=0.0;count<3.0;count++){
     
             weight++;
             height++;
             if(getBMI(weight, height)>25.0){
               System.out.println(getBMI(weight, height)+" is overweight");   
             }    
                 
            
             if(getBMI(weight, height)<24.9){
              System.out.println(getBMI(weight, height)+" is healthy"); 
             
             }   
             
                 
             if(getBMI(weight, height)<18.0){
              System.out.println(getBMI(weight, height)+" is underweight"); 
              
             
             } 
             
                 
             }
        
   
       
}
    
    public static double getBMI(double w, double h){
        double bmi = w/h;
        
        return bmi;
    }
    
           
            
    
    
    
    
}      

      
    






