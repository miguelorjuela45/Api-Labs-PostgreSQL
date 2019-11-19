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
		private Integer UsuarioSolicita;
		@Column
		private Integer AuxliarAprueba;
		
		
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
		public Integer getUsuarioSolicita() {
			return UsuarioSolicita;
		}
		public void setUsuarioSolicita(Integer UsuarioSolicita) {
			this.UsuarioSolicita = UsuarioSolicita;
		}
		public Integer getAuxliarAprueba() {
			return AuxliarAprueba;
		}
		public void setAuxliarAprueba(Integer AuxliarAprueba) {
			this.AuxliarAprueba = AuxliarAprueba;
		}
		public String toString() {
			return "Customer [idSolicitud=" + this.idSolicitud + ", CodigoLaboratorio=" + this.CodigoLaboratorio + ", HoraInicio=" + this.HoraInicio + ", HoraFinal=" + this.HoraFinal + ", UsuarioSolicita=" + this.UsuarioSolicita + ", AuxiliarAprueba=" + this.AuxliarAprueba + "]";
		}
}
