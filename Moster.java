import java.util.*;

public class Moster{
  
  public static String firstResponse;
  public static String friendName;
  public static String friendHobby;
  public static Scanner sc = new Scanner(System.in);
  
  public static void main(String args[]) {
   System.out.println("Hello. I am Moster. Would you like to be friends? Yes, or no?");
   firstResponse = sc.next().toString();
   if ( firstResponse == "Yes" || firstResponse == "yes" ) {
    firstResponse();
   }
   else if (s == "No" || s == "no") {
    secondResponse(); 
   }
   else {
    repeatFirstResponse(); 
   }
  }
  
  public static void repeatFirstResponse() {
    System.out.println("Sorry, I can't quite understand. Is that a yes, or a no?");
    String s = sc.next().toString();
  }
  
  public static void firstResponse() {
   System.out.println("That makes me so happy... thank you.");
   System.out.println("Please tell me your name?");
   friendName = sc.next().toString();
   afterName();
  }
  
  public static void secondResponse() {
   System.out.println("Really? Well... okay. If you insist...");
  }
  
  public static void afterName() {
   System.out.println(friendName + "? What a beautiful name... thank you.");
   System.out.println(friendName + ", please tell me your favorite thing to do in your free time.");
   friendHobby = sc.next().toString();
   //afterHobby();
  }
  
  
}