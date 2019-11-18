package co.web.project.entity;

import java.sql.Date;

import javax.persistence.*;

@Entity// Anotaciones de String
@Table(name = "Solicitudes")//Nombre de la tabla de la BD
public class Solicitudes {
	//Atribbutos identicos de la tabla
		@Id
		@Column
		@GeneratedValue(strategy = GenerationType.IDENTITY) //Genera el Id
	    private Integer idSolicitud;
		@Column
		private Integer CodigoLaboratorio;
		@Column
		private Date HoraInicio;
		@Column
		private Date HoraFinal;
		@Column
		private Integer IdUsuario;
		
		
		public Integer getidSolicitud() {
			return idSolicitud;
		}
		public void setidSolicitud(Integer idSolicitud) {
			this.idSolicitud = idSolicitud;
		}
		public Integer getCodigoLaboratorio() {
			return CodigoLaboratorio;
		}
		public void setUsuario(Integer CodigoLaboratorio) {
			this.CodigoLaboratorio = CodigoLaboratorio;
		}
		public Date getHoraInicio() {
			return HoraInicio;
		}
		public void setHoraInicio(Date HoraInicio) {
			this.HoraInicio = HoraInicio;
		}
		public Date getHoraFinal() {
			return HoraFinal;
		}
		public void setHoraFinal(Date HoraFinal) {
			this.HoraFinal = HoraFinal;
		}
		public Integer getIdUsuario() {
			return IdUsuario;
		}
		public void setIdUsuario(Integer IdUsuario) {
			this.IdUsuario = IdUsuario;
		}
		public String toString() {
			return "Customer [idSolicitud=" + this.idSolicitud + ", CodigoLaboratorio=" + this.CodigoLaboratorio + ", HoraInicio=" + this.HoraInicio + ", HoraFinal=" + this.HoraFinal + ", IdUsuario=" + this.IdUsuario + "]";
		}
}
