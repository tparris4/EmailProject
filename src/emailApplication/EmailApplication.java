package emailApplication;

import java.util.Arrays;
import java.util.HashMap;

public class EmailApplication {

    private String firstName;
    private String lastName;
    private String[] departments = new String[]{"sales", "development", "accounting"};
    private String department;
    private String company;
    private String email;
    private HashMap<Integer, String> hm = new HashMap<Integer, String>();
    private String fullAddress;
    private String password;


    // Constructor
    public EmailApplication(String firstName, String lastName, String departmentName, String company) {
        this.firstName = firstName;
        this.lastName = lastName;
        if(Arrays.asList(departments).contains(departmentName)){
            this.department = departmentName;
        }
        else {
            this.department = " ";
        }
        this.company = company;
    }

    // Generate the email
    public String genEmail(){
        email = firstName + "." + lastName + "@" + department + "." + company + ".com";
        return email;
    }

    public String genPass(){
    return "";
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }


}
