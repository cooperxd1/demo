package com.prueba.tecnica.demo.persistencia.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prueba.tecnica.demo.persistencia.entidades.PedidosDetalle;

@Repository
public interface PedidoDetalleRepository extends CrudRepository<PedidosDetalle, Integer>{

	PedidosDetalle findByIdDetalle(int idDetalle);
}
