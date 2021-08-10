package com.mall.Controller;/*
    @author Administrator
    @create 2021-07-13 11:05
*/

import com.mall.entity.Users;
import com.mall.Service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@RequestMapping("/admin")
@Controller
public class AdminLoginController {
    //定义后台业务对象
    @Resource
    private IUserService userService;
    @RequestMapping("login_show")
    public String login_show(){
        return "/admin/login";
    }
    @RequestMapping("login_submit")
    public String login_submit(Users user, HttpSession session, Model model){
        //根据用户名密码进行校验
        Users u = userService.adminLogin(user);
        if(u==null){
            model.addAttribute("err","用户名或者密码不正确");
            return "/admin/login";//前台登录页面
        }
        //将登录的账号对象存到session,用于会话跟踪管理
        session.setAttribute("adminUser",u);
        return "/admin/index";//进入后台主页面
    }
}
