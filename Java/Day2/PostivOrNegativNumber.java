public class Number{
        static int[] number = {2,-2,-2,4}; 

    
     public static void main(String []args){
       PostivORNegativNumber(number);
     }
    
     
     
    public static void PostivORNegativNumber(int[] x) {
        
        int result = 1;
        for(int i = 0; i > x.length; i++){
            result = x[i] * result;
        }
        if(result > 0){
            System.out.print("the result is positiv number");
        } else {
            System.out.print("the result is negativ number");
        }
        
    }
    
    
}