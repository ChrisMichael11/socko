/**
 * This is the first sample program in Core Java Chapter 3
 * @version 1.01 1997-03-22
 * @author Gary Cornell
 */
public class HelloChris
/ "HelloChris" is the name of the class and the name of the .java file
{
   public static void main(String[] args)

   {
      System.out.println("I will not use 'Hello, World!'");
      System.out.println("We will use something other than that.");
      System.out.println("I will say 'Hello, Chris you are so cool!'")
   }
}

/* public static void
/  "public" (access modifier) means that the method is visible and can be called
/  from other objects of other types. Other alternatives are private, protected,
/  package and package-private. [public/protected/private/no modifiers].

/  "static" means that the method is associated with the class, not a specific
/  instance (object) of that class. This means that you can call a static method
/  without creating an object of the class.
/  (from stackoverflow.com)
/  It means that only one instance of a static field exists[1] even if you
/  create a million instances of the class or you don't create any. It will be
/  shared by all instances.
/  Since static methods also do not belong to a specific instance, they can't
/  refer to instance members (how would you know which instance Hello class you
/  want to refer to?). static members can only refer to static members. Instance
/  members can, of course access static members.
/  "static" members belong to class rather than instance
/  Side note: Of course, static members can access instance members through an
/  object reference.

/  "void" means that the method has no return value. If the method returned an int
/  you would write int instead of void.
*/
