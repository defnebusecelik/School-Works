import java.util.Scanner;
import java.util.Random;
class FirstQuestion {
    //defnebuseçelik
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Random random=new Random();
        
        System.out.print("Dizinin eleman sayisini giriniz: ");
        int len=scan.nextInt();
        int[] randomArray=new int[len];
        System.out.println("Olusan Dizi:{ ");
        for(int i=0; i<len; i++){
            randomArray[i]=random.nextInt(100);
            if (i!=(len-1))
                System.out.print(randomArray[i]+", ");
            else 
                System.out.print(randomArray[i]);
        }
        System.out.print("}");
        
        for(int i=0; i<len; i++) {  
           for(int j=i+1; j<len; j++) {  
               if(randomArray[i] > randomArray[j]){  
                   int temp = randomArray[i];  
                   randomArray[i] = randomArray[j];  
                   randomArray[j] = temp;  
               }  
           }  
       } 
        System.out.println("\nSiralanmis Dizi : { ");  
        for(int i=0; i<len; i++)  {  
            if(i!=(len-1))
                System.out.print(randomArray[i]+ ", ");
            else
                System.out.print(randomArray[i]);
       }
       System.out.print("}");
       
       System.out.println("En kucuk kacinci elemani sildirmek istiyorsunuz? : ");
       int deleteNumber=scan.nextInt();
       int[] newArray=new int[len-1];
       int j = 0;
       for (int i = 0; i < len; i++) {
            if (i != (deleteNumber-1)) {
                newArray[j] = randomArray[i];
                j++;
            }
        }
        System.out.println("Degistirilen Dizi:{ ");
        for (int i = 0; i < len - 1; i++) {
            if(i!=(len-2))
                System.out.print(newArray[i] + ", ");
            else
                System.out.print(newArray[i]);
        }
        System.out.print("}");
    }
}
