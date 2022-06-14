package com.siemensgamesa.deviation.WebService.Api;

import com.siemensgamesa.deviation.Model.UserModel;
import com.siemensgamesa.deviation.WebService.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class UserController {

    private final UserService userService;

    @PostMapping("/auth/register")
    public ResponseEntity<Void> registerUser(@RequestBody UserModel userModel) {
        userService.registerUser(userModel);
        return ResponseEntity.ok().build();
    }
}