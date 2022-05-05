package emailApplication;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class EmailApplication {

    private String firstName;
    private String lastName;
    private String[] departments = new String[]{"sales", "development", "accounting"};
    private String department;
    private String company;
    private String email;
    private HashMap<Integer, String> hm = new HashMap<Integer, String>();
    private String fullAddress;
    private StringBuilder password = new StringBuilder();
    private int mailboxCap = 100;


    // Constructor
    public EmailApplication(String firstName, String lastName, String departmentName, String company) {
        this.firstName = firstName;
        this.lastName = lastName;
        if(Arrays.asList(departments).contains(departmentName)){
            this.department = departmentName;
        }
        else {
            this.department = "";
        }
        this.company = company;
        hm.put(1, "a");
        hm.put(2, "b");
        hm.put(3, "c");
        hm.put(4, "d");
        hm.put(5, "e");
        hm.put(6, "f");
        hm.put(7, "A");
        hm.put(8, "B");
        hm.put(9, "C");
        hm.put(10, "D");
        hm.put(11, "E");
        hm.put(12, "F");
        hm.put(13, "!");
        hm.put(14, "@");
        hm.put(15, "#");
        genEmail();
        genPass();
    }

    // Generate the email
    public synchronized void genEmail(){
        this.email = firstName + "." + lastName + "@" + department + "." + company + ".com";
        System.out.println("Your email is " + this.email);
    }

    public synchronized void genPass(){
    int passLength = 8;
    for(int i = 0; i < passLength; i++){
        int gen = (int)(Math.random() * 15) + 1;
        this.password.append(hm.get(gen));
    }
    System.out.println("Your genned password is " + this.password.toString() + " This is a temporary password.");
    }

    public String setPassword(String password){
        this.password = new StringBuilder(password);
        return password;
    }

    public void setMailboxCap(int mailboxCap) {
        this.mailboxCap = mailboxCap;
    }

    public void setAltEmail(String email){
        this.email = email;
    }

    public void setNewDept(){
        System.out.println("Enter the new department: 1 for Sales, 2 for Development, 3 for Accounting");
        Scanner in = new Scanner(System.in);
        int depart = in.nextInt();

            switch (depart) {
                case 1 -> department = "sales";
                case 2 -> department = "development";
                case 3 -> department = "accounting";
                default -> System.out.println("error, try again");
            }

        System.out.println("Your new department is " + department);
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public String getEmail() {
        return email;
    }

    public int getMailboxCap() {
        return this.mailboxCap;
    }

    @Override
    public String toString() {
        return "EmailApplication{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", departments=" + Arrays.toString(departments) +
                ", department='" + department + '\'' +
                ", company='" + company + '\'' +
                ", email='" + email + '\'' +
                ", hm=" + hm +
                ", fullAddress='" + fullAddress + '\'' +
                ", password=" + password +
                ", mailboxCap=" + mailboxCap +
                '}';
    }
}
