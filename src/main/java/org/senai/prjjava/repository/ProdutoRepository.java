package org.senai.prjjava.repository;

import org.senai.prjjava.entity.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto,Integer>{
    
}
