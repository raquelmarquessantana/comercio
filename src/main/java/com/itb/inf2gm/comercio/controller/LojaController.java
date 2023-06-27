package com.itb.inf2gm.comercio.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.inf2gm.comercio.model.Produto;

@Controller
@RequestMapping("/comercio/produtos")
public class LojaController {

	@GetMapping("/listar")
	public String listarProdutos(Model model) {
		
		List<Produto> listaDeProdutos = new ArrayList<Produto>();
		
		Produto p1 = new Produto();
		
		p1.setId(20l);
		p1.setNome("Máquina de Lavar");
		p1.setDescricao("Máquina de Lavar Brastemp 13l com painel dígital");
		p1.setCodigoBarra("HFOEHFHERHK1446464741");
		p1.setPreco(3215.65);
		
		Produto p2 = new Produto();
		
		
		p2.setId(21l);
		p2.setNome("Micro-ondas");
		p2.setDescricao("Micro-ondas Eletrolux multuso");
		p2.setCodigoBarra("DJFAFENAOENA646484548");
		p2.setPreco(3215.65);
		
		listaDeProdutos.add(p1);
		listaDeProdutos.add(p2);
		
		model.addAttribute("listaDeProdutos" , listaDeProdutos);
		
		
		return "produtos";
	}
}
