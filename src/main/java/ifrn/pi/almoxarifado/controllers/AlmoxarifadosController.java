package ifrn.pi.almoxarifado.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AlmoxarifadosController {

	@RequestMapping("/almoxarifados/form")
	public String form() {
		return "formAlmoxarifado";
	}
}
