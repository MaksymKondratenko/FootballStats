package com.maksymkondratenko.footballstats.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Component
public class NewMatchInterceptor extends HandlerInterceptorAdapter{
	private static final Logger logger = Logger.getLogger(NewMatchInterceptor.class);

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		request.setAttribute("startTime", System.currentTimeMillis());
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
		long startTime = Long.valueOf(request.getAttribute("startTime").toString());
		long handleTime = (System.currentTimeMillis() - startTime) % 1000;
		request.setAttribute("handleTime", System.currentTimeMillis());
		logger.info("Time of handling the request = " + handleTime + " ms");
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
		long startTime = Long.valueOf(request.getAttribute("startTime").toString());
		long handleTime = Long.valueOf(request.getAttribute("handleTime").toString());
		long renderTime = (System.currentTimeMillis() - handleTime) % 1000;
		long totalTime = (System.currentTimeMillis() - startTime) % 1000;
		request.setAttribute("totalTime", totalTime);
		logger.info("Time of rendering the view = " + renderTime + " ms");
		logger.info("Total time of processing the request = " + totalTime + " ms");
	}
	
	
}
