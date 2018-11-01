package com.qkz5.oaattendance.controller.request;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Author: WeiRunfeng
 * Date:   2018/11/1
 * Time：  11:09
 * Content:
 */
@Controller
@RequestMapping(value = "/login")
public class LonginController {
    private static Logger LOG = LoggerFactory.getLogger(LonginController.class);
    @RequestMapping(value = "/login", method = { RequestMethod.GET, RequestMethod.POST })
    @ResponseBody
    public String login(@PathVariable String id , Model model, HttpServletRequest request) {


        return "跳转的页面路径";
    }

}
