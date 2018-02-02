package mx.com.buro.mc.dto;

import java.util.List;

import org.tempuri.dscargaremisionprov.ResponseDSCargaRemisionProv.Articulos;
import org.tempuri.dscargaremisionprov.ResponseDSCargaRemisionProv.Pedidos;
import org.tempuri.dscargaremisionprov.ResponseDSCargaRemisionProv.Pedimento;
import org.tempuri.dscargaremisionprov.ResponseDSCargaRemisionProv.Remision;

public class PieCamion {
	
	List<Remision> remision;
	List<Pedimento> pedimento;
	List<Pedidos> pedidos;
	List<Articulos> articulos;
	
	public List<Remision> getRemision() {
		return remision;
	}
	public void setRemision(List<Remision> remision) {
		this.remision = remision;
	}
	public List<Pedimento> getPedimento() {
		return pedimento;
	}
	public void setPedimento(List<Pedimento> pedimento) {
		this.pedimento = pedimento;
	}
	public List<Pedidos> getPedidos() {
		return pedidos;
	}
	public void setPedidos(List<Pedidos> pedidos) {
		this.pedidos = pedidos;
	}
	public List<Articulos> getArticulos() {
		return articulos;
	}
	public void setArticulos(List<Articulos> articulos) {
		this.articulos = articulos;
	}
}
