package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter
@Table(name = "tbl_categoria")
public class Categoria {

	@Id
	@Column(name = "tb_categorias")
	@EqualsAndHashCode.Include
	private int idCategoria;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Override
	public String toString() {
		return descripcion;
	}
	
}
