package sda.zadKlasyInterfejsy.ex1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        UserValidator user1 = new UserValidator();
        String[] results = user1.validateEmail("ds@", "asdasd@yahoo.com");
        System.out.println(results[1]);
        System.out.println(results[2]);
    }
}

class UserValidator {
    public String[] validateEmail(String email, String alternativeEmail){

        class Email{
            private String email;

            public Email(String email){
                if( email == null || email.isEmpty() || !validate(email)){
                    this.email = "empty";
                }
                else {
                    this.email = email;
                }
            }
        }
        Email email1 = new Email(email);
        Email email2 = new Email(alternativeEmail);
        return new String[] {email1.email, email2.email} ;
    }

    public static final Pattern EMAIL_VALIDATION =
                Pattern.compile(".+@.+\\.[A-Za-z]{2,6}");
    public static boolean validate(String email){
            Matcher matcher = EMAIL_VALIDATION.matcher(email);
            return matcher.find();
    }
}

