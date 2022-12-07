package com.online.shopping.FinalProject.controler;

import com.online.shopping.FinalProject.entity.Products;
import com.online.shopping.FinalProject.entity.User;
import com.online.shopping.FinalProject.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UsersController {
    private final UserService userService;

    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<User>> getAllUsers(){
        List<User>users= userService.findAllUsers();
        return  new ResponseEntity<>(users, HttpStatus.OK);
    }
    @PostMapping("/add")
    public User addUser(@RequestBody User user){
        user.setId(0);
        userService.addUser(user);
        return  user;
    }
    @GetMapping("/email/{email}")
    public ResponseEntity<List<User>> getByEmail(@PathVariable String email){
       List<User>  users= userService.getByEmail(email);
        return  new ResponseEntity<>(users, HttpStatus.OK);
    }


}
