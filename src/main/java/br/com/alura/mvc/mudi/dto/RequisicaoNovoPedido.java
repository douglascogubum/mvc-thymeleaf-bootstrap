package br.com.alura.mvc.mudi.dto;

import javax.validation.constraints.NotBlank;

import br.com.alura.mvc.mudi.model.Pedido;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequisicaoNovoPedido {
	
	@NotBlank
	private String productName;
	
	@NotBlank
	private String urlProduct;
	
	@NotBlank
	private String urlImage;
	private String description;
	
	public Pedido toPedido() {
		Pedido pedido = new Pedido();
		
		pedido.setProductName(productName);
		pedido.setUrlProduct(urlProduct);
		pedido.setUrlImage(urlImage);
		pedido.setDescription(description);
		
		return pedido;
	}
}
