package com.prueba.tecnica.demo.services.impl;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.tecnica.demo.persistencia.entidades.Pedidos;
import com.prueba.tecnica.demo.persistencia.entidades.PedidosDetalle;
import com.prueba.tecnica.demo.persistencia.repositorios.PedidoDetalleRepository;
import com.prueba.tecnica.demo.persistencia.repositorios.PedidoRepository;
import com.prueba.tecnica.demo.services.PedidoService;
import com.prueba.tecnica.demo.services.model.PedidoModel;

@Service
public class PedidoServiceImpl implements PedidoService{

	@Autowired
	private PedidoRepository pedidoRepository;
	
	@Autowired
	private PedidoDetalleRepository pedidoDetalleRepository;

	@Override
	public void guardarPedido(PedidoModel pedidoModel) {
		Pedidos pedido = new Pedidos();
		pedido.setIdPedido( (int) (pedidoRepository.count() + 1) );
		pedido.setDateSale(LocalDateTime.now());
		pedido.setTotal(pedidoModel.getTotal());
		
		pedidoRepository.save(pedido);
		
		PedidosDetalle detalle = new PedidosDetalle();
		detalle.setId( (int) (pedidoDetalleRepository.count() + 1) );
		detalle.setIdPedido(pedido);
		detalle.setAmout(100.55);
		detalle.setPrice(100.0);
		detalle.setSku("abcd123");
		
		pedidoDetalleRepository.save(detalle);
	}
}
