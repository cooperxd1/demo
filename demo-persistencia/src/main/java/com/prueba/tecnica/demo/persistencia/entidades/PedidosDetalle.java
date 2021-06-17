package com.prueba.tecnica.demo.persistencia.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PEDIDOS_DETALLE_W")
public class PedidosDetalle {

	@Id
	@Column(name = "id_detalle")
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idDetalle;

	@JoinColumn(name = "id_pedido")
	@ManyToOne(fetch = FetchType.EAGER)
	private Pedidos idPedido;

	private String sku;

	private Double amout;

	private Double price;

	public PedidosDetalle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getIdDetalle() {
		return idDetalle;
	}

	public void setId(Integer idDetalle) {
		this.idDetalle = idDetalle;
	}

	public Pedidos getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Pedidos idPedido) {
		this.idPedido = idPedido;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public Double getAmout() {
		return amout;
	}

	public void setAmout(Double amout) {
		this.amout = amout;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PedidosDetalle [idDetalle=").append(idDetalle).append(", idPedido=").append(idPedido)
				.append(", sku=").append(sku).append(", amout=").append(amout).append(", price=").append(price)
				.append("]");
		return builder.toString();
	}

}
