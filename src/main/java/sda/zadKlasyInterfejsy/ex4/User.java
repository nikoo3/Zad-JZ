package sda.zadKlasyInterfejsy.ex4;

public class User {
    String name;
    String lastname;
    String login;
    String password;
    int age;

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name, Validator <String> validator) {
        if(validator.validate(name)) {
            this.name = name;
        }
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname,Validator <String> validator) {
        if(validator.validate(lastname)) {
            this.lastname = lastname;
        }
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login,Validator <String> validator) {
        if(validator.validate(login)) {
            this.login = login;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password,Validator <String> validator) {
        if(validator.validate(password)) {
            this.password = password;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(String age, Validator <Integer> validator) {
        if(validator.validate(age)) {
            this.age = age;
        }
    }
}
