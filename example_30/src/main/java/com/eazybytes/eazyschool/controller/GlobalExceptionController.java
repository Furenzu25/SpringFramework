package com.eazybytes.eazyschool.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

public class GlobalExceptionController {

    @ExceptionHandler(Exception.class)
    public ModelAndView exceptionHandler(Exception ex) {
        ModelAndView errorPage = new ModelAndView("error");
        errorPage.setViewName("error");
        errorPage.addObject("error", ex.getMessage());
        return errorPage;
    }
}
