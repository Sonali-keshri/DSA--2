public class reversedigits {
    public static int reverseDigits(int n){
        int rev = 0;
        
        while(n > 0){
            
            rev = rev * 10 + n % 10;
            n = n / 10 ;
          
        }
        return rev;
    }
    public static void main(String[] args) {
        int n = 1345;
        System.out.println(reverseDigits(n));

      
    }
}
