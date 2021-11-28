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

    //  //// Guest Greeting //////////////////////////////
    //      Overloaded version of Guest Greeting where there is a second param that is "morning", "afternoon", "evening"
    //  @ param: String name, String dayPeriod
    //  @returns: a greeting that includes the guest's name
    public String guestGreeting(String name, String dayPeriod) {
        String greeting = "Good " + dayPeriod + ", Welcome to Wayne Manor " + name;
        return greeting;
    }

    //  //// Guest Greeting //////////////////////////////
    //      Overloaded version of Guest Greeting where there is a second param that is a date
    //  @logic:
    //          1. If current time is before noon
    //                  it is the morning period
    //          2. If current time is after noon but before 6pm
    //                  it is the afternoon period
    //          3. if current time is after 6pm
    //                  it is the evening period
    //  @param: String name, String dayPeriod
    //  @returns: a greeting that includes the guest's name
    public String guestGreeting(String name, Date date) 
    {
        String dayPeriod = "day";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH");
        int currentHour = Integer.parseInt(simpleDateFormat.format(date));

        if (currentHour < 12) {
            dayPeriod = "morning";
        } else if (currentHour < 18) {
            dayPeriod = "afternoon";
        } else {
            dayPeriod = "evening";
        }

        String greeting = "Good " + dayPeriod + ", Welcome to Wayne Manor " + name;
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

