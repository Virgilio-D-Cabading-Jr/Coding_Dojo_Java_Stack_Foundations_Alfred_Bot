import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;                                      // Java.util will be used in this class

/** /////////////////////////////////////////////////////
 *  ALFRED QUOTES CLASS
 *  By: Virgilio D. Cabading Jr.     Created at: Nuvember 28, 2021 0900
 *  /////////////////////////////////////////////////////*/

public class AlfredQuotes {
    
    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }
    
    //  //// Guest Greeting //////////////////////////////
    //  @returns: a greeting that includes the guest's name
    public String guestGreeting(String name) {
        String greeting = "Welcome to Wayne Manor " + name;
        return greeting;
    }
    
    //  //// Date Announcement ///////////////////////////
    //  @returns: A polite announcement of the current date and time
    public String dateAnnouncement() {
        Date currentDate = new Date();                                          // Get the Current Date
        String greeting = "I do believe that the current day is ";

        String pattern = "EEEEE, MMMMM dd, yyyy";                               // Format the Currrent Date to get the Day of Week, Month, Day, and Year
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String currentDay = simpleDateFormat.format(currentDate);

        pattern = "HH:mm:ss aa z";                                              // Format the Current Time to get Hour, Minute, Seconds, AM/PM, and Time Zone
        simpleDateFormat = new SimpleDateFormat(pattern);
        String currentTime = simpleDateFormat.format(currentDate);
        
        greeting += currentDay;                                                 // Add the formated day and time to the greeting output
        greeting += " and the current time is " + currentTime;
        return greeting;
    }

    //  //// Respond Before Alexa ///////////////////////////
    //  Logic:
    //      1. If "Alexa" is in conversation
    //          return  "Right away. She certainly isn't sophisticated enough for that."
    //      2. If "Alfred" is in conversation
    //          return  "As you wish."
    //      3. If neither name is found
    //          return "Right. And with that I shall retire."
    //  @return: String
    public String respondBeforeAlexa(String conversation) {
        conversation = conversation.toLowerCase();
        boolean foundAlexa = conversation.indexOf("alexa") >= 0;
        boolean foundAlfred = conversation.indexOf("alfred") >= 0;

        if (foundAlexa) {
            return "Right away. She certainly isn't sophisticated enough for that.";
        } else if (foundAlfred) {
            return "As you wish.";
        } else {
            return "Right. And with that I shall retire.";
        }
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

