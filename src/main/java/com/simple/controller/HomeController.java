package com.simple.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

@Controller
public class HomeController {
	@RequestMapping("/test/aaa")
	public String home() {
		System.out.println("컨트롤러 지나가는 중");
		return "/WEB-INF/views/home.jsp";
	}
}

/*
 * // 컨트롤러 역할을 수행함 public class HomeController extends MultiActionController {
 * 
 * @Override protected ModelAndView handleRequestInternal(HttpServletRequest
 * request, HttpServletResponse response) throws Exception {
 * System.out.println("컨트롤러까지 연결 완료");
 * 
 * ModelAndView mv = new ModelAndView(); mv.addObject("data", "뭐하고 있는 건지 모르겠다");
 * mv.setViewName("/WEB-INF/views/home.jsp");
 * 
 * 
 * return mv; // 디스패처 서블릿으로 뷰에 대한 경로와 DATA에 대한 내용을 반환함 }
 * 
 * }
 */