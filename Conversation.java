import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;


//java string documentation - search for certain substrings for loop 
// inputting num of rounds rounds is for chat box to respond for num of rounds 
// math.random 

class Conversation {
  public static void main(String[] arguments) {
    // setting up transcript
    ArrayList <String> transcript = new ArrayList<>();

    
    
    Scanner input = new Scanner(System.in);
   
    String howManyRounds = "Welcome to ChatBot! How many rounds do you want to go?";
    System.out.println(howManyRounds);
    transcript.add(howManyRounds); 
    int numOfRounds = input.nextInt();
    String rounds = String.valueOf(numOfRounds);
    transcript.add(rounds); 

    String question = "Hi, what's on your mind?";
    String answer = input.nextLine();
    transcript.add(answer);
    System.out.println(question);
    transcript.add(question);
    
    
    
    int iterator = 0;

    
    
    // int r = 0; 
    String chat = "";
    transcript.add(chat);
    
   for (int a=0; a < numOfRounds; a++){
    
    String answer2 = input.nextLine();
    
    String[] split = answer2.split(" ");
    String[] mirror = {"I", "me", "you", "my", "your", "am", "are"};
    String[] replace = {"you", "you", "me", "your", "my", "are", "am"};
    
    // 
      for (int b=0; b < split.length; b++){
        String currentWord = "";
      for (int c=0; c < mirror.length; c++){
        if (split[b].equalsIgnoreCase(mirror[c])){
            iterator++;
            currentWord = replace[c];
          }
        }
        if (currentWord.equals("")){
          chat += split[b] + " ";
        } else {
          chat += currentWord + " "; 
        }
      
      if (iterator > 0) {
        System.out.println(chat); 
        transcript.add(chat); 
      }
      if (iterator <= 0){
        String[] canned = {"Mhmm.", "Sounds good!", "That's so interesting.", "Tell me more.", "Wow!"};
        Random random = new Random();
        int randomIndex = random.nextInt(canned.length);
        String randomElement = canned[randomIndex];
        System.out.println(randomElement);
        transcript.add(randomElement);

    }
    
  }
    
            
    }
    input.close();
    
    
  
  System.out.println("Thanks for chatting! Have a great day!");
          System.out.println("Transcript: ");
          for (int y =0; y < transcript.size(); y++){
            String finalTranscript = " " + transcript.get(y);
            System.out.print(finalTranscript);}
  
   }
    
  
    // input.close();
    // input1.close();
    // System.out.println(sentence);
    //   if (response.contains("I")){

    // }
   
  
  // input.close();
  // input1.close();
  // System.out.print("Thanks for chatting! Have a great day!");
  //         System.out.print("Transcript: ");
  //         for (int y =0; y < transcript.size(); y++){
  //           String finalTranscript = " " + transcript.get(y);
  //           System.out.print(finalTranscript);}
  //         }
  
  }


    
    
    
     




     


          // Random random = new Random(); 
          // int int_random = random.nextInt(5);
          // String response = cannedResponses.get(int_random);
          // String response = cannedResponses[random.nextInt()];
          // int x = random.nextInt(cannedResponses.length);
          // chat = " " + response;
          // iterator+=1;
    //       }
    //       r+=1;
      
    
     

    //     if(r==numOfRounds){
          
    //         input.close();
    //         input2.close();
         

          

    //     }

    //   }
    // }

   
  
    // }

    
  




      
      
  