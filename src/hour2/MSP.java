package hour2;

public class MSP {
    public static void main(String[] args) {
        User user = new User(); // Here I instantiated the User class onto onto the new 'user' object' ie creating an instance of it
        //doing this gives the user object access to properties and methods in the User class
        user.name = "Shandy";// Here, I set the name property to Shandy
        System.out.println(user.name);
        System.out.println(user.fullName());
        String x = "hello";

    }

}
