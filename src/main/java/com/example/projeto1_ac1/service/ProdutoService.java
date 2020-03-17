package com.example.projeto1_ac1.service;

import java.util.ArrayList;
import java.util.Collection;

import com.example.projeto1_ac1.model.Produto;
import com.example.projeto1_ac1.repository.ProdutoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * getProduto
 */
@Service
public class ProdutoService{

    @Autowired
    private ProdutoRepository pr;
    
    public Produto getProduto (int id){

        Produto produto = pr.getProdutoByid(id);
        if(produto != null)
            return produto;
        else
        return null;
    }

    public ArrayList<Produto> getProdutosEmEstoque (){

        Collection<Produto> produto = pr.getProdutos();
        ArrayList<Produto> prodEmEstoque = new ArrayList<Produto>();
 
        for (Produto p : produto) {
            if(p.getEstoque() > 0)
            prodEmEstoque.add(p);
        }
         return prodEmEstoque;
     }

    public ArrayList<Produto> getProdutosByValorAcima (double valor){

        Collection<Produto> produto = pr.getProdutos();
        ArrayList<Produto> prodValorAcima = new ArrayList<Produto>();
 
        for (Produto p : produto) {
            if(p.getValor() > valor)
                prodValorAcima.add(p);
        }
         return prodValorAcima;
     }

     public ArrayList<Produto> getProdutosByValorAbaixo (double valor){

        Collection<Produto> produto = pr.getProdutos();
        ArrayList<Produto> prodValorAbaixo = new ArrayList<Produto>();
 
        for (Produto p : produto) {
            if(p.getValor() < valor)
            {
                prodValorAbaixo.add(p);
            }
        }
         return prodValorAbaixo;
     }
     
    
}