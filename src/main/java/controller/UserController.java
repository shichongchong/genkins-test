package controller;

import bean.User;
import dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/user")
    public class UserController {

    @Autowired
    UserDao userDao;

    @RequestMapping(value = "/getUsers/{id}")
    public User getUsers(@PathVariable String id){
        User user = userDao.getUsers(id);
        return user;
    }

}
