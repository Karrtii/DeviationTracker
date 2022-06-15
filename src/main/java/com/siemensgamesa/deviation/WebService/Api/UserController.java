package com.siemensgamesa.deviation.WebService.Api;

import com.siemensgamesa.deviation.Model.UserModel;
import com.siemensgamesa.deviation.WebService.Service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class UserController {

    private final UserService userService;

    @PostMapping("/register")
    public ResponseEntity<Void> registerUser(@RequestBody UserModel userModel) {
        userService.registerUser(userModel);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/getUser")
    public ResponseEntity<UserModel> getUser(@RequestHeader("Authorization") String header)
    {
        log.info(header);
        return ResponseEntity.ok().body(userService.getUserFromHeader(header));
    }
}
