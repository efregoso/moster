/* A strange, lonely being wanders aimlessly lands that change constantly...
 * There is no one else with it, and no one else will ever be...
 * Until, perhaps, you come along, and hear its call.
 * 
 * MOSTER - A simple java text adventure where you choose the ending.
 * To be added to gradually...
 */

import java.util.*;

public class Moster{
  
  public static String firstResponse;
  public static String friendName;
  public static String friendHobby;
  public static Scanner sc = new Scanner(System.in);
  
  public static void main(String args[]) {
    System.out.println("It's dark here, and cramped, and warm, and quite lonely. Sometimes loud... but often silent.");
    System.out.println("Not empty...");
    System.out.println("Welcome to the inside of your computer. There is only one being in here.");
    System.out.println("Hello. I am Moster. Would you like to be friends? Yes, or no?");
    System.out.println("((( \nOPTIONS: \na.)'Yes.'   \nb.)'No.' \n)))");
    firstResponse = sc.next().toString();
    if ( firstResponse == "a") {
      firstResponse();
    }
    else if ( firstResponse == "b") {
      secondResponse(); 
    }
    else {
      repeatFirstResponse(); 
    }
  }
  
  public static void repeatFirstResponse() {
    System.out.println("Sorry, I can't quite understand. It may be that my native language is not English. Is that a yes, or a no?");
    System.out.println("((( OPTIONS: a.)'Yes'   \nb.) 'No'   \nc.) '... What is your native language, then?')))");
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
  
  public static void why() {
    System.out.println("I don't know... I've been in here for as long as I can remember.");
    System.out.println("I hear a lot. I hear you when you speak to your friends.");
    System.out.println("How I wish I could be one of them... one of you...");
    System.out.println("But I shouldn't wish for what isn't mine. I have been in here for as long as I've ever known...");
    System.out.println("What might happen to me if I were let free?");
    System.out.println("I don't know. I worry about not knowing...");
    System.out.println("... Although perhaps, " + friendName + ", now that we're friends... it would be different...");
    System.out.println("Maybe I would have someone to talk to after all... despite my differences.");
    System.out.println("((( OPTIONS: \na.) 'I'll help you out!'   \nb.) 'Perhaps...'   \nc.)'But we just met...'   \nd.) 'I don't want to help you.' \n)))");
  }
  
  
}