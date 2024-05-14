package DataBase;

import Enum.Role;
import model.User;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Database {

    public Set<User> users=new HashSet<>();

    private static Database database;
    public static Database getInstance(){

        if (database==null) {
            database = new Database();
            database.users.add(new User("admin","admin","admin", Role.ADMIN,0.0));
            database.users.add(new User("u1","u1","u1", Role.USER,100000.0));
            database.users.add(new User("u2","u2","u2", Role.USER,100000.0));
            database.users.add(new User("u3","u3","u3", Role.USER,100000.0));
            database.users.add(new User("u4","u4","u4", Role.USER,100000.0));
        }
        return database;
    }
}
