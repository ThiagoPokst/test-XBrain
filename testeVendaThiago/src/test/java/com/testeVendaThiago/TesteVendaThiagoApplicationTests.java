package com.testeVendaThiago;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.testeVendaThiago.model.Venda;
import com.testeVendaThiago.model.Vendedor;
import com.testeVendaThiago.repository.VendaRepository;
import com.testeVendaThiago.repository.VendedorRepository;
import com.testeVendaThiago.service.VendaService;
import com.testeVendaThiago.service.VendedorService;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TesteVendaThiagoApplicationTests {
	
	@MockBean
	private VendedorRepository vendedorRepository;
	
	@MockBean
	private VendaRepository vendaRepository;
	
	@Autowired
	private VendedorService vendedorService;
	
	@Autowired
	private VendaService vendaService;
	
	
	@Test
	public void listarVendedoresTest(){ 
		when(vendedorRepository.findAll()).thenReturn(Stream.of(new Vendedor(1L,"Thiago"),new Vendedor(2L,"Matheus"),new Vendedor(3L,"Vitor")).collect(Collectors.toList()));
		assertEquals(3,vendedorService.listarVendedores().size());	
	}
	
	@Test
	public void findByIdVendedorTest(){
		Vendedor vendedor = new Vendedor(1L,"Thiago");
		when(vendedorRepository.findByIdVendedor(1L)).thenReturn(vendedor);
		Vendedor vendedorRetornado = vendedorService.findByIdVendedor(1L);
		verify(vendedorRepository, times(1)).findByIdVendedor(1L);
		verifyNoMoreInteractions(vendedorRepository);
		assertEquals(vendedorRetornado,vendedor);
	}
	
	@Test
	public void cadastrarVendedorTest(){
		Vendedor vendedor = new Vendedor(1L,"Thiago");
		when(vendedorRepository.save(vendedor)).thenReturn(vendedor);
		assertEquals(vendedor,vendedorService.save(vendedor));
	}
	
	@Test
	public void listarVendesTest(){
		when(vendaRepository.findAll()).thenReturn(Stream.of(new Venda(1L,"2011-11-11","Roupas",50.00,1L,"Thiago"),new Venda(2L,"2011-10-05","Geladeira",1500.50,2L,"Matheus"),new Venda(3L,"2011-05-05","Sapatos",180.00,3L,"Vitor")).collect(Collectors.toList()));
		assertEquals(3,vendaService.listarVendas().size());
	}
	
	@Test
	public void findByIdVendaTest(){	
		Venda venda = new Venda(1L,"2011-11-11","Roupas",50.00,1L,"Thiago");
		when(vendaRepository.findByIdVenda(1L)).thenReturn(venda);
		Venda vendaRetornado = vendaService.findByIdVenda(1L);
		verify(vendaRepository, times(1)).findByIdVenda(1L);
		verifyNoMoreInteractions(vendaRepository);
		assertEquals(vendaRetornado,venda);
	}
	
	@Test
	public void cadastrarVendaTest(){
		Venda venda = new Venda(1L,"2011-11-11","Roupas",50.00,1L,"Thiago");
		when(vendaRepository.save(venda)).thenReturn(venda);
		assertEquals(venda,vendaService.cadastrarVenda(venda));
	}
	
}
