package com.mindtree.chat.controller;

import com.mindtree.chat.domain.User;
import com.mindtree.chat.service.UserService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class LoginController {

    private static final Logger log = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    private UserService userService;


    /**
     * @param model
     * @return
     */
    @RequestMapping(value="/welcome", method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        return "redirect:/home";
    }

    /**
     * @param model
     * @return
     */
    @RequestMapping(value="/login", method = RequestMethod.GET)
    public String login(ModelMap model) {
        return "login";
    }

    /**
     * @param model
     * @return
     */
    @RequestMapping(value="/loginfailed", method = RequestMethod.GET)
    public String loginerror(ModelMap model) {
        model.addAttribute("loginfailed", "true");
        return "login";
    }

    /**
     * @param model
     * @return
     */
    @RequestMapping(value="/logout", method = RequestMethod.GET)
    public String logout(ModelMap model) {
        return "redirect:/login";
    }
}