package proje.v1.api.controller;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import proje.v1.api.message.login.RequestLogin;
import proje.v1.api.service.user.UserService;
import java.util.List;

@Api(description = "Test İşlemleri")
@RestController
@RequestMapping(value = "/test")
public class TestController {

    @Autowired
    private UserService userService;




}
