package com.sajad.jwt.controller;

import com.sajad.jwt.model.JwtUser;
import com.sajad.jwt.security.JwtGenerator;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/token")
public class TokenController {


    private JwtGenerator jwtGenerator;

    public TokenController(JwtGenerator jwtGenerator) {
        this.jwtGenerator = jwtGenerator;
    }

    @PostMapping
    public String generate(@RequestBody final JwtUser jwtUser) {

        return jwtGenerator.generate(jwtUser);

    }

    @GetMapping("/test")
    public String test() {
        return "this is test ";
    }
}
