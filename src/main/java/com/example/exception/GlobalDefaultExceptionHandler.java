package com.example.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@ControllerAdvice
public class GlobalDefaultExceptionHandler {
    public static final String DEFAULT_ERROR_VIEW = "error";

    @ResponseBody
    //定义处理异常的类型，可以根据不同异常类型配置，例如这个方法我想处理所有NumberFormatException异常
    @ExceptionHandler({NumberFormatException.class})
    public String formatErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        ModelAndView mav = new ModelAndView();
        mav.addObject("error", "参数类型错误");
        mav.addObject("exception", e);
        mav.addObject("url", req.getRequestURI());
        mav.addObject("timestamp", new Date());
        mav.setViewName(DEFAULT_ERROR_VIEW);
        return mav.toString();
    }

    @ResponseBody
    //这个方法我想处理所有NullPointerException异常
    @ExceptionHandler({NullPointerException.class})
    public String formatNullPointerException(HttpServletRequest req, Exception e) throws Exception {
        return "NullPointerException" + e.toString();
    }
}
