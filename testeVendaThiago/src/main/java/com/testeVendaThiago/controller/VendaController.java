package com.testeVendaThiago.controller;

//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.testeVendaThiago.model.Venda;
import com.testeVendaThiago.service.VendaService;

@RestController
@RequestMapping("/vendas")
public class VendaController{

	@Autowired 
	private VendaService vendaService;
		
	@GetMapping
	public List<Venda> listarVendas(){
		return vendaService.listarVendas();
	}
		
	@GetMapping("/{idVenda}")
	public Venda findByIdVenda(@PathVariable Long idVenda) {
		return vendaService.findByIdVenda(idVenda);
	}
	
	@PostMapping
	public Venda cadastrarVenda(@RequestBody Venda venda) {
		return vendaService.cadastrarVenda(venda);
	}
	
	/*@GetMapping
	public List<Object[]> byParams(@RequestParam String dataInicial, @RequestParam  String dataFinal) throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date dataInicialFormatada = formatter.parse(dataInicial);
	    Date dataFinalFormatada = formatter.parse(dataFinal);
	    return vendaService.byParams(dataInicialFormatada,dataFinalFormatada);

	 }
	*/
}
