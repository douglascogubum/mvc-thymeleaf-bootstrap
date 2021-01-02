package br.com.alura.mvc.mudi.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.alura.mvc.mudi.model.enums.StatusPedido;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Pedido {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String productName;
	private BigDecimal negociatedValue;
	private LocalDate deliveryDate;
	private String urlProduct;
	private String urlImage;
	private String description;	
	
	@Enumerated(EnumType.STRING)
	private StatusPedido status;
}
