package com.example.randUserReader;

import org.apache.tomcat.util.json.ParseException;
import org.json.JSONString;
import org.json.simple.JSONArray;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication

public class UserService {


    public static void main(String[] args) {}

    public static List<String> filter(String gender, int numUsers) {

        List<MyUser> users = UserProxy.getProductAsJson(numUsers);
        List<String> firstNames = new ArrayList<>();

        for (int i = 0; i < numUsers; i++) {
            MyUser user = users.get(i);
            String currentGender = user.getGender();
            UserName name = user.getName();
            String firstName = name.getFirst();

            if (currentGender.equals(gender)) {
                firstNames.add(firstName);
            }

        }

        return firstNames;
    }
}
