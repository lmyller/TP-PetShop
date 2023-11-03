package lmv.daw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;
import lmv.daw.dao.LoginDAO;
import lmv.daw.modelo.Login;

@Controller
public class LoginController {
	@RequestMapping("loginForm")
	public String loginForm() {
		return "formulario-login";
	}
	
	@RequestMapping("login")
	public String efetuaLogin(Login login, HttpSession session) {
		if (new LoginDAO().validaLogin(login)) {
			session.setAttribute("usuarioLogado", login);
			return "redirect:listaTarefas";
		}
		return "redirect:loginForm";
	}

	@RequestMapping("logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:loginForm";
	}
}
