package com.gitpher.lab1;

import com.sun.net.httpserver.HttpServer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequiredArgsConstructor
public class HttpPracController {

    @GetMapping("/")
    public ResponseEntity<?> home(HttpServletRequest httpServletRequest) {

        System.out.println("I'm home");

        HttpHeaders headers = new HttpHeaders();
        headers.add("Set-Cookie", "user=Jay; expires=Sat, 12-Oct-2022 00:00:00 KST; path=/;");

        return ResponseEntity.ok().headers(headers).body("Welcome Home");

    }


}
