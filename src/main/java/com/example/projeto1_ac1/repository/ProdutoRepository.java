package com.example.projeto1_ac1.repository;

import java.util.Collection;
import java.util.HashMap;

import com.example.projeto1_ac1.model.Produto;

import org.springframework.stereotype.Repository;




/**
 * ProdutoRepository
 */
@Repository
public class ProdutoRepository {

    public HashMap<Integer, Produto> produtos = new HashMap<Integer,Produto>();

    public ProdutoRepository()
    {
        produtos.put(1,new Produto(1,"Todeschini",5000,2));
        produtos.put(2,new Produto(2,"Roland",35000,1));
        produtos.put(3,new Produto(3,"Scandalli",25000,5));
        produtos.put(4,new Produto(4,"Michel",2500,2));
        produtos.put(5,new Produto(5,"Eagle",3000,8));
        produtos.put(6,new Produto(6,"Veronese",5900,23));
        produtos.put(7,new Produto(7,"Piatanesi",22800,3));
        produtos.put(8,new Produto(8,"Giuliete",1800,0));
        produtos.put(9,new Produto(9,"Sonelli",7000,7));
        produtos.put(10,new Produto(10,"Groovin",3000,9));
    }

    public Collection<Produto> getProdutos()
    {
        //retornar collection
        return produtos.values();
    }

    public Produto getProdutoByid (int id)
    {

        return produtos.get(id);
    }

}