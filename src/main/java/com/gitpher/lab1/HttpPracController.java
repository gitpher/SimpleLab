package com.gitpher.lab1;

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

        System.out.println("Method: " + httpServletRequest.getMethod());
        System.out.println("AuthType: " + httpServletRequest.getAuthType());
        System.out.println("ServletPath: " + httpServletRequest.getServletPath());
        System.out.println("LocalName: " + httpServletRequest.getLocalName());



        HttpHeaders headers = new HttpHeaders();
        headers.add("Set-Cookie", "user=Jay; expires=Sat, 12-Oct-2022 00:00:00 KST; path=/;");

        return ResponseEntity.ok().headers(headers).body("Welcome Home");

    }


}
