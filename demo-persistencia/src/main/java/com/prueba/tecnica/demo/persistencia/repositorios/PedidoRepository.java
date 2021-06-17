package com.prueba.tecnica.demo.persistencia.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prueba.tecnica.demo.persistencia.entidades.Pedidos;

@Repository
public interface PedidoRepository extends CrudRepository<Pedidos, Short>{

}
