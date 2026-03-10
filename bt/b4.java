package session02.bt;
import java.util.*;
import java.util.function.*;
class User{
    String username;
    User(){
        this.username="default";
    }

    User(String username){
        this.username=username;
    }

    String getUsername(){
        return username;
    }
}

public class b4{
    public static void main(String[] args){
        List<User> users=new ArrayList<>();
        users.add(new User("An"));
        users.add(new User("Thành"));
        users.add(new User("Dũng"));

        Function<User,String> f=User::getUsername;
        Consumer<String> c=System.out::println;
        Supplier<User> s=User::new;

        for(User u:users){
            c.accept(f.apply(u));
        }

        User u=s.get();
        c.accept(u.getUsername());
    }
}
