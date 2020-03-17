package com.example.projeto1_ac1.controller;

import java.util.ArrayList;

import com.example.projeto1_ac1.model.Produto;
import com.example.projeto1_ac1.service.ProdutoService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;


/**
 * ProdutoController
 */
@Controller
public class ProdutoController {

    @Autowired
    private ProdutoService ps;

    @GetMapping("/produto/{codigo}")

    public ModelAndView getProduto(
     @PathVariable("codigo") int codigo) 
    {
        ModelAndView mv1 = new ModelAndView("produto");
        Produto p1 = ps.getProduto(codigo);

        mv1.addObject("produto", p1);
        return mv1;
    }
    
    @GetMapping("/produtosEmEstoque")

    public ModelAndView getProdutoEmEstoque() 
    {
        ModelAndView mv2 = new ModelAndView("produtosEmEstoque");
        ArrayList<Produto> p2 = ps.getProdutosEmEstoque();

        mv2.addObject("produtos", p2);
        
        
        return mv2;
        
    }
    
    
    @GetMapping("/produtosValorAcima/{valor}")

    public ModelAndView getProdutoByValorAcima(
     @PathVariable("valor") double valor) 
    {
        ModelAndView mv3 = new ModelAndView("produtosValorAcima");
        ArrayList<Produto> p3 =  ps.getProdutosByValorAcima(valor);

        mv3.addObject("produtos", p3);
        
        
        return mv3;
    }

    
    
    @GetMapping("/produtosValorAbaixo/{valor}")

    public ModelAndView getProdutoByValorAbaixo(
     @PathVariable("valor") double valor) 
    {
        ModelAndView mv4 = new ModelAndView("produtosValorAbaixo");
        ArrayList<Produto> p4 = ps.getProdutosByValorAbaixo(valor);

        mv4.addObject("produtos", p4);
        
        
        return mv4;
        
    }

}