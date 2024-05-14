package utils;

import DataBase.Database;
import services.UserService;

import java.util.Objects;
import static utils.Utils.*;
public class Authentication {
    static Database database = Database.getInstance();
    static AdminService adminService = AdminService.getInstance();
    static UserService userService = UserService.getInstance();
//    public void service(){
//        while (true) {
//            switch (getInt("""
//                    0 exit
//                    1 sign in
//                    2 sign up
//                    """)) {
//                case 0 -> {
//                    System.out.println("see you soon!");
//                    return;
//                }
//                case 1 -> {
//                    signIn();
//                }
//                case 2 -> {
//                    signUp();
//                }
//            }
//        }
//    }
//    private void signUp() {
//        User user = new User();
//        System.out.println("enter name");
//        user.setName(strScanner.nextLine());
//        System.out.println("enter username");
//        user.setUsername(strScanner.nextLine());
//        System.out.println("enter password");
//        user.setPassword(strScanner.nextLine());
//        user.setRole(Role.USER);
//        user.setBalance(100000.0);
//        if (database.users.add(user)) {
//            System.out.println("successfully registered!");
//        } else {
//            System.out.println("username exists!");
//        }
//    }

//    private void signIn() {
//        System.out.println("enter username");
////        String username = strScanner.nextLine();
//        System.out.println("enter passwrd");
////        String password = strScanner.nextLine();
//        for (User user : database.users) {
//            if (Objects.equals(user.getUsername(), username) &&
//                    Objects.equals(user.getPassword(), password)) {
//                switch (user.getRole().name()) {
//                    case "ADMIN" -> {
//                        adminService.service(user);
//                    }
//                    case "USER" -> {
//                        userService.service(user);
//                    }
//                    case "DOCTOR" -> {
//                        doctorService.service(user);
//
//                    }
//                }
//            }
//        }
//    }
}
