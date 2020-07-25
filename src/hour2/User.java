package hour2;
/*
Classes: In OOP, classes are often used to set the structure of something you might want to represent
Could be people, transactions, rectangles etc.
Classes then have properties(nouns) which store something and methods(verbs) which do something
access modifiers eg public determine who has access to the class
Static means no instance of the class needs to be created before the it can be used
Static can be applied to variables, methods, blocks and nested classes
A variable is a container which holds the value while the Java program is executed. A variable is assigned with a data type.

Variable is a name of memory location

When we create a variable inside a class and make it publicly accessible, it is known as a property
If not publicly accessible, it's just a field
This class has property of 'name'
Basically, we're saying that every user created will be able to get a name.
How do we create users?
User user1 = new User
user.name  = "Sade". This is an example of setting a property


 */
public class User {
    public String name;
//    public void cheerMeUp(){
//        System.out.println("Always remember you are beautiful and smart "+ name);
//
//    }
    public String fullName(){
        return name + " Ajibola"; // Ajibola is hard coded. Could have been stored in a variable
    }
}
