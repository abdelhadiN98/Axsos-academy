    public  class  AlfredTest {
    public  static  void main( String [] args) {
        // Create an instance of AlfredQuotes to access all your methods<font></font> 
        AlfredQuotes alfredBot =  new AlfredQuotes();
        // Do some test greetings, providing the necessary data<font><
        String testGreeting = alfredBot.basicGreeting();
        String testGuestGreeting = alfredBot.guestGreeting( "Beth Kane" );
        String testDateAnnouncement = alfredBot.dateAnnouncement();
        String alexisTest =alfredBot.respondBeforeAlexis(
                            "Alexis! Play some low-fi beats."
                            );
        String alfredTest = alfredBot.respondBeforeAlexis(
            "I can't find my yo-yo. Maybe Alfred knows where he is" );
        String notRelevantTest = alfredBot.respondBeforeAlexis(
            "Maybe that's what Batman is all about. Not winning. Failing...");
        // Print the greetings for testing.<font></font> 
        System .out.println(testGreeting);
        // Remove comments one at a time as you implement each method.
        System.out.println(testGuestGreeting);
        System.out.println(testDateAnnouncement);
        System.out.println(alexisTest);
        System.out.println(alfredTest);
        System.out.println(notRelevantTest);
    }
}