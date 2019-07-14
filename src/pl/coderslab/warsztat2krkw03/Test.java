package pl.coderslab.warsztat2krkw03;

import pl.coderslab.warsztat2krkw03.dao.UserDao;
import pl.coderslab.warsztat2krkw03.model.User;

public class Test {

    public static void main(String[] args) {
        User u = new User("admin3", "admin3@mail.pl", "admin");
        UserDao.create(u);
        System.out.println(u.getId());
        System.out.println(u.getPassword());
    }
}
