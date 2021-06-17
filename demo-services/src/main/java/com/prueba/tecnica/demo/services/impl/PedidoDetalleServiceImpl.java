package com.prueba.tecnica.demo.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.tecnica.demo.persistencia.entidades.PedidosDetalle;
import com.prueba.tecnica.demo.persistencia.repositorios.PedidoDetalleRepository;
import com.prueba.tecnica.demo.services.PedidoDetalleService;

@Service
public class PedidoDetalleServiceImpl implements PedidoDetalleService{
	
	@Autowired
	private PedidoDetalleRepository pedidoDetalleRepository;

	@Override
	public PedidosDetalle pedidosDetalle(Integer idPedido) {
		return pedidoDetalleRepository.findByIdDetalle(idPedido);
	}

}
