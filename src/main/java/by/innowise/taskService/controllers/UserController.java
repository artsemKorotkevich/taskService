package by.innowise.taskService.controllers;

import by.innowise.taskService.entities.User;
import by.innowise.taskService.services.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class UserController {
    @Autowired
    private UserServiceImpl service;

    @GetMapping("/user")
    public ResponseEntity<User> getUserById(@RequestParam("userId") Long userId){
        return ResponseEntity.ok().body(service.findById(userId));
    }

    @PostMapping("/user")
    public ResponseEntity<User> saveUser(@RequestBody  User user) {
      return ResponseEntity.ok().body(service.save(user));
    }

    @DeleteMapping("/user")
    public ResponseEntity deleteUser(@RequestParam("userId") Long userId){
        service.delete(userId);
        return ResponseEntity.ok().body("ok");
    }
    @PutMapping("/user")
    public ResponseEntity updateUser(@RequestBody User user, @RequestParam("id") Long id){
        return ResponseEntity.ok().body(service.update(user,id));
    }
}
