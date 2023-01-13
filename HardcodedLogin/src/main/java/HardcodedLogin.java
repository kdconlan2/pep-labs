
public class HardcodedLogin {
    /**
     * This challenge represents a hardcoded login example:
     *
     *     Let's say we have two users, named "admin" and "user".
     *     "admin" has a password of "qwerty".
     *     "user" has a password of "password".
     *
     * The method should return true if the login should be permitted, and false if it should not. You will need to use
     * if/else statements.
     *
     * @param username a String that represents a username.
     * @param password a String that represents a password.
     * @return true if there is a successful login, and false otherwise.
     */
    public boolean login(String username, String password){
        boolean granted= true;
         while (true){
            Scanner sc= new Scanner(System.in);
            System.out.println("username:");
            String username1 = sc.nextLine();
            System.out.println("password:");
            String password1 = sc.nextLine();

            if (username1){
                boolean usernameA = username1.equalsAdmin("admin");
                boolean usernameB = username1.equalsUser("user");}
             if (password1){   
                boolean passwordA = password1.equalsAdmin("qwerty");
                boolean passwordB = password1.equalsUser("password");}
                if(usernameA && passwordA)= granted;
                if(usernameB && passwordB) = granted;
            }
         }
        
        return false;
    }

