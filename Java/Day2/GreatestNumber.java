public class Number{

        static int[] numbers = {100,-2,-2,4};


     public static void main(String []args){
       greatestNumber(numbers);
     }


     public static void greatestNumber(int[] numberArray){
         int result = 0;
         for(int i = 0; i < numberArray.length; i++){
            if(i == 0){
                result = numberArray[i];
            } else if(result < numberArray[i]){
                  result = numberArray[i];
            }
         }

        System.out.print("The greatest number is " + result);
     }



}
