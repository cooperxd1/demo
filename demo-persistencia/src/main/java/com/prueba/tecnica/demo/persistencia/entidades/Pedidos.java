package com.prueba.tecnica.demo.persistencia.entidades;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "PEDIDOS_W")
public class Pedidos {

	@Id
	@Column(name = "id_pedido_w")
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPedido;

	private Double total;

	@Column(name = "date_sale")
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
	private LocalDateTime dateSale;

	public Pedidos() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Integer idPedido) {
		this.idPedido = idPedido;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public LocalDateTime getDateSale() {
		return dateSale;
	}

	public void setDateSale(LocalDateTime dateSale) {
		this.dateSale = dateSale;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pedidos [idPedido=").append(idPedido).append(", total=").append(total).append(", dateSale=")
				.append(dateSale).append("]");
		return builder.toString();
	}

}
