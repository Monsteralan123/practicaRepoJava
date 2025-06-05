package model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_productos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Solicitud {

	@Id
	@Column(name = "nro_solicitud")
	private int nro_solicitud;
	
	@Column(name = "estado")
	private String estado;
	
	@Column(name="archivo_adjunto")
	private String archivo;
	
	@Column(name="fecha_reg")
	private LocalDate fechaReg;
	
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_actividad", nullable = false)
    private Actividad actividad; 

}
