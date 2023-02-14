import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;


class Conversation {
  public static void main(String[] arguments) {
    ArrayList <String> transcript = new ArrayList<>();
    Scanner input = new Scanner(System.in); 
    System.out.println("How many rounds will you like to do?"); 
    transcript.add("How many rounds?");
    int numOfRounds = input.nextInt();
    System.out.println("Okay, lets do " + numOfRounds + "!");
    int r = 0; 
    
   
    String round = String.valueOf(numOfRounds);
    transcript.add(round);
    System.out.println("Hi there! What's on your mind?"); 
    transcript.add("Hi there! What's on your mind?");
    

    
    while(true){
      Scanner input2 = new Scanner(System.in);
      String chat = " ";
      transcript.add(chat);
    
      String answer = input2.nextLine();
      transcript.add(answer);
      

      String[] sentence = answer.split(" ");
      int iterator = 0;
      if (iterator == 0){
          ArrayList <String> cannedResponses = new ArrayList<String>();
          cannedResponses.add("Mhmm.");
          cannedResponses.add("Sounds good!");
          cannedResponses.add("That's so interesting.");
          cannedResponses.add("Tell me more.");
          cannedResponses.add("Wow!");


          Random random = new Random(); 
          int int_random = random.nextInt(5);
          String response = cannedResponses.get(int_random);
          // String response = cannedResponses[random.nextInt()];
          // int x = random.nextInt(cannedResponses.length);
          chat = " " + response;
          iterator+=1;
      
    
      for (int i=0; i < sentence.length; i++){
        if (sentence[i].equals("I")){
        sentence[i] = "you"; 
        chat = chat + sentence[i] + " ";
        iterator+=1;
        }
        else if (sentence[i].equals("me")){
        sentence[i] = "you";
        chat = chat + sentence[i] + " "; 
        iterator+=1;
        }
        else if (sentence[i].equals("am")){
        sentence[i] = "are"; 
        chat = chat + sentence[i] + " "; 
        iterator+=1;
        }
        else if (sentence[i].equals("you")){
          sentence[i] = "I";
          chat = chat + sentence[i]+ " "; 
          iterator+=1;
        }
        else if (sentence[i].equals("my")){
          sentence[i]="your";
          chat = chat + sentence[i] + " ";
          iterator+=1;
        }
        else if (sentence[i].equals("your")) {
          sentence[i]="my";
          chat = chat + sentence[i] + " ";
          iterator+=1;
        }
        else{
          chat+=sentence[i]+" ";
        }

        if(r==numOfRounds){
          System.out.print("Thanks for chatting! Have a great day!");
          System.out.print("Transcript: ");
          for (int y =0; y < transcript.size(); y++){
            String finalTranscript = " " + transcript.get(y);
            System.out.print(finalTranscript);}
            input.close();
            input2.close();
          break;

          

        }

      }
    }

   
    // r +=1; 
    // System.out.print(chat);
    // transcript.add(chat);

    // if(r==numOfRounds){
    //   System.out.print("Thanks for chatting! Have a great day!");
    //   System.out.print("Transcript: ");
    //   for (int x =0; x < transcript.size(); x++){
    //     String finalTranscript = " " + transcript.get(x);
    //     System.out.print(finalTranscript);}
    //   input.close(); 
      
    //   break;
    }

    }
  }




      
      
  