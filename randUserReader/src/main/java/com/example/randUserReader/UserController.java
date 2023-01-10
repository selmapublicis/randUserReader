package com.example.randUserReader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@SpringBootApplication
@RestController
public class UserController {

    public static void main(String[] args)  {
        SpringApplication.run(UserService.class, args);
    }

    @GetMapping("/answers")
    public static String listToJson(@RequestParam String gender, @RequestParam int numUsers) {
        List<String> firstNames = UserService.filter(gender, numUsers);
        return "{\n gender: " + gender + "\n first names: " + firstNames + "\n}";
    }

}
