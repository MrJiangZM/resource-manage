package com.jiangzm.manage.user;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Slf4j
@Controller
//@RequestMapping("/user")
public class UserController {

    @GetMapping("/user/test1")
    public String login() {
        return "/home";
    }

    @GetMapping("/user/test4")
    public String login1() {
        return "/login1";
    }

    @GetMapping("/user/test3")
    public String login2() {

        return "/emailTemplate";
    }

    @GetMapping("/user/test5")
    public String login3() {
        return "/index";
    }

}
