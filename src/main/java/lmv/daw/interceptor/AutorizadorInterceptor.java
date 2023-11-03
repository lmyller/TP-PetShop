package lmv.daw.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AutorizadorInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String uri = request.getRequestURI();

		if (uri.endsWith("loginForm") || uri.endsWith("efetuaLogin") || uri.contains("resources")) 
			return true;

		if (request.getSession().getAttribute("usuarioLogado") != null) 
			return true;

		response.sendRedirect("loginForm");
		return false;
	}
}
