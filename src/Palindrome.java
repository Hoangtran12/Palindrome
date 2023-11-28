import java.util.Scanner;

public class Palindrome{

    public static boolean palindrome(String str){
        if(str.length() <= 1)
            return true;
        if(str.charAt(0) == str.charAt((str.length()-1))){
            return palindrome(str.substring(1,str.length()-1));
        }
        else
            return false;
    }

    public static void main(String args[]){
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the string");
        String str= console.nextLine();
        String nstr="";
    for(int i=0;i<str.length();i++){
        if(Character.isAlphabetic(str.charAt(i)))
            nstr+= Character.toLowerCase(str.charAt(i));
    }
    if(palindrome(nstr))
        System.out.println("Palindrome String");
    else
        System.out.println("Not a Palindrome String");
    }
}