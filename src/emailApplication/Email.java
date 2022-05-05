package emailApplication;

import java.util.ArrayList;

public class Email {
    public static void main(String[] args){
        ArrayList<EmailApplication> data = new ArrayList<>();
        EmailApplication bob =
                new EmailApplication("Bob", "Test", "sales", "Microsoft");
        EmailApplication sammy =
                new EmailApplication("Samantha", "Berkin", "accounting", "Google");
        EmailApplication john =
                new EmailApplication("Jonathan", "James", "", "Amazon");
        bob.getFullName();
        bob.getMailboxCap();
    }
}
