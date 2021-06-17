package com.prueba.tecnica.demo.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.tecnica.demo.persistencia.entidades.PedidosDetalle;
import com.prueba.tecnica.demo.services.PedidoDetalleService;
import com.prueba.tecnica.demo.services.PedidoService;
import com.prueba.tecnica.demo.services.model.PedidoModel;

@RestController
@RequestMapping("/pedidos")
public class AplicacionController {

	@Autowired
	private PedidoDetalleService detalleService;
	
	@Autowired
	private PedidoService pedidoService;
	
	@GetMapping("/test")
	@ResponseBody
	public ResponseEntity<String> home(){
		return new ResponseEntity<String>("OK", HttpStatus.OK);
	}
	
	@PostMapping("/guardarPedido")
	@ResponseBody
	public ResponseEntity<String> guadarPedido(@RequestBody PedidoModel pedido){
		try{
			pedidoService.guardarPedido(pedido);
			return new ResponseEntity<String>("OK", HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<String>("Error", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/detallePedido/{idPedido}")
	@ResponseBody
	public ResponseEntity<PedidosDetalle> detallePedido(@PathVariable("idPedido") int idPedido){
		PedidosDetalle detalle = null;
		try{
			detalle = detalleService.pedidosDetalle(idPedido);
			return new ResponseEntity<PedidosDetalle>(detalle, HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<PedidosDetalle>(detalle, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
