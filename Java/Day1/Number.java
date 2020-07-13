public class Number{

    public static void main(String []args){
       DisplayMatrice();
    }

    public static void DisplayMatrice(){
        for(int i = 1; i <= 50; i++){
            System.out.print(i + "\t");
            if(i%10 == 0){
                System.out.print("\n");
            }
        }
    }

}