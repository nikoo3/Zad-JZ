package sda.zadKlasyInterfejsy.ex4;

public class Main {

    public static void main(String[] args) {
        User user = new User();
        user.setName("Jan", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return input != null && !input.isEmpty() && Character.isUpperCase(input.charAt(0));
            }
        });
        user.setLastname("Kowalski", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return input != null && !input.isEmpty() && Character.isUpperCase(input.charAt(0));
            }
        });
        user.setAge("25", new Validator<Integer>() {
            @Override
            public boolean validate(Integer input) {
                return input >= 0 && input < 200;
            }
        });
        user.setLogin("Login", new Validator<String>() {
                    @Override
                    public boolean validate(String input) {
                        return input != null && input.length() == 10;
                    }
                }
        );
        user.setPassword("asvb!", new Validator<String>() {
            @Override
            public boolean validate(String input) {

                return input.contains("!");
            }
        });

        System.out.println(user);

    }
}
