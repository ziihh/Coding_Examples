public class Pattern{
    

    public static void printPattern(){
        String stars = "*";
        for(int i = 0; i < 4; i++){
            System.out.print(stars + "\n");
           stars = concatStr(stars, "*");
        }
        
    }
    
    public static String concatStr(String str1, String str2){
        String concated;
       concated = str1 + str2;
       return concated;
    }
    
     public static void main(String []args){
        printPattern();

     }
}