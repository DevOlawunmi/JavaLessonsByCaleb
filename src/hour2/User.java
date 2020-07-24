package hour2;
/*When we create a variable inside a class and make it publicly accessible, it is known as a property
This class has property of 'name'
Basically, we're saying that every user created will be able to get a name.
How do we create users?
User user = new User
user.name  = "Sade". This is an example of setting a property


 */
public class User {
    public String name;
//    public void cheerMeUp(){
//        System.out.println("Always remember you are beautiful and smart "+ name);
//
//    }
    public String fullName(){
        return name + " Ajibola";
    }
}
