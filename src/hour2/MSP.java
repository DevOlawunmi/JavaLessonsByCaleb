package hour2;

public class MSP {
    public static void main(String[] args) {
        User user1 = new User(); // Here I instantiated the User class onto onto the new 'user1' object' ie creating an instance of it
        //doing this gives the user1 object access to properties and methods in the User class
        user1.name = "Shandy";// Here, I set the name property to Shandy
        System.out.println(user1.name);
        System.out.println(user1.fullName());
        String x = "hello";

        User user2 = new User();
        user2.name = "Folakemi";
        System.out.println(user2.fullName());

    }

}
