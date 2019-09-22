package com.jiangzm.manage.user;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
//@RequestMapping("/user")
public class UserController {

    @GetMapping("/user/test")
    public String login() {
        return "/index";
    }

}
