//  ///////////////////////////////////////////////////////////////////
//  ALFRED BOT MAIN CLASS
//  By: Virgilio D. Cabading Jr.    Created at: November 28, 2021 0900
//  ///////////////////////////////////////////////////////////////////

public class AlfredBot {
    //  //// MAIN EXECUTABLE SECTION /////////////////////////////////
    public static void main(String[] args) {

        // **** Variable Declaration Section *************************
        AlfredQuotes alfredBot = new AlfredQuotes();                    // New instance of AlfredQuotes
        
        String testGreeting = alfredBot.basicGreeting();                // Make strings out of Alfred Bot Greetings
        String testGuestGreeting = alfredBot.guestGreeting("Mary Jane");
        String testDateAnnouncement = alfredBot.dateAnnouncement();
                                                                        // Test the Alfred Quotes RespondBeforeAlexis methods
        String alexisTest = alfredBot.respondBeforeAlexis("Alexis! Play some low-fi beats.");
        String alfredTest = alfredBot.respondBeforeAlexis("I can't find my yo-yo. Maybe Alfred will know where it is.");
        String notRelevantTest = alfredBot.respondBeforeAlexis("Maybe that's what Batman is about. Not winning. But failing.");
        
        // **** Print the Greetings **********************************
        System.out.println("/////////////////////////////////////////////////////");
        System.out.println("ALFRED BOT");
        System.out.println("");

        System.out.println("*****************************************************");
        System.out.println("Basic Greeting:");
        System.out.println(testGreeting);
        System.out.println("");

        System.out.println("*****************************************************");
        System.out.println("Guest Greeting: Mary Jane");
        System.out.println(testGuestGreeting);
        System.out.println("");
        
        // Uncomment these one at a time as you implement each method.
        // System.out.println(testGuestGreeting);
        // System.out.println(testDateAnnouncement);
        // System.out.println(alexisTest);
        // System.out.println(alfredTest);
        // System.out.println(notRelevantTest);
    }
    
}