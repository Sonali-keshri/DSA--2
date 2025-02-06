public class PalindromeString {

    public static Boolean palindromeString(String str){
        // String rev = new StringBuilder(str).reverse().toString();
        int n = str.length();
        for(int i = 0; i<n/2 ; i++){
            if(str.charAt(i) != str.charAt(n-i-1)){
                return  false;
            }
        }
        
        return true;    
    }

    public static void main(String[] args) {
        String str = "eye";
        System.out.println(palindromeString(str));
    }
}
