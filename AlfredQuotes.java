import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        return String.format("Hello %s it's great to see you", name);
    }

    public String dateAnnouncement() {
        return String.format("It is %s", new Date());
    }
    
    public String respondBeforeAlexis(String conversation) {
        if(conversation.indexOf("Alfred") >= 0) {
        return "At your service. As you wish, naturally.";
        }
        if(conversation.indexOf("Alexis") >= 0) {
        return "Right away, sir. She certainly isn't sophisticated enough for that.";
        }
        return "Right, and with that I shall retire.";
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

