package tributacao;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Promocao implements ReajusteTributavel{

	private BigDecimal valor;
	private LocalDate data;
	
	public Promocao(BigDecimal valor, LocalDate data) {
		super();
		this.valor = valor;
		this.data = data;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	@Override
	public BigDecimal valor() {
		// TODO Auto-generated method stub
		return valor;
	}
	@Override
	public LocalDate data() {
		// TODO Auto-generated method stub
		return data;
	}
	@Override
	public BigDecimal valorImpostoDeRenda() {
		// TODO Auto-generated method stub
		return new BigDecimal(0.1);
	}
}
