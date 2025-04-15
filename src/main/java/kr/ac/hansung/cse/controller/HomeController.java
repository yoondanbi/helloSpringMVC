package kr.ac.hansung.cse.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {

    //private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
    private static final Logger logger = LoggerFactory.getLogger("kr.ac.hansung.controller.HomeController");


    //@RequestMapping(value = "/", method = RequestMethod.GET)
    @GetMapping("/")
    public String home(HttpServletRequest request) {

        String url = request.getRequestURL().toString();
        String clientIPaddr = request.getRemoteAddr();

        logger.info("Request URL: {}, Client IP: {}", url, clientIPaddr);

        return "home";
    }
}


