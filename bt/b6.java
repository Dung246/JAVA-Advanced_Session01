package session02.bt;

class User1{
    String username;

    User1(String username){
        this.username=username;
    }

    String getUsername(){
        return username;
    }
}

@FunctionalInterface
interface UserProcessor{
    String process(User1 u);
}

class UserUtils{
    public static String convertToUpperCase(User1 u){
        return u.getUsername().toUpperCase();
    }
}

public class b6{
    public static void main(String[] args){
        UserProcessor processor = UserUtils::convertToUpperCase;
        User1 user = new User1("Dũng");
        String result = processor.process(user);
        System.out.println(result);
    }
}